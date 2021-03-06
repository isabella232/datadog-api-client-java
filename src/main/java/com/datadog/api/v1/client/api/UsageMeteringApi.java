package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;

import javax.ws.rs.core.GenericType;

import com.datadog.api.v1.client.model.APIErrorResponse;
import java.time.OffsetDateTime;
import com.datadog.api.v1.client.model.UsageAnalyzedLogsResponse;
import com.datadog.api.v1.client.model.UsageAttributionResponse;
import com.datadog.api.v1.client.model.UsageAttributionSort;
import com.datadog.api.v1.client.model.UsageBillableSummaryResponse;
import com.datadog.api.v1.client.model.UsageCustomReportsResponse;
import com.datadog.api.v1.client.model.UsageFargateResponse;
import com.datadog.api.v1.client.model.UsageHostsResponse;
import com.datadog.api.v1.client.model.UsageIncidentManagementResponse;
import com.datadog.api.v1.client.model.UsageIndexedSpansResponse;
import com.datadog.api.v1.client.model.UsageIngestedSpansResponse;
import com.datadog.api.v1.client.model.UsageLambdaResponse;
import com.datadog.api.v1.client.model.UsageLogsByIndexResponse;
import com.datadog.api.v1.client.model.UsageLogsResponse;
import com.datadog.api.v1.client.model.UsageNetworkFlowsResponse;
import com.datadog.api.v1.client.model.UsageNetworkHostsResponse;
import com.datadog.api.v1.client.model.UsageProfilingResponse;
import com.datadog.api.v1.client.model.UsageRumSessionsResponse;
import com.datadog.api.v1.client.model.UsageSNMPResponse;
import com.datadog.api.v1.client.model.UsageSort;
import com.datadog.api.v1.client.model.UsageSortDirection;
import com.datadog.api.v1.client.model.UsageSpecifiedCustomReportsResponse;
import com.datadog.api.v1.client.model.UsageSummaryResponse;
import com.datadog.api.v1.client.model.UsageSyntheticsAPIResponse;
import com.datadog.api.v1.client.model.UsageSyntheticsBrowserResponse;
import com.datadog.api.v1.client.model.UsageSyntheticsResponse;
import com.datadog.api.v1.client.model.UsageTimeseriesResponse;
import com.datadog.api.v1.client.model.UsageTopAvgMetricsResponse;
import com.datadog.api.v1.client.model.UsageTraceResponse;
import com.datadog.api.v1.client.model.UsageTracingWithoutLimitsResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UsageMeteringApi {
  private ApiClient apiClient;

  public UsageMeteringApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UsageMeteringApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API cilent
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API cilent
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }


private ApiResponse<UsageCustomReportsResponse> getDailyCustomReportsWithHttpInfo(Long pageSize, Long pageNumber, UsageSortDirection sortDir, UsageSort sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v1/daily_custom_reports";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_dir", sortDir));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getDailyCustomReports");

    
    
    
    final String[] localVarAccepts = {
      "application/json;datetime-format=rfc3339"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UsageCustomReportsResponse> localVarReturnType = new GenericType<UsageCustomReportsResponse>() {};

    return apiClient.invokeAPI("UsageMeteringApi.getDailyCustomReports", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetDailyCustomReportsRequest {
    private Long pageSize;
    private Long pageNumber;
    private UsageSortDirection sortDir;
    private UsageSort sort;

    private APIgetDailyCustomReportsRequest() {
    }

    /**
     * Set pageSize
     * @param pageSize The number of files to return in the response. &#x60;[default&#x3D;60]&#x60;. (optional)
     * @return APIgetDailyCustomReportsRequest
     */
    public APIgetDailyCustomReportsRequest pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber
     * @param pageNumber The identifier of the first page to return. This parameter is used for the pagination feature &#x60;[default&#x3D;0]&#x60;. (optional)
     * @return APIgetDailyCustomReportsRequest
     */
    public APIgetDailyCustomReportsRequest pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set sortDir
     * @param sortDir The direction to sort by: &#x60;[desc, asc]&#x60;. (optional, default to desc)
     * @return APIgetDailyCustomReportsRequest
     */
    public APIgetDailyCustomReportsRequest sortDir(UsageSortDirection sortDir) {
      this.sortDir = sortDir;
      return this;
    }

    /**
     * Set sort
     * @param sort The field to sort by: &#x60;[computed_on, size, start_date, end_date]&#x60;. (optional, default to start_date)
     * @return APIgetDailyCustomReportsRequest
     */
    public APIgetDailyCustomReportsRequest sort(UsageSort sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Execute getDailyCustomReports request
     * @return UsageCustomReportsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UsageCustomReportsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getDailyCustomReports request with HTTP info returned
     * @return ApiResponse&lt;UsageCustomReportsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<UsageCustomReportsResponse> executeWithHttpInfo() throws ApiException {
      return getDailyCustomReportsWithHttpInfo(pageSize, pageNumber, sortDir, sort);
    }
  }

  /**
   * Get the list of available daily custom reports
   * Get daily custom reports.
   * @return getDailyCustomReportsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetDailyCustomReportsRequest getDailyCustomReports() throws ApiException {
    String operationId = "getDailyCustomReports";
    if (apiClient.isUnstableOperationEnabled(operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    return new APIgetDailyCustomReportsRequest();
  }

private ApiResponse<UsageIncidentManagementResponse> getIncidentManagementWithHttpInfo(OffsetDateTime startHr, OffsetDateTime endHr) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getIncidentManagement");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/usage/incident-management";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getIncidentManagement");

    
    
    
    final String[] localVarAccepts = {
      "application/json;datetime-format=rfc3339"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UsageIncidentManagementResponse> localVarReturnType = new GenericType<UsageIncidentManagementResponse>() {};

    return apiClient.invokeAPI("UsageMeteringApi.getIncidentManagement", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetIncidentManagementRequest {
    private OffsetDateTime startHr;
    private OffsetDateTime endHr;

    private APIgetIncidentManagementRequest() {
    }

    /**
     * Set startHr
     * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage beginning at this hour. (required)
     * @return APIgetIncidentManagementRequest
     */
    public APIgetIncidentManagementRequest startHr(OffsetDateTime startHr) {
      this.startHr = startHr;
      return this;
    }

    /**
     * Set endHr
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage ending **before** this hour. (optional)
     * @return APIgetIncidentManagementRequest
     */
    public APIgetIncidentManagementRequest endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }

    /**
     * Execute getIncidentManagement request
     * @return UsageIncidentManagementResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UsageIncidentManagementResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getIncidentManagement request with HTTP info returned
     * @return ApiResponse&lt;UsageIncidentManagementResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<UsageIncidentManagementResponse> executeWithHttpInfo() throws ApiException {
      return getIncidentManagementWithHttpInfo(startHr, endHr);
    }
  }

  /**
   * Get hourly usage for incident management
   * Get hourly usage for incident management.
   * @return getIncidentManagementRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetIncidentManagementRequest getIncidentManagement() throws ApiException {
    return new APIgetIncidentManagementRequest();
  }

private ApiResponse<UsageIngestedSpansResponse> getIngestedSpansWithHttpInfo(OffsetDateTime startHr, OffsetDateTime endHr) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getIngestedSpans");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/usage/ingested-spans";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getIngestedSpans");

    
    
    
    final String[] localVarAccepts = {
      "application/json;datetime-format=rfc3339"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UsageIngestedSpansResponse> localVarReturnType = new GenericType<UsageIngestedSpansResponse>() {};

    return apiClient.invokeAPI("UsageMeteringApi.getIngestedSpans", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetIngestedSpansRequest {
    private OffsetDateTime startHr;
    private OffsetDateTime endHr;

    private APIgetIngestedSpansRequest() {
    }

    /**
     * Set startHr
     * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage beginning at this hour. (required)
     * @return APIgetIngestedSpansRequest
     */
    public APIgetIngestedSpansRequest startHr(OffsetDateTime startHr) {
      this.startHr = startHr;
      return this;
    }

    /**
     * Set endHr
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage ending **before** this hour. (optional)
     * @return APIgetIngestedSpansRequest
     */
    public APIgetIngestedSpansRequest endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }

    /**
     * Execute getIngestedSpans request
     * @return UsageIngestedSpansResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UsageIngestedSpansResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getIngestedSpans request with HTTP info returned
     * @return ApiResponse&lt;UsageIngestedSpansResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<UsageIngestedSpansResponse> executeWithHttpInfo() throws ApiException {
      return getIngestedSpansWithHttpInfo(startHr, endHr);
    }
  }

  /**
   * Get hourly usage for ingested spans
   * Get hourly usage for ingested spans.
   * @return getIngestedSpansRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetIngestedSpansRequest getIngestedSpans() throws ApiException {
    return new APIgetIngestedSpansRequest();
  }

private ApiResponse<UsageCustomReportsResponse> getMonthlyCustomReportsWithHttpInfo(Long pageSize, Long pageNumber, UsageSortDirection sortDir, UsageSort sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v1/monthly_custom_reports";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_dir", sortDir));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getMonthlyCustomReports");

    
    
    
    final String[] localVarAccepts = {
      "application/json;datetime-format=rfc3339"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UsageCustomReportsResponse> localVarReturnType = new GenericType<UsageCustomReportsResponse>() {};

    return apiClient.invokeAPI("UsageMeteringApi.getMonthlyCustomReports", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetMonthlyCustomReportsRequest {
    private Long pageSize;
    private Long pageNumber;
    private UsageSortDirection sortDir;
    private UsageSort sort;

    private APIgetMonthlyCustomReportsRequest() {
    }

    /**
     * Set pageSize
     * @param pageSize The number of files to return in the response &#x60;[default&#x3D;60].&#x60; (optional)
     * @return APIgetMonthlyCustomReportsRequest
     */
    public APIgetMonthlyCustomReportsRequest pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber
     * @param pageNumber The identifier of the first page to return. This parameter is used for the pagination feature &#x60;[default&#x3D;0]&#x60;. (optional)
     * @return APIgetMonthlyCustomReportsRequest
     */
    public APIgetMonthlyCustomReportsRequest pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set sortDir
     * @param sortDir The direction to sort by: &#x60;[desc, asc]&#x60;. (optional, default to desc)
     * @return APIgetMonthlyCustomReportsRequest
     */
    public APIgetMonthlyCustomReportsRequest sortDir(UsageSortDirection sortDir) {
      this.sortDir = sortDir;
      return this;
    }

    /**
     * Set sort
     * @param sort The field to sort by: &#x60;[computed_on, size, start_date, end_date]&#x60;. (optional, default to start_date)
     * @return APIgetMonthlyCustomReportsRequest
     */
    public APIgetMonthlyCustomReportsRequest sort(UsageSort sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Execute getMonthlyCustomReports request
     * @return UsageCustomReportsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UsageCustomReportsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getMonthlyCustomReports request with HTTP info returned
     * @return ApiResponse&lt;UsageCustomReportsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<UsageCustomReportsResponse> executeWithHttpInfo() throws ApiException {
      return getMonthlyCustomReportsWithHttpInfo(pageSize, pageNumber, sortDir, sort);
    }
  }

  /**
   * Get the list of available monthly custom reports
   * Get monthly custom reports.
   * @return getMonthlyCustomReportsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetMonthlyCustomReportsRequest getMonthlyCustomReports() throws ApiException {
    String operationId = "getMonthlyCustomReports";
    if (apiClient.isUnstableOperationEnabled(operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    return new APIgetMonthlyCustomReportsRequest();
  }

private ApiResponse<UsageSpecifiedCustomReportsResponse> getSpecifiedDailyCustomReportsWithHttpInfo(String reportId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'reportId' is set
    if (reportId == null) {
      throw new ApiException(400, "Missing the required parameter 'reportId' when calling getSpecifiedDailyCustomReports");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/daily_custom_reports/{report_id}"
      .replaceAll("\\{" + "report_id" + "\\}", apiClient.escapeString(reportId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getSpecifiedDailyCustomReports");

    
    
    
    final String[] localVarAccepts = {
      "application/json;datetime-format=rfc3339"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UsageSpecifiedCustomReportsResponse> localVarReturnType = new GenericType<UsageSpecifiedCustomReportsResponse>() {};

    return apiClient.invokeAPI("UsageMeteringApi.getSpecifiedDailyCustomReports", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetSpecifiedDailyCustomReportsRequest {
    private String reportId;

    private APIgetSpecifiedDailyCustomReportsRequest(String reportId) {
      this.reportId = reportId;
    }

    /**
     * Execute getSpecifiedDailyCustomReports request
     * @return UsageSpecifiedCustomReportsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UsageSpecifiedCustomReportsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getSpecifiedDailyCustomReports request with HTTP info returned
     * @return ApiResponse&lt;UsageSpecifiedCustomReportsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<UsageSpecifiedCustomReportsResponse> executeWithHttpInfo() throws ApiException {
      return getSpecifiedDailyCustomReportsWithHttpInfo(reportId);
    }
  }

  /**
   * Get specified daily custom reports
   * Get specified daily custom reports.
   * @param reportId The specified ID to search results for. (required)
   * @return getSpecifiedDailyCustomReportsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetSpecifiedDailyCustomReportsRequest getSpecifiedDailyCustomReports(String reportId) throws ApiException {
    String operationId = "getSpecifiedDailyCustomReports";
    if (apiClient.isUnstableOperationEnabled(operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    return new APIgetSpecifiedDailyCustomReportsRequest(reportId);
  }

private ApiResponse<UsageSpecifiedCustomReportsResponse> getSpecifiedMonthlyCustomReportsWithHttpInfo(String reportId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'reportId' is set
    if (reportId == null) {
      throw new ApiException(400, "Missing the required parameter 'reportId' when calling getSpecifiedMonthlyCustomReports");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/monthly_custom_reports/{report_id}"
      .replaceAll("\\{" + "report_id" + "\\}", apiClient.escapeString(reportId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getSpecifiedMonthlyCustomReports");

    
    
    
    final String[] localVarAccepts = {
      "application/json;datetime-format=rfc3339"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UsageSpecifiedCustomReportsResponse> localVarReturnType = new GenericType<UsageSpecifiedCustomReportsResponse>() {};

    return apiClient.invokeAPI("UsageMeteringApi.getSpecifiedMonthlyCustomReports", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetSpecifiedMonthlyCustomReportsRequest {
    private String reportId;

    private APIgetSpecifiedMonthlyCustomReportsRequest(String reportId) {
      this.reportId = reportId;
    }

    /**
     * Execute getSpecifiedMonthlyCustomReports request
     * @return UsageSpecifiedCustomReportsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UsageSpecifiedCustomReportsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getSpecifiedMonthlyCustomReports request with HTTP info returned
     * @return ApiResponse&lt;UsageSpecifiedCustomReportsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<UsageSpecifiedCustomReportsResponse> executeWithHttpInfo() throws ApiException {
      return getSpecifiedMonthlyCustomReportsWithHttpInfo(reportId);
    }
  }

  /**
   * Get specified monthly custom reports
   * Get specified monthly custom reports.
   * @param reportId The specified ID to search results for. (required)
   * @return getSpecifiedMonthlyCustomReportsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetSpecifiedMonthlyCustomReportsRequest getSpecifiedMonthlyCustomReports(String reportId) throws ApiException {
    String operationId = "getSpecifiedMonthlyCustomReports";
    if (apiClient.isUnstableOperationEnabled(operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    return new APIgetSpecifiedMonthlyCustomReportsRequest(reportId);
  }

private ApiResponse<UsageTracingWithoutLimitsResponse> getTracingWithoutLimitsWithHttpInfo(OffsetDateTime startHr, OffsetDateTime endHr) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getTracingWithoutLimits");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/usage/tracing-without-limits";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getTracingWithoutLimits");

    
    
    
    final String[] localVarAccepts = {
      "application/json;datetime-format=rfc3339"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UsageTracingWithoutLimitsResponse> localVarReturnType = new GenericType<UsageTracingWithoutLimitsResponse>() {};

    return apiClient.invokeAPI("UsageMeteringApi.getTracingWithoutLimits", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetTracingWithoutLimitsRequest {
    private OffsetDateTime startHr;
    private OffsetDateTime endHr;

    private APIgetTracingWithoutLimitsRequest() {
    }

    /**
     * Set startHr
     * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage beginning at this hour. (required)
     * @return APIgetTracingWithoutLimitsRequest
     */
    public APIgetTracingWithoutLimitsRequest startHr(OffsetDateTime startHr) {
      this.startHr = startHr;
      return this;
    }

    /**
     * Set endHr
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage ending **before** this hour. (optional)
     * @return APIgetTracingWithoutLimitsRequest
     */
    public APIgetTracingWithoutLimitsRequest endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }

    /**
     * Execute getTracingWithoutLimits request
     * @return UsageTracingWithoutLimitsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
       </table>
     * @deprecated
     */
    @Deprecated
    public UsageTracingWithoutLimitsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getTracingWithoutLimits request with HTTP info returned
     * @return ApiResponse&lt;UsageTracingWithoutLimitsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
       </table>
     * @deprecated
     */
    @Deprecated
    public ApiResponse<UsageTracingWithoutLimitsResponse> executeWithHttpInfo() throws ApiException {
      return getTracingWithoutLimitsWithHttpInfo(startHr, endHr);
    }
  }

  /**
   * Get hourly usage for tracing without limits
   * Get hourly usage for tracing without limits.  **Note** This endpoint has been renamed to &#x60;/api/v1/usage/ingested-spans&#x60;.
   * @return getTracingWithoutLimitsRequest
   * @throws ApiException if fails to make API call
   * @deprecated
   
   */
  @Deprecated
  public APIgetTracingWithoutLimitsRequest getTracingWithoutLimits() throws ApiException {
    return new APIgetTracingWithoutLimitsRequest();
  }

private ApiResponse<UsageAnalyzedLogsResponse> getUsageAnalyzedLogsWithHttpInfo(OffsetDateTime startHr, OffsetDateTime endHr) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageAnalyzedLogs");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/usage/analyzed_logs";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageAnalyzedLogs");

    
    
    
    final String[] localVarAccepts = {
      "application/json;datetime-format=rfc3339"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UsageAnalyzedLogsResponse> localVarReturnType = new GenericType<UsageAnalyzedLogsResponse>() {};

    return apiClient.invokeAPI("UsageMeteringApi.getUsageAnalyzedLogs", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetUsageAnalyzedLogsRequest {
    private OffsetDateTime startHr;
    private OffsetDateTime endHr;

    private APIgetUsageAnalyzedLogsRequest() {
    }

    /**
     * Set startHr
     * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage beginning at this hour. (required)
     * @return APIgetUsageAnalyzedLogsRequest
     */
    public APIgetUsageAnalyzedLogsRequest startHr(OffsetDateTime startHr) {
      this.startHr = startHr;
      return this;
    }

    /**
     * Set endHr
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage ending **before** this hour. (optional)
     * @return APIgetUsageAnalyzedLogsRequest
     */
    public APIgetUsageAnalyzedLogsRequest endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }

    /**
     * Execute getUsageAnalyzedLogs request
     * @return UsageAnalyzedLogsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UsageAnalyzedLogsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getUsageAnalyzedLogs request with HTTP info returned
     * @return ApiResponse&lt;UsageAnalyzedLogsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<UsageAnalyzedLogsResponse> executeWithHttpInfo() throws ApiException {
      return getUsageAnalyzedLogsWithHttpInfo(startHr, endHr);
    }
  }

  /**
   * Get hourly usage for analyzed logs
   * Get hourly usage for analyzed logs (Security Monitoring).
   * @return getUsageAnalyzedLogsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetUsageAnalyzedLogsRequest getUsageAnalyzedLogs() throws ApiException {
    return new APIgetUsageAnalyzedLogsRequest();
  }

private ApiResponse<UsageAttributionResponse> getUsageAttributionWithHttpInfo(OffsetDateTime startMonth, String fields, OffsetDateTime endMonth, UsageSortDirection sortDirection, UsageAttributionSort sortName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'startMonth' is set
    if (startMonth == null) {
      throw new ApiException(400, "Missing the required parameter 'startMonth' when calling getUsageAttribution");
    }
    
    // verify the required parameter 'fields' is set
    if (fields == null) {
      throw new ApiException(400, "Missing the required parameter 'fields' when calling getUsageAttribution");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/usage/attribution";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_month", startMonth));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fields", fields));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_month", endMonth));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_direction", sortDirection));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort_name", sortName));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageAttribution");

    
    
    
    final String[] localVarAccepts = {
      "application/json;datetime-format=rfc3339"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UsageAttributionResponse> localVarReturnType = new GenericType<UsageAttributionResponse>() {};

    return apiClient.invokeAPI("UsageMeteringApi.getUsageAttribution", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetUsageAttributionRequest {
    private OffsetDateTime startMonth;
    private String fields;
    private OffsetDateTime endMonth;
    private UsageSortDirection sortDirection;
    private UsageAttributionSort sortName;

    private APIgetUsageAttributionRequest() {
    }

    /**
     * Set startMonth
     * @param startMonth Datetime in ISO-8601 format, UTC, precise to month: &#x60;[YYYY-MM]&#x60; for usage beginning in this month. Maximum of 15 months ago. (required)
     * @return APIgetUsageAttributionRequest
     */
    public APIgetUsageAttributionRequest startMonth(OffsetDateTime startMonth) {
      this.startMonth = startMonth;
      return this;
    }

    /**
     * Set fields
     * @param fields The specified field to search results for. (required)
     * @return APIgetUsageAttributionRequest
     */
    public APIgetUsageAttributionRequest fields(String fields) {
      this.fields = fields;
      return this;
    }

    /**
     * Set endMonth
     * @param endMonth Datetime in ISO-8601 format, UTC, precise to month: &#x60;[YYYY-MM]&#x60; for usage ending this month. (optional)
     * @return APIgetUsageAttributionRequest
     */
    public APIgetUsageAttributionRequest endMonth(OffsetDateTime endMonth) {
      this.endMonth = endMonth;
      return this;
    }

    /**
     * Set sortDirection
     * @param sortDirection The direction to sort by: &#x60;[desc, asc]&#x60;. (optional, default to desc)
     * @return APIgetUsageAttributionRequest
     */
    public APIgetUsageAttributionRequest sortDirection(UsageSortDirection sortDirection) {
      this.sortDirection = sortDirection;
      return this;
    }

    /**
     * Set sortName
     * @param sortName The field to sort by. (optional, default to custom_timeseries_usage)
     * @return APIgetUsageAttributionRequest
     */
    public APIgetUsageAttributionRequest sortName(UsageAttributionSort sortName) {
      this.sortName = sortName;
      return this;
    }

    /**
     * Execute getUsageAttribution request
     * @return UsageAttributionResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UsageAttributionResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getUsageAttribution request with HTTP info returned
     * @return ApiResponse&lt;UsageAttributionResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<UsageAttributionResponse> executeWithHttpInfo() throws ApiException {
      return getUsageAttributionWithHttpInfo(startMonth, fields, endMonth, sortDirection, sortName);
    }
  }

  /**
   * Get Usage Attribution
   * Get Usage Attribution.
   * @return getUsageAttributionRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetUsageAttributionRequest getUsageAttribution() throws ApiException {
    String operationId = "getUsageAttribution";
    if (apiClient.isUnstableOperationEnabled(operationId)) {
      apiClient.getLogger().warning(String.format("Using unstable operation '%s'", operationId));
    } else {
      throw new ApiException(0, String.format("Unstable operation '%s' is disabled", operationId));
    }
    return new APIgetUsageAttributionRequest();
  }

private ApiResponse<UsageBillableSummaryResponse> getUsageBillableSummaryWithHttpInfo(OffsetDateTime month) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v1/usage/billable-summary";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "month", month));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageBillableSummary");

    
    
    
    final String[] localVarAccepts = {
      "application/json;datetime-format=rfc3339"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UsageBillableSummaryResponse> localVarReturnType = new GenericType<UsageBillableSummaryResponse>() {};

    return apiClient.invokeAPI("UsageMeteringApi.getUsageBillableSummary", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetUsageBillableSummaryRequest {
    private OffsetDateTime month;

    private APIgetUsageBillableSummaryRequest() {
    }

    /**
     * Set month
     * @param month Datetime in ISO-8601 format, UTC, precise to month: &#x60;[YYYY-MM]&#x60; for usage starting this month. (optional)
     * @return APIgetUsageBillableSummaryRequest
     */
    public APIgetUsageBillableSummaryRequest month(OffsetDateTime month) {
      this.month = month;
      return this;
    }

    /**
     * Execute getUsageBillableSummary request
     * @return UsageBillableSummaryResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UsageBillableSummaryResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getUsageBillableSummary request with HTTP info returned
     * @return ApiResponse&lt;UsageBillableSummaryResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<UsageBillableSummaryResponse> executeWithHttpInfo() throws ApiException {
      return getUsageBillableSummaryWithHttpInfo(month);
    }
  }

  /**
   * Get billable usage across your account
   * Get billable usage across your account.
   * @return getUsageBillableSummaryRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetUsageBillableSummaryRequest getUsageBillableSummary() throws ApiException {
    return new APIgetUsageBillableSummaryRequest();
  }

private ApiResponse<UsageFargateResponse> getUsageFargateWithHttpInfo(OffsetDateTime startHr, OffsetDateTime endHr) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageFargate");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/usage/fargate";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageFargate");

    
    
    
    final String[] localVarAccepts = {
      "application/json;datetime-format=rfc3339"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UsageFargateResponse> localVarReturnType = new GenericType<UsageFargateResponse>() {};

    return apiClient.invokeAPI("UsageMeteringApi.getUsageFargate", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetUsageFargateRequest {
    private OffsetDateTime startHr;
    private OffsetDateTime endHr;

    private APIgetUsageFargateRequest() {
    }

    /**
     * Set startHr
     * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
     * @return APIgetUsageFargateRequest
     */
    public APIgetUsageFargateRequest startHr(OffsetDateTime startHr) {
      this.startHr = startHr;
      return this;
    }

    /**
     * Set endHr
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending **before** this hour. (optional)
     * @return APIgetUsageFargateRequest
     */
    public APIgetUsageFargateRequest endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }

    /**
     * Execute getUsageFargate request
     * @return UsageFargateResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UsageFargateResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getUsageFargate request with HTTP info returned
     * @return ApiResponse&lt;UsageFargateResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<UsageFargateResponse> executeWithHttpInfo() throws ApiException {
      return getUsageFargateWithHttpInfo(startHr, endHr);
    }
  }

  /**
   * Get hourly usage for Fargate
   * Get hourly usage for [Fargate](https://docs.datadoghq.com/integrations/ecs_fargate/).
   * @return getUsageFargateRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetUsageFargateRequest getUsageFargate() throws ApiException {
    return new APIgetUsageFargateRequest();
  }

private ApiResponse<UsageHostsResponse> getUsageHostsWithHttpInfo(OffsetDateTime startHr, OffsetDateTime endHr) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageHosts");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/usage/hosts";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageHosts");

    
    
    
    final String[] localVarAccepts = {
      "application/json;datetime-format=rfc3339"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UsageHostsResponse> localVarReturnType = new GenericType<UsageHostsResponse>() {};

    return apiClient.invokeAPI("UsageMeteringApi.getUsageHosts", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetUsageHostsRequest {
    private OffsetDateTime startHr;
    private OffsetDateTime endHr;

    private APIgetUsageHostsRequest() {
    }

    /**
     * Set startHr
     * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
     * @return APIgetUsageHostsRequest
     */
    public APIgetUsageHostsRequest startHr(OffsetDateTime startHr) {
      this.startHr = startHr;
      return this;
    }

    /**
     * Set endHr
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending **before** this hour. (optional)
     * @return APIgetUsageHostsRequest
     */
    public APIgetUsageHostsRequest endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }

    /**
     * Execute getUsageHosts request
     * @return UsageHostsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UsageHostsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getUsageHosts request with HTTP info returned
     * @return ApiResponse&lt;UsageHostsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<UsageHostsResponse> executeWithHttpInfo() throws ApiException {
      return getUsageHostsWithHttpInfo(startHr, endHr);
    }
  }

  /**
   * Get hourly usage for hosts and containers
   * Get hourly usage for hosts and containers.
   * @return getUsageHostsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetUsageHostsRequest getUsageHosts() throws ApiException {
    return new APIgetUsageHostsRequest();
  }

private ApiResponse<UsageIndexedSpansResponse> getUsageIndexedSpansWithHttpInfo(OffsetDateTime startHr, OffsetDateTime endHr) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageIndexedSpans");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/usage/indexed-spans";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageIndexedSpans");

    
    
    
    final String[] localVarAccepts = {
      "application/json;datetime-format=rfc3339"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UsageIndexedSpansResponse> localVarReturnType = new GenericType<UsageIndexedSpansResponse>() {};

    return apiClient.invokeAPI("UsageMeteringApi.getUsageIndexedSpans", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetUsageIndexedSpansRequest {
    private OffsetDateTime startHr;
    private OffsetDateTime endHr;

    private APIgetUsageIndexedSpansRequest() {
    }

    /**
     * Set startHr
     * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage beginning at this hour. (required)
     * @return APIgetUsageIndexedSpansRequest
     */
    public APIgetUsageIndexedSpansRequest startHr(OffsetDateTime startHr) {
      this.startHr = startHr;
      return this;
    }

    /**
     * Set endHr
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage ending **before** this hour. (optional)
     * @return APIgetUsageIndexedSpansRequest
     */
    public APIgetUsageIndexedSpansRequest endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }

    /**
     * Execute getUsageIndexedSpans request
     * @return UsageIndexedSpansResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UsageIndexedSpansResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getUsageIndexedSpans request with HTTP info returned
     * @return ApiResponse&lt;UsageIndexedSpansResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<UsageIndexedSpansResponse> executeWithHttpInfo() throws ApiException {
      return getUsageIndexedSpansWithHttpInfo(startHr, endHr);
    }
  }

  /**
   * Get hourly usage for indexed spans
   * Get hourly usage for indexed spans.
   * @return getUsageIndexedSpansRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetUsageIndexedSpansRequest getUsageIndexedSpans() throws ApiException {
    return new APIgetUsageIndexedSpansRequest();
  }

private ApiResponse<UsageLambdaResponse> getUsageLambdaWithHttpInfo(OffsetDateTime startHr, OffsetDateTime endHr) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageLambda");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/usage/aws_lambda";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageLambda");

    
    
    
    final String[] localVarAccepts = {
      "application/json;datetime-format=rfc3339"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UsageLambdaResponse> localVarReturnType = new GenericType<UsageLambdaResponse>() {};

    return apiClient.invokeAPI("UsageMeteringApi.getUsageLambda", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetUsageLambdaRequest {
    private OffsetDateTime startHr;
    private OffsetDateTime endHr;

    private APIgetUsageLambdaRequest() {
    }

    /**
     * Set startHr
     * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
     * @return APIgetUsageLambdaRequest
     */
    public APIgetUsageLambdaRequest startHr(OffsetDateTime startHr) {
      this.startHr = startHr;
      return this;
    }

    /**
     * Set endHr
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending **before** this hour. (optional)
     * @return APIgetUsageLambdaRequest
     */
    public APIgetUsageLambdaRequest endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }

    /**
     * Execute getUsageLambda request
     * @return UsageLambdaResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UsageLambdaResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getUsageLambda request with HTTP info returned
     * @return ApiResponse&lt;UsageLambdaResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<UsageLambdaResponse> executeWithHttpInfo() throws ApiException {
      return getUsageLambdaWithHttpInfo(startHr, endHr);
    }
  }

  /**
   * Get hourly usage for Lambda
   * Get hourly usage for lambda.
   * @return getUsageLambdaRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetUsageLambdaRequest getUsageLambda() throws ApiException {
    return new APIgetUsageLambdaRequest();
  }

private ApiResponse<UsageLogsResponse> getUsageLogsWithHttpInfo(OffsetDateTime startHr, OffsetDateTime endHr) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageLogs");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/usage/logs";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageLogs");

    
    
    
    final String[] localVarAccepts = {
      "application/json;datetime-format=rfc3339"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UsageLogsResponse> localVarReturnType = new GenericType<UsageLogsResponse>() {};

    return apiClient.invokeAPI("UsageMeteringApi.getUsageLogs", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetUsageLogsRequest {
    private OffsetDateTime startHr;
    private OffsetDateTime endHr;

    private APIgetUsageLogsRequest() {
    }

    /**
     * Set startHr
     * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
     * @return APIgetUsageLogsRequest
     */
    public APIgetUsageLogsRequest startHr(OffsetDateTime startHr) {
      this.startHr = startHr;
      return this;
    }

    /**
     * Set endHr
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending **before** this hour. (optional)
     * @return APIgetUsageLogsRequest
     */
    public APIgetUsageLogsRequest endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }

    /**
     * Execute getUsageLogs request
     * @return UsageLogsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UsageLogsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getUsageLogs request with HTTP info returned
     * @return ApiResponse&lt;UsageLogsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<UsageLogsResponse> executeWithHttpInfo() throws ApiException {
      return getUsageLogsWithHttpInfo(startHr, endHr);
    }
  }

  /**
   * Get hourly usage for Logs
   * Get hourly usage for logs.
   * @return getUsageLogsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetUsageLogsRequest getUsageLogs() throws ApiException {
    return new APIgetUsageLogsRequest();
  }

private ApiResponse<UsageLogsByIndexResponse> getUsageLogsByIndexWithHttpInfo(OffsetDateTime startHr, OffsetDateTime endHr, List<String> indexName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageLogsByIndex");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/usage/logs_by_index";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "index_name", indexName));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageLogsByIndex");

    
    
    
    final String[] localVarAccepts = {
      "application/json;datetime-format=rfc3339"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UsageLogsByIndexResponse> localVarReturnType = new GenericType<UsageLogsByIndexResponse>() {};

    return apiClient.invokeAPI("UsageMeteringApi.getUsageLogsByIndex", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetUsageLogsByIndexRequest {
    private OffsetDateTime startHr;
    private OffsetDateTime endHr;
    private List<String> indexName;

    private APIgetUsageLogsByIndexRequest() {
    }

    /**
     * Set startHr
     * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
     * @return APIgetUsageLogsByIndexRequest
     */
    public APIgetUsageLogsByIndexRequest startHr(OffsetDateTime startHr) {
      this.startHr = startHr;
      return this;
    }

    /**
     * Set endHr
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending **before** this hour. (optional)
     * @return APIgetUsageLogsByIndexRequest
     */
    public APIgetUsageLogsByIndexRequest endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }

    /**
     * Set indexName
     * @param indexName Comma-separated list of log index names. (optional)
     * @return APIgetUsageLogsByIndexRequest
     */
    public APIgetUsageLogsByIndexRequest indexName(List<String> indexName) {
      this.indexName = indexName;
      return this;
    }

    /**
     * Execute getUsageLogsByIndex request
     * @return UsageLogsByIndexResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UsageLogsByIndexResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getUsageLogsByIndex request with HTTP info returned
     * @return ApiResponse&lt;UsageLogsByIndexResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<UsageLogsByIndexResponse> executeWithHttpInfo() throws ApiException {
      return getUsageLogsByIndexWithHttpInfo(startHr, endHr, indexName);
    }
  }

  /**
   * Get hourly usage for Logs by Index
   * Get hourly usage for logs by index.
   * @return getUsageLogsByIndexRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetUsageLogsByIndexRequest getUsageLogsByIndex() throws ApiException {
    return new APIgetUsageLogsByIndexRequest();
  }

private ApiResponse<UsageNetworkFlowsResponse> getUsageNetworkFlowsWithHttpInfo(OffsetDateTime startHr, OffsetDateTime endHr) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageNetworkFlows");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/usage/network_flows";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageNetworkFlows");

    
    
    
    final String[] localVarAccepts = {
      "application/json;datetime-format=rfc3339"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UsageNetworkFlowsResponse> localVarReturnType = new GenericType<UsageNetworkFlowsResponse>() {};

    return apiClient.invokeAPI("UsageMeteringApi.getUsageNetworkFlows", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetUsageNetworkFlowsRequest {
    private OffsetDateTime startHr;
    private OffsetDateTime endHr;

    private APIgetUsageNetworkFlowsRequest() {
    }

    /**
     * Set startHr
     * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage beginning at this hour. (required)
     * @return APIgetUsageNetworkFlowsRequest
     */
    public APIgetUsageNetworkFlowsRequest startHr(OffsetDateTime startHr) {
      this.startHr = startHr;
      return this;
    }

    /**
     * Set endHr
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage ending **before** this hour. (optional)
     * @return APIgetUsageNetworkFlowsRequest
     */
    public APIgetUsageNetworkFlowsRequest endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }

    /**
     * Execute getUsageNetworkFlows request
     * @return UsageNetworkFlowsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UsageNetworkFlowsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getUsageNetworkFlows request with HTTP info returned
     * @return ApiResponse&lt;UsageNetworkFlowsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<UsageNetworkFlowsResponse> executeWithHttpInfo() throws ApiException {
      return getUsageNetworkFlowsWithHttpInfo(startHr, endHr);
    }
  }

  /**
   * Get hourly usage for Network Flows
   * Get hourly usage for network flows.
   * @return getUsageNetworkFlowsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetUsageNetworkFlowsRequest getUsageNetworkFlows() throws ApiException {
    return new APIgetUsageNetworkFlowsRequest();
  }

private ApiResponse<UsageNetworkHostsResponse> getUsageNetworkHostsWithHttpInfo(OffsetDateTime startHr, OffsetDateTime endHr) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageNetworkHosts");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/usage/network_hosts";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageNetworkHosts");

    
    
    
    final String[] localVarAccepts = {
      "application/json;datetime-format=rfc3339"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UsageNetworkHostsResponse> localVarReturnType = new GenericType<UsageNetworkHostsResponse>() {};

    return apiClient.invokeAPI("UsageMeteringApi.getUsageNetworkHosts", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetUsageNetworkHostsRequest {
    private OffsetDateTime startHr;
    private OffsetDateTime endHr;

    private APIgetUsageNetworkHostsRequest() {
    }

    /**
     * Set startHr
     * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
     * @return APIgetUsageNetworkHostsRequest
     */
    public APIgetUsageNetworkHostsRequest startHr(OffsetDateTime startHr) {
      this.startHr = startHr;
      return this;
    }

    /**
     * Set endHr
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending **before** this hour. (optional)
     * @return APIgetUsageNetworkHostsRequest
     */
    public APIgetUsageNetworkHostsRequest endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }

    /**
     * Execute getUsageNetworkHosts request
     * @return UsageNetworkHostsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UsageNetworkHostsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getUsageNetworkHosts request with HTTP info returned
     * @return ApiResponse&lt;UsageNetworkHostsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<UsageNetworkHostsResponse> executeWithHttpInfo() throws ApiException {
      return getUsageNetworkHostsWithHttpInfo(startHr, endHr);
    }
  }

  /**
   * Get hourly usage for Network Hosts
   * Get hourly usage for network hosts.
   * @return getUsageNetworkHostsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetUsageNetworkHostsRequest getUsageNetworkHosts() throws ApiException {
    return new APIgetUsageNetworkHostsRequest();
  }

private ApiResponse<UsageProfilingResponse> getUsageProfilingWithHttpInfo(OffsetDateTime startHr, OffsetDateTime endHr) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageProfiling");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/usage/profiling";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageProfiling");

    
    
    
    final String[] localVarAccepts = {
      "application/json;datetime-format=rfc3339"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UsageProfilingResponse> localVarReturnType = new GenericType<UsageProfilingResponse>() {};

    return apiClient.invokeAPI("UsageMeteringApi.getUsageProfiling", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetUsageProfilingRequest {
    private OffsetDateTime startHr;
    private OffsetDateTime endHr;

    private APIgetUsageProfilingRequest() {
    }

    /**
     * Set startHr
     * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage beginning at this hour. (required)
     * @return APIgetUsageProfilingRequest
     */
    public APIgetUsageProfilingRequest startHr(OffsetDateTime startHr) {
      this.startHr = startHr;
      return this;
    }

    /**
     * Set endHr
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage ending **before** this hour. (optional)
     * @return APIgetUsageProfilingRequest
     */
    public APIgetUsageProfilingRequest endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }

    /**
     * Execute getUsageProfiling request
     * @return UsageProfilingResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UsageProfilingResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getUsageProfiling request with HTTP info returned
     * @return ApiResponse&lt;UsageProfilingResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<UsageProfilingResponse> executeWithHttpInfo() throws ApiException {
      return getUsageProfilingWithHttpInfo(startHr, endHr);
    }
  }

  /**
   * Get hourly usage for profiled hosts
   * Get hourly usage for profiled hosts.
   * @return getUsageProfilingRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetUsageProfilingRequest getUsageProfiling() throws ApiException {
    return new APIgetUsageProfilingRequest();
  }

private ApiResponse<UsageRumSessionsResponse> getUsageRumSessionsWithHttpInfo(OffsetDateTime startHr, OffsetDateTime endHr, String type) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageRumSessions");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/usage/rum_sessions";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageRumSessions");

    
    
    
    final String[] localVarAccepts = {
      "application/json;datetime-format=rfc3339"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UsageRumSessionsResponse> localVarReturnType = new GenericType<UsageRumSessionsResponse>() {};

    return apiClient.invokeAPI("UsageMeteringApi.getUsageRumSessions", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetUsageRumSessionsRequest {
    private OffsetDateTime startHr;
    private OffsetDateTime endHr;
    private String type;

    private APIgetUsageRumSessionsRequest() {
    }

    /**
     * Set startHr
     * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
     * @return APIgetUsageRumSessionsRequest
     */
    public APIgetUsageRumSessionsRequest startHr(OffsetDateTime startHr) {
      this.startHr = startHr;
      return this;
    }

    /**
     * Set endHr
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending **before** this hour. (optional)
     * @return APIgetUsageRumSessionsRequest
     */
    public APIgetUsageRumSessionsRequest endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }

    /**
     * Set type
     * @param type RUM type: &#x60;[browser, mobile]&#x60;. Defaults to &#x60;browser&#x60;. (optional)
     * @return APIgetUsageRumSessionsRequest
     */
    public APIgetUsageRumSessionsRequest type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Execute getUsageRumSessions request
     * @return UsageRumSessionsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UsageRumSessionsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getUsageRumSessions request with HTTP info returned
     * @return ApiResponse&lt;UsageRumSessionsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<UsageRumSessionsResponse> executeWithHttpInfo() throws ApiException {
      return getUsageRumSessionsWithHttpInfo(startHr, endHr, type);
    }
  }

  /**
   * Get hourly usage for RUM Sessions
   * Get hourly usage for [RUM](https://docs.datadoghq.com/real_user_monitoring/) Sessions.
   * @return getUsageRumSessionsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetUsageRumSessionsRequest getUsageRumSessions() throws ApiException {
    return new APIgetUsageRumSessionsRequest();
  }

private ApiResponse<UsageSNMPResponse> getUsageSNMPWithHttpInfo(OffsetDateTime startHr, OffsetDateTime endHr) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageSNMP");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/usage/snmp";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageSNMP");

    
    
    
    final String[] localVarAccepts = {
      "application/json;datetime-format=rfc3339"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UsageSNMPResponse> localVarReturnType = new GenericType<UsageSNMPResponse>() {};

    return apiClient.invokeAPI("UsageMeteringApi.getUsageSNMP", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetUsageSNMPRequest {
    private OffsetDateTime startHr;
    private OffsetDateTime endHr;

    private APIgetUsageSNMPRequest() {
    }

    /**
     * Set startHr
     * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage beginning at this hour. (required)
     * @return APIgetUsageSNMPRequest
     */
    public APIgetUsageSNMPRequest startHr(OffsetDateTime startHr) {
      this.startHr = startHr;
      return this;
    }

    /**
     * Set endHr
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: &#x60;[YYYY-MM-DDThh]&#x60; for usage ending **before** this hour. (optional)
     * @return APIgetUsageSNMPRequest
     */
    public APIgetUsageSNMPRequest endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }

    /**
     * Execute getUsageSNMP request
     * @return UsageSNMPResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UsageSNMPResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getUsageSNMP request with HTTP info returned
     * @return ApiResponse&lt;UsageSNMPResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<UsageSNMPResponse> executeWithHttpInfo() throws ApiException {
      return getUsageSNMPWithHttpInfo(startHr, endHr);
    }
  }

  /**
   * Get hourly usage for SNMP devices
   * Get hourly usage for SNMP devices.
   * @return getUsageSNMPRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetUsageSNMPRequest getUsageSNMP() throws ApiException {
    return new APIgetUsageSNMPRequest();
  }

private ApiResponse<UsageSummaryResponse> getUsageSummaryWithHttpInfo(OffsetDateTime startMonth, OffsetDateTime endMonth, Boolean includeOrgDetails) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'startMonth' is set
    if (startMonth == null) {
      throw new ApiException(400, "Missing the required parameter 'startMonth' when calling getUsageSummary");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/usage/summary";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_month", startMonth));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_month", endMonth));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_org_details", includeOrgDetails));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageSummary");

    
    
    
    final String[] localVarAccepts = {
      "application/json;datetime-format=rfc3339"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UsageSummaryResponse> localVarReturnType = new GenericType<UsageSummaryResponse>() {};

    return apiClient.invokeAPI("UsageMeteringApi.getUsageSummary", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetUsageSummaryRequest {
    private OffsetDateTime startMonth;
    private OffsetDateTime endMonth;
    private Boolean includeOrgDetails;

    private APIgetUsageSummaryRequest() {
    }

    /**
     * Set startMonth
     * @param startMonth Datetime in ISO-8601 format, UTC, precise to month: &#x60;[YYYY-MM]&#x60; for usage beginning in this month. Maximum of 15 months ago. (required)
     * @return APIgetUsageSummaryRequest
     */
    public APIgetUsageSummaryRequest startMonth(OffsetDateTime startMonth) {
      this.startMonth = startMonth;
      return this;
    }

    /**
     * Set endMonth
     * @param endMonth Datetime in ISO-8601 format, UTC, precise to month: &#x60;[YYYY-MM]&#x60; for usage ending this month. (optional)
     * @return APIgetUsageSummaryRequest
     */
    public APIgetUsageSummaryRequest endMonth(OffsetDateTime endMonth) {
      this.endMonth = endMonth;
      return this;
    }

    /**
     * Set includeOrgDetails
     * @param includeOrgDetails Include usage summaries for each sub-org. (optional)
     * @return APIgetUsageSummaryRequest
     */
    public APIgetUsageSummaryRequest includeOrgDetails(Boolean includeOrgDetails) {
      this.includeOrgDetails = includeOrgDetails;
      return this;
    }

    /**
     * Execute getUsageSummary request
     * @return UsageSummaryResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UsageSummaryResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getUsageSummary request with HTTP info returned
     * @return ApiResponse&lt;UsageSummaryResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<UsageSummaryResponse> executeWithHttpInfo() throws ApiException {
      return getUsageSummaryWithHttpInfo(startMonth, endMonth, includeOrgDetails);
    }
  }

  /**
   * Get usage across your multi-org account
   * Get usage across your multi-org account. You must have the multi-org feature enabled.
   * @return getUsageSummaryRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetUsageSummaryRequest getUsageSummary() throws ApiException {
    return new APIgetUsageSummaryRequest();
  }

private ApiResponse<UsageSyntheticsResponse> getUsageSyntheticsWithHttpInfo(OffsetDateTime startHr, OffsetDateTime endHr) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageSynthetics");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/usage/synthetics";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageSynthetics");

    
    
    
    final String[] localVarAccepts = {
      "application/json;datetime-format=rfc3339"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UsageSyntheticsResponse> localVarReturnType = new GenericType<UsageSyntheticsResponse>() {};

    return apiClient.invokeAPI("UsageMeteringApi.getUsageSynthetics", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetUsageSyntheticsRequest {
    private OffsetDateTime startHr;
    private OffsetDateTime endHr;

    private APIgetUsageSyntheticsRequest() {
    }

    /**
     * Set startHr
     * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
     * @return APIgetUsageSyntheticsRequest
     */
    public APIgetUsageSyntheticsRequest startHr(OffsetDateTime startHr) {
      this.startHr = startHr;
      return this;
    }

    /**
     * Set endHr
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending **before** this hour. (optional)
     * @return APIgetUsageSyntheticsRequest
     */
    public APIgetUsageSyntheticsRequest endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }

    /**
     * Execute getUsageSynthetics request
     * @return UsageSyntheticsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
       </table>
     * @deprecated
     */
    @Deprecated
    public UsageSyntheticsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getUsageSynthetics request with HTTP info returned
     * @return ApiResponse&lt;UsageSyntheticsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
       </table>
     * @deprecated
     */
    @Deprecated
    public ApiResponse<UsageSyntheticsResponse> executeWithHttpInfo() throws ApiException {
      return getUsageSyntheticsWithHttpInfo(startHr, endHr);
    }
  }

  /**
   * Get hourly usage for Synthetics Checks
   * Get hourly usage for [Synthetics checks](https://docs.datadoghq.com/synthetics/).
   * @return getUsageSyntheticsRequest
   * @throws ApiException if fails to make API call
   * @deprecated
   
   */
  @Deprecated
  public APIgetUsageSyntheticsRequest getUsageSynthetics() throws ApiException {
    return new APIgetUsageSyntheticsRequest();
  }

private ApiResponse<UsageSyntheticsAPIResponse> getUsageSyntheticsAPIWithHttpInfo(OffsetDateTime startHr, OffsetDateTime endHr) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageSyntheticsAPI");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/usage/synthetics_api";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageSyntheticsAPI");

    
    
    
    final String[] localVarAccepts = {
      "application/json;datetime-format=rfc3339"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UsageSyntheticsAPIResponse> localVarReturnType = new GenericType<UsageSyntheticsAPIResponse>() {};

    return apiClient.invokeAPI("UsageMeteringApi.getUsageSyntheticsAPI", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetUsageSyntheticsAPIRequest {
    private OffsetDateTime startHr;
    private OffsetDateTime endHr;

    private APIgetUsageSyntheticsAPIRequest() {
    }

    /**
     * Set startHr
     * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
     * @return APIgetUsageSyntheticsAPIRequest
     */
    public APIgetUsageSyntheticsAPIRequest startHr(OffsetDateTime startHr) {
      this.startHr = startHr;
      return this;
    }

    /**
     * Set endHr
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending **before** this hour. (optional)
     * @return APIgetUsageSyntheticsAPIRequest
     */
    public APIgetUsageSyntheticsAPIRequest endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }

    /**
     * Execute getUsageSyntheticsAPI request
     * @return UsageSyntheticsAPIResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UsageSyntheticsAPIResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getUsageSyntheticsAPI request with HTTP info returned
     * @return ApiResponse&lt;UsageSyntheticsAPIResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<UsageSyntheticsAPIResponse> executeWithHttpInfo() throws ApiException {
      return getUsageSyntheticsAPIWithHttpInfo(startHr, endHr);
    }
  }

  /**
   * Get hourly usage for Synthetics API Checks
   * Get hourly usage for [synthetics API checks](https://docs.datadoghq.com/synthetics/).
   * @return getUsageSyntheticsAPIRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetUsageSyntheticsAPIRequest getUsageSyntheticsAPI() throws ApiException {
    return new APIgetUsageSyntheticsAPIRequest();
  }

private ApiResponse<UsageSyntheticsBrowserResponse> getUsageSyntheticsBrowserWithHttpInfo(OffsetDateTime startHr, OffsetDateTime endHr) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageSyntheticsBrowser");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/usage/synthetics_browser";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageSyntheticsBrowser");

    
    
    
    final String[] localVarAccepts = {
      "application/json;datetime-format=rfc3339"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UsageSyntheticsBrowserResponse> localVarReturnType = new GenericType<UsageSyntheticsBrowserResponse>() {};

    return apiClient.invokeAPI("UsageMeteringApi.getUsageSyntheticsBrowser", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetUsageSyntheticsBrowserRequest {
    private OffsetDateTime startHr;
    private OffsetDateTime endHr;

    private APIgetUsageSyntheticsBrowserRequest() {
    }

    /**
     * Set startHr
     * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
     * @return APIgetUsageSyntheticsBrowserRequest
     */
    public APIgetUsageSyntheticsBrowserRequest startHr(OffsetDateTime startHr) {
      this.startHr = startHr;
      return this;
    }

    /**
     * Set endHr
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending **before** this hour. (optional)
     * @return APIgetUsageSyntheticsBrowserRequest
     */
    public APIgetUsageSyntheticsBrowserRequest endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }

    /**
     * Execute getUsageSyntheticsBrowser request
     * @return UsageSyntheticsBrowserResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UsageSyntheticsBrowserResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getUsageSyntheticsBrowser request with HTTP info returned
     * @return ApiResponse&lt;UsageSyntheticsBrowserResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<UsageSyntheticsBrowserResponse> executeWithHttpInfo() throws ApiException {
      return getUsageSyntheticsBrowserWithHttpInfo(startHr, endHr);
    }
  }

  /**
   * Get hourly usage for Synthetics Browser Checks
   * Get hourly usage for synthetics browser checks.
   * @return getUsageSyntheticsBrowserRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetUsageSyntheticsBrowserRequest getUsageSyntheticsBrowser() throws ApiException {
    return new APIgetUsageSyntheticsBrowserRequest();
  }

private ApiResponse<UsageTimeseriesResponse> getUsageTimeseriesWithHttpInfo(OffsetDateTime startHr, OffsetDateTime endHr) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageTimeseries");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/usage/timeseries";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageTimeseries");

    
    
    
    final String[] localVarAccepts = {
      "application/json;datetime-format=rfc3339"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UsageTimeseriesResponse> localVarReturnType = new GenericType<UsageTimeseriesResponse>() {};

    return apiClient.invokeAPI("UsageMeteringApi.getUsageTimeseries", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetUsageTimeseriesRequest {
    private OffsetDateTime startHr;
    private OffsetDateTime endHr;

    private APIgetUsageTimeseriesRequest() {
    }

    /**
     * Set startHr
     * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
     * @return APIgetUsageTimeseriesRequest
     */
    public APIgetUsageTimeseriesRequest startHr(OffsetDateTime startHr) {
      this.startHr = startHr;
      return this;
    }

    /**
     * Set endHr
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending **before** this hour. (optional)
     * @return APIgetUsageTimeseriesRequest
     */
    public APIgetUsageTimeseriesRequest endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }

    /**
     * Execute getUsageTimeseries request
     * @return UsageTimeseriesResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UsageTimeseriesResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getUsageTimeseries request with HTTP info returned
     * @return ApiResponse&lt;UsageTimeseriesResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<UsageTimeseriesResponse> executeWithHttpInfo() throws ApiException {
      return getUsageTimeseriesWithHttpInfo(startHr, endHr);
    }
  }

  /**
   * Get hourly usage for custom metrics
   * Get hourly usage for [custom metrics](https://docs.datadoghq.com/developers/metrics/custom_metrics/).
   * @return getUsageTimeseriesRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetUsageTimeseriesRequest getUsageTimeseries() throws ApiException {
    return new APIgetUsageTimeseriesRequest();
  }

private ApiResponse<UsageTopAvgMetricsResponse> getUsageTopAvgMetricsWithHttpInfo(OffsetDateTime month, List<String> names, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'month' is set
    if (month == null) {
      throw new ApiException(400, "Missing the required parameter 'month' when calling getUsageTopAvgMetrics");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/usage/top_avg_metrics";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "month", month));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "names", names));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageTopAvgMetrics");

    
    
    
    final String[] localVarAccepts = {
      "application/json;datetime-format=rfc3339"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UsageTopAvgMetricsResponse> localVarReturnType = new GenericType<UsageTopAvgMetricsResponse>() {};

    return apiClient.invokeAPI("UsageMeteringApi.getUsageTopAvgMetrics", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetUsageTopAvgMetricsRequest {
    private OffsetDateTime month;
    private List<String> names;
    private Integer limit;

    private APIgetUsageTopAvgMetricsRequest() {
    }

    /**
     * Set month
     * @param month Datetime in ISO-8601 format, UTC, precise to month: [YYYY-MM] for usage beginning at this hour. (required)
     * @return APIgetUsageTopAvgMetricsRequest
     */
    public APIgetUsageTopAvgMetricsRequest month(OffsetDateTime month) {
      this.month = month;
      return this;
    }

    /**
     * Set names
     * @param names Comma-separated list of metric names. (optional)
     * @return APIgetUsageTopAvgMetricsRequest
     */
    public APIgetUsageTopAvgMetricsRequest names(List<String> names) {
      this.names = names;
      return this;
    }

    /**
     * Set limit
     * @param limit Maximum number of results to return (between 1 and 5000) - defaults to 500 results if limit not specified. (optional, default to 500)
     * @return APIgetUsageTopAvgMetricsRequest
     */
    public APIgetUsageTopAvgMetricsRequest limit(Integer limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Execute getUsageTopAvgMetrics request
     * @return UsageTopAvgMetricsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
       </table>
     
     */
    
    public UsageTopAvgMetricsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getUsageTopAvgMetrics request with HTTP info returned
     * @return ApiResponse&lt;UsageTopAvgMetricsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<UsageTopAvgMetricsResponse> executeWithHttpInfo() throws ApiException {
      return getUsageTopAvgMetricsWithHttpInfo(month, names, limit);
    }
  }

  /**
   * Get top custom metrics by hourly average
   * Get top [custom metrics](https://docs.datadoghq.com/developers/metrics/custom_metrics/) by hourly average.
   * @return getUsageTopAvgMetricsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetUsageTopAvgMetricsRequest getUsageTopAvgMetrics() throws ApiException {
    return new APIgetUsageTopAvgMetricsRequest();
  }

private ApiResponse<UsageTraceResponse> getUsageTraceWithHttpInfo(OffsetDateTime startHr, OffsetDateTime endHr) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'startHr' is set
    if (startHr == null) {
      throw new ApiException(400, "Missing the required parameter 'startHr' when calling getUsageTrace");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/usage/traces";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_hr", startHr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_hr", endHr));

    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "getUsageTrace");

    
    
    
    final String[] localVarAccepts = {
      "application/json;datetime-format=rfc3339"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<UsageTraceResponse> localVarReturnType = new GenericType<UsageTraceResponse>() {};

    return apiClient.invokeAPI("UsageMeteringApi.getUsageTrace", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetUsageTraceRequest {
    private OffsetDateTime startHr;
    private OffsetDateTime endHr;

    private APIgetUsageTraceRequest() {
    }

    /**
     * Set startHr
     * @param startHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage beginning at this hour. (required)
     * @return APIgetUsageTraceRequest
     */
    public APIgetUsageTraceRequest startHr(OffsetDateTime startHr) {
      this.startHr = startHr;
      return this;
    }

    /**
     * Set endHr
     * @param endHr Datetime in ISO-8601 format, UTC, precise to hour: [YYYY-MM-DDThh] for usage ending **before** this hour. (optional)
     * @return APIgetUsageTraceRequest
     */
    public APIgetUsageTraceRequest endHr(OffsetDateTime endHr) {
      this.endHr = endHr;
      return this;
    }

    /**
     * Execute getUsageTrace request
     * @return UsageTraceResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
       </table>
     * @deprecated
     */
    @Deprecated
    public UsageTraceResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getUsageTrace request with HTTP info returned
     * @return ApiResponse&lt;UsageTraceResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden - User is not authorized </td><td>  -  </td></tr>
       </table>
     * @deprecated
     */
    @Deprecated
    public ApiResponse<UsageTraceResponse> executeWithHttpInfo() throws ApiException {
      return getUsageTraceWithHttpInfo(startHr, endHr);
    }
  }

  /**
   * Get hourly usage for Trace Search
   * Get hourly usage for trace search.  **Note** This endpoint has been renamed to &#x60;/api/v1/usage/indexed-spans&#x60;.
   * @return getUsageTraceRequest
   * @throws ApiException if fails to make API call
   * @deprecated
   
   */
  @Deprecated
  public APIgetUsageTraceRequest getUsageTrace() throws ApiException {
    return new APIgetUsageTraceRequest();
  }
}
