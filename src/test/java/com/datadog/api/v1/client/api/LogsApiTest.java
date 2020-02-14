/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.model.APIErrorResponse;
import com.datadog.api.v1.client.model.HTTPLog;
import com.datadog.api.v1.client.model.HTTPLogError;
import com.datadog.api.v1.client.model.Log;
import com.datadog.api.v1.client.model.LogsIndexListResponse;
import com.datadog.api.v1.client.model.LogsListRequest;
import com.datadog.api.v1.client.model.LogsListRequestTime;
import com.datadog.api.v1.client.model.LogsListResponse;
import com.datadog.api.v1.client.model.LogsSort;
import com.datadog.api.v1.client.TestUtils;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.BeforeClass;
import org.junit.Test;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LogsApi
 */
public class LogsApiTest  extends V1ApiTest {

    private static LogsApi api;

    @BeforeClass
    public static void initAPI() {
        api = new LogsApi(generalApiClient);
    }

    /**
     * Get a list of logs
     *
     * ## Overview List endpoint returns logs that match a log search query. [Results are paginated][1]. **If you are thinking about archiving logs for your organization, consider using Datadog archive capabilities instead of the log list API. See [Datadog Logs Archive documentation][2].** **ARGUMENTS**: * **&#x60;query&#x60;** [*required*]:     The search query - following the [Log search syntax][3] .  * **&#x60;time.from&#x60;** [*required*]:     Minimum timestamp for requested logs. Format can be either      - an ISO-8601 string      - a unix timestamp (number representing the elapsed millisec since epoch)      - a relative time (&#x60;now -10m&#x60;, &#x60;now - 1h&#x60;, &#x60;now - 1d&#x60;)  * **&#x60;time.to&#x60;** [*required*]:     Maximum timestamp for requested logs. Format can be either      - an ISO-8601 string with minute, second or millisecond precision      - a unix timestamp (number representing the elapsed millisec since epoch)      - a relative time (&#x60;now&#x60;, &#x60;now -10m&#x60;, &#x60;now - 1h&#x60;, &#x60;now - 1d&#x60;)  * **&#x60;time.timezone&#x60;** [*optional*, *default*&#x3D;**None**]:   Can be specified both as an offset (e.g. \&quot;UTC+03:00\&quot;) or a regional zone (e.g. \&quot;Europe/Paris\&quot;)  * **&#x60;time.offset&#x60;** [*optional*, *default*&#x3D;**None**]:   Equivalent to &#x60;time.timezone&#x60;. But value in seconds.   If both timezone and offset are specified, timezone is ignored.  * **&#x60;startAt&#x60;** [*optional*, *default*&#x3D;**None**]:   Hash identifier of the first log to return in the list, available in a log &#x60;id&#x60; attribute. This parameter is used for the [pagination feature][1].   **Note**: this parameter is ignored if the corresponding log is out of the scope of the specified time window.  * **&#x60;sort&#x60;** [*optional*, *default*&#x3D;**desc**]:     Time-ascending &#x60;asc&#x60; or time-descending &#x60;desc&#x60;results.  * **&#x60;limit&#x60;** [*optional*, *default*&#x3D;**10**]:     Number of logs return in the response (maximum is 1000)  * **&#x60;index&#x60;** [*optional*, *default*&#x3D;**main**]:     For multi-index organizations, the log index in which the request is performed.  [1]: /logs/guide/collect-multiple-logs-with-pagination [2]: https://docs.datadoghq.com/logs/archives [3]: https://docs.datadoghq.com/logs/explorer/search/#search-syntax
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listLogsTest() throws ApiException {
        HTTPLog body = new HTTPLog()
            .ddsource("source")
            .ddtags("tags")
            .hostname("datadog-api-client-java-test")
            .message("testing message");
        Object response = api.sendLog()
                .body(body)
                .execute();
    }

    /**
     *
     *
     * Send logs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sendLogTest() throws ApiException, TestUtils.RetryException {
        OffsetDateTime now = OffsetDateTime.now();
        long nowNano = now.toEpochSecond() * 1000000 + now.getNano();
        String source = String.format("go-client-test-%d", nowNano);
        String message = String.format("test-log-list-%d", nowNano);
        String hostname = String.format("datadog-api-client-java-test-%d", nowNano);

        HTTPLog httpLog = new HTTPLog()
            .ddsource(source)
            .ddtags("java,test,list")
            .hostname(hostname)
            .message(String.format("{\"timestamp\": %d, \"message\": \"%s\"}", (now.toEpochSecond() - 1) * 1000, message));

        api.sendLog().body(httpLog).execute();

        String secondMessage = "second-" + message;
        httpLog.setMessage(String.format("{\"timestamp\": %d, \"message\": \"%s\"}", now.toEpochSecond() * 1000, secondMessage));

        api.sendLog().body(httpLog).execute();

        final LogsListRequest request = new LogsListRequest()
            .query(String.format("source:%s", source))
            .time(new LogsListRequestTime()
                .from(now.minusHours(1))
                .to(now.plusHours(1)))
            .limit(2)
            .sort(LogsSort.TIME_ASCENDING);

        // Make sure that both log items are indexed
        TestUtils.retry(5, 10, () -> {
            try {
                LogsListResponse response = api.listLogs().body(request).execute();
                return 2 == response.getLogs().size();
            } catch(ApiException e) {
                return false;
            }
        });

        LogsListResponse logsResponse;

        // Find first log item
        LogsListRequest logsRequest = request.limit(1);
        logsResponse = api.listLogs().body(logsRequest).execute();
        assertEquals(1, logsResponse.getLogs().size());

        Log log = logsResponse.getLogs().get(0);
        assertEquals(hostname, log.getContent().getHost());
        assertEquals(message, log.getContent().getMessage());

        // Find second log item
        assertNotNull(logsResponse.getNextLogId());

        logsRequest = logsRequest.startAt(logsResponse.getNextLogId());
        logsResponse = api.listLogs().body(logsRequest).execute();
        assertEquals(1, logsResponse.getLogs().size());

        log = logsResponse.getLogs().get(0);
        assertEquals(hostname, log.getContent().getHost());
        assertEquals(secondMessage, log.getContent().getMessage());
    }

}