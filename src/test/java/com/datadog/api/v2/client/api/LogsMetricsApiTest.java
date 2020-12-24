/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v2.client.api;

import com.datadog.api.v2.client.*;
import com.datadog.api.v2.client.auth.*;
import com.datadog.api.v2.client.model.APIErrorResponse;
import com.datadog.api.v2.client.model.LogsMetricCreateRequest;
import com.datadog.api.v2.client.model.LogsMetricResponse;
import com.datadog.api.v2.client.model.LogsMetricUpdateRequest;
import com.datadog.api.v2.client.model.LogsMetricsResponse;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LogsMetricsApi
 */
public class LogsMetricsApiTest {

    private final LogsMetricsApi api = new LogsMetricsApi();

    /**
     * Create a log-based metric
     *
     * Create a metric based on your ingested logs in your organization. Returns the log-based metric object from the request body when the request is successful.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createLogsMetricTest() throws ApiException {
        //LogsMetricCreateRequest body = null;
        //LogsMetricResponse response = api.createLogsMetric()
        //        .body(body)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Delete a log-based metric
     *
     * Delete a specific log-based metric from your organization.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteLogsMetricTest() throws ApiException {
        //String metricId = null;
        //api.deleteLogsMetric(metricId)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Get a log-based metric
     *
     * Get a specific log-based metric from your organization.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLogsMetricTest() throws ApiException {
        //String metricId = null;
        //LogsMetricResponse response = api.getLogsMetric(metricId)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Get all log-based metrics
     *
     * Get the list of configured log-based metrics with their definitions.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listLogsMetricsTest() throws ApiException {
        //LogsMetricsResponse response = api.listLogsMetrics()
        //        .execute();
        // TODO: test validations
    }

    /**
     * Update a log-based metric
     *
     * Update a specific log-based metric from your organization. Returns the log-based metric object from the request body when the request is successful.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateLogsMetricTest() throws ApiException {
        //String metricId = null;
        //LogsMetricUpdateRequest body = null;
        //LogsMetricResponse response = api.updateLogsMetric(metricId)
        //        .body(body)
        //        .execute();
        // TODO: test validations
    }

}