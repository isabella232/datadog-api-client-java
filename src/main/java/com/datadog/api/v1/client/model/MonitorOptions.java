/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v1.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.datadog.api.v1.client.model.MonitorDeviceID;
import com.datadog.api.v1.client.model.MonitorOptionsAggregation;
import com.datadog.api.v1.client.model.MonitorThresholdWindowOptions;
import com.datadog.api.v1.client.model.MonitorThresholds;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * MonitorOptions
 */
@JsonPropertyOrder({
  MonitorOptions.JSON_PROPERTY_AGGREGATION,
  MonitorOptions.JSON_PROPERTY_DEVICE_IDS,
  MonitorOptions.JSON_PROPERTY_ENABLE_LOGS_SAMPLE,
  MonitorOptions.JSON_PROPERTY_ESCALATION_MESSAGE,
  MonitorOptions.JSON_PROPERTY_EVALUATION_DELAY,
  MonitorOptions.JSON_PROPERTY_INCLUDE_TAGS,
  MonitorOptions.JSON_PROPERTY_LOCKED,
  MonitorOptions.JSON_PROPERTY_MIN_FAILURE_DURATION,
  MonitorOptions.JSON_PROPERTY_MIN_LOCATION_FAILED,
  MonitorOptions.JSON_PROPERTY_NEW_HOST_DELAY,
  MonitorOptions.JSON_PROPERTY_NO_DATA_TIMEFRAME,
  MonitorOptions.JSON_PROPERTY_NOTIFY_AUDIT,
  MonitorOptions.JSON_PROPERTY_NOTIFY_NO_DATA,
  MonitorOptions.JSON_PROPERTY_RENOTIFY_INTERVAL,
  MonitorOptions.JSON_PROPERTY_REQUIRE_FULL_WINDOW,
  MonitorOptions.JSON_PROPERTY_SILENCED,
  MonitorOptions.JSON_PROPERTY_SYNTHETICS_CHECK_ID,
  MonitorOptions.JSON_PROPERTY_THRESHOLD_WINDOWS,
  MonitorOptions.JSON_PROPERTY_THRESHOLDS,
  MonitorOptions.JSON_PROPERTY_TIMEOUT_H
})

public class MonitorOptions {
  public static final String JSON_PROPERTY_AGGREGATION = "aggregation";
  private MonitorOptionsAggregation aggregation;

  public static final String JSON_PROPERTY_DEVICE_IDS = "device_ids";
  private List<MonitorDeviceID> deviceIds = null;

  public static final String JSON_PROPERTY_ENABLE_LOGS_SAMPLE = "enable_logs_sample";
  private Boolean enableLogsSample;

  public static final String JSON_PROPERTY_ESCALATION_MESSAGE = "escalation_message";
  private String escalationMessage;

  public static final String JSON_PROPERTY_EVALUATION_DELAY = "evaluation_delay";
  private Long evaluationDelay;

  public static final String JSON_PROPERTY_INCLUDE_TAGS = "include_tags";
  private Boolean includeTags;

  public static final String JSON_PROPERTY_LOCKED = "locked";
  private Boolean locked;

  public static final String JSON_PROPERTY_MIN_FAILURE_DURATION = "min_failure_duration";
  private Long minFailureDuration;

  public static final String JSON_PROPERTY_MIN_LOCATION_FAILED = "min_location_failed";
  private Long minLocationFailed;

  public static final String JSON_PROPERTY_NEW_HOST_DELAY = "new_host_delay";
  private Long newHostDelay;

  public static final String JSON_PROPERTY_NO_DATA_TIMEFRAME = "no_data_timeframe";
  private Long noDataTimeframe;

  public static final String JSON_PROPERTY_NOTIFY_AUDIT = "notify_audit";
  private Boolean notifyAudit;

  public static final String JSON_PROPERTY_NOTIFY_NO_DATA = "notify_no_data";
  private Boolean notifyNoData;

  public static final String JSON_PROPERTY_RENOTIFY_INTERVAL = "renotify_interval";
  private Long renotifyInterval;

  public static final String JSON_PROPERTY_REQUIRE_FULL_WINDOW = "require_full_window";
  private Boolean requireFullWindow;

  public static final String JSON_PROPERTY_SILENCED = "silenced";
  private Map<String, Long> silenced = null;

  public static final String JSON_PROPERTY_SYNTHETICS_CHECK_ID = "synthetics_check_id";
  private Long syntheticsCheckId;

  public static final String JSON_PROPERTY_THRESHOLD_WINDOWS = "threshold_windows";
  private MonitorThresholdWindowOptions thresholdWindows;

  public static final String JSON_PROPERTY_THRESHOLDS = "thresholds";
  private MonitorThresholds thresholds;

  public static final String JSON_PROPERTY_TIMEOUT_H = "timeout_h";
  private Long timeoutH;


  public MonitorOptions aggregation(MonitorOptionsAggregation aggregation) {
    
    this.aggregation = aggregation;
    return this;
  }

   /**
   * Get aggregation
   * @return aggregation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AGGREGATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MonitorOptionsAggregation getAggregation() {
    return aggregation;
  }


  public void setAggregation(MonitorOptionsAggregation aggregation) {
    this.aggregation = aggregation;
  }


  public MonitorOptions deviceIds(List<MonitorDeviceID> deviceIds) {
    
    this.deviceIds = deviceIds;
    return this;
  }

  public MonitorOptions addDeviceIdsItem(MonitorDeviceID deviceIdsItem) {
    if (this.deviceIds == null) {
      this.deviceIds = new ArrayList<>();
    }
    this.deviceIds.add(deviceIdsItem);
    return this;
  }

   /**
   * Get deviceIds
   * @return deviceIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEVICE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<MonitorDeviceID> getDeviceIds() {
    return deviceIds;
  }


  public void setDeviceIds(List<MonitorDeviceID> deviceIds) {
    this.deviceIds = deviceIds;
  }


  public MonitorOptions enableLogsSample(Boolean enableLogsSample) {
    
    this.enableLogsSample = enableLogsSample;
    return this;
  }

   /**
   * Get enableLogsSample
   * @return enableLogsSample
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENABLE_LOGS_SAMPLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnableLogsSample() {
    return enableLogsSample;
  }


  public void setEnableLogsSample(Boolean enableLogsSample) {
    this.enableLogsSample = enableLogsSample;
  }


  public MonitorOptions escalationMessage(String escalationMessage) {
    
    this.escalationMessage = escalationMessage;
    return this;
  }

   /**
   * Get escalationMessage
   * @return escalationMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ESCALATION_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEscalationMessage() {
    return escalationMessage;
  }


  public void setEscalationMessage(String escalationMessage) {
    this.escalationMessage = escalationMessage;
  }


  public MonitorOptions evaluationDelay(Long evaluationDelay) {
    
    this.evaluationDelay = evaluationDelay;
    return this;
  }

   /**
   * Get evaluationDelay
   * @return evaluationDelay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EVALUATION_DELAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getEvaluationDelay() {
    return evaluationDelay;
  }


  public void setEvaluationDelay(Long evaluationDelay) {
    this.evaluationDelay = evaluationDelay;
  }


  public MonitorOptions includeTags(Boolean includeTags) {
    
    this.includeTags = includeTags;
    return this;
  }

   /**
   * Get includeTags
   * @return includeTags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INCLUDE_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIncludeTags() {
    return includeTags;
  }


  public void setIncludeTags(Boolean includeTags) {
    this.includeTags = includeTags;
  }


  public MonitorOptions locked(Boolean locked) {
    
    this.locked = locked;
    return this;
  }

   /**
   * Get locked
   * @return locked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOCKED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getLocked() {
    return locked;
  }


  public void setLocked(Boolean locked) {
    this.locked = locked;
  }


  public MonitorOptions minFailureDuration(Long minFailureDuration) {
    
    this.minFailureDuration = minFailureDuration;
    return this;
  }

   /**
   * Get minFailureDuration
   * minimum: 0
   * maximum: 7200
   * @return minFailureDuration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MIN_FAILURE_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMinFailureDuration() {
    return minFailureDuration;
  }


  public void setMinFailureDuration(Long minFailureDuration) {
    this.minFailureDuration = minFailureDuration;
  }


  public MonitorOptions minLocationFailed(Long minLocationFailed) {
    
    this.minLocationFailed = minLocationFailed;
    return this;
  }

   /**
   * Get minLocationFailed
   * @return minLocationFailed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MIN_LOCATION_FAILED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMinLocationFailed() {
    return minLocationFailed;
  }


  public void setMinLocationFailed(Long minLocationFailed) {
    this.minLocationFailed = minLocationFailed;
  }


  public MonitorOptions newHostDelay(Long newHostDelay) {
    
    this.newHostDelay = newHostDelay;
    return this;
  }

   /**
   * Get newHostDelay
   * @return newHostDelay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NEW_HOST_DELAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getNewHostDelay() {
    return newHostDelay;
  }


  public void setNewHostDelay(Long newHostDelay) {
    this.newHostDelay = newHostDelay;
  }


  public MonitorOptions noDataTimeframe(Long noDataTimeframe) {
    
    this.noDataTimeframe = noDataTimeframe;
    return this;
  }

   /**
   * Get noDataTimeframe
   * @return noDataTimeframe
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NO_DATA_TIMEFRAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getNoDataTimeframe() {
    return noDataTimeframe;
  }


  public void setNoDataTimeframe(Long noDataTimeframe) {
    this.noDataTimeframe = noDataTimeframe;
  }


  public MonitorOptions notifyAudit(Boolean notifyAudit) {
    
    this.notifyAudit = notifyAudit;
    return this;
  }

   /**
   * Get notifyAudit
   * @return notifyAudit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NOTIFY_AUDIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getNotifyAudit() {
    return notifyAudit;
  }


  public void setNotifyAudit(Boolean notifyAudit) {
    this.notifyAudit = notifyAudit;
  }


  public MonitorOptions notifyNoData(Boolean notifyNoData) {
    
    this.notifyNoData = notifyNoData;
    return this;
  }

   /**
   * Get notifyNoData
   * @return notifyNoData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NOTIFY_NO_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getNotifyNoData() {
    return notifyNoData;
  }


  public void setNotifyNoData(Boolean notifyNoData) {
    this.notifyNoData = notifyNoData;
  }


  public MonitorOptions renotifyInterval(Long renotifyInterval) {
    
    this.renotifyInterval = renotifyInterval;
    return this;
  }

   /**
   * Get renotifyInterval
   * @return renotifyInterval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RENOTIFY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getRenotifyInterval() {
    return renotifyInterval;
  }


  public void setRenotifyInterval(Long renotifyInterval) {
    this.renotifyInterval = renotifyInterval;
  }


  public MonitorOptions requireFullWindow(Boolean requireFullWindow) {
    
    this.requireFullWindow = requireFullWindow;
    return this;
  }

   /**
   * Get requireFullWindow
   * @return requireFullWindow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REQUIRE_FULL_WINDOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRequireFullWindow() {
    return requireFullWindow;
  }


  public void setRequireFullWindow(Boolean requireFullWindow) {
    this.requireFullWindow = requireFullWindow;
  }


  public MonitorOptions silenced(Map<String, Long> silenced) {
    
    this.silenced = silenced;
    return this;
  }

  public MonitorOptions putSilencedItem(String key, Long silencedItem) {
    if (this.silenced == null) {
      this.silenced = new HashMap<>();
    }
    this.silenced.put(key, silencedItem);
    return this;
  }

   /**
   * Get silenced
   * @return silenced
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SILENCED)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Long> getSilenced() {
    return silenced;
  }


  public void setSilenced(Map<String, Long> silenced) {
    this.silenced = silenced;
  }


  public MonitorOptions syntheticsCheckId(Long syntheticsCheckId) {
    
    this.syntheticsCheckId = syntheticsCheckId;
    return this;
  }

   /**
   * Get syntheticsCheckId
   * @return syntheticsCheckId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SYNTHETICS_CHECK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSyntheticsCheckId() {
    return syntheticsCheckId;
  }


  public void setSyntheticsCheckId(Long syntheticsCheckId) {
    this.syntheticsCheckId = syntheticsCheckId;
  }


  public MonitorOptions thresholdWindows(MonitorThresholdWindowOptions thresholdWindows) {
    
    this.thresholdWindows = thresholdWindows;
    return this;
  }

   /**
   * Get thresholdWindows
   * @return thresholdWindows
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_THRESHOLD_WINDOWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MonitorThresholdWindowOptions getThresholdWindows() {
    return thresholdWindows;
  }


  public void setThresholdWindows(MonitorThresholdWindowOptions thresholdWindows) {
    this.thresholdWindows = thresholdWindows;
  }


  public MonitorOptions thresholds(MonitorThresholds thresholds) {
    
    this.thresholds = thresholds;
    return this;
  }

   /**
   * Get thresholds
   * @return thresholds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_THRESHOLDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MonitorThresholds getThresholds() {
    return thresholds;
  }


  public void setThresholds(MonitorThresholds thresholds) {
    this.thresholds = thresholds;
  }


  public MonitorOptions timeoutH(Long timeoutH) {
    
    this.timeoutH = timeoutH;
    return this;
  }

   /**
   * Get timeoutH
   * @return timeoutH
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TIMEOUT_H)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTimeoutH() {
    return timeoutH;
  }


  public void setTimeoutH(Long timeoutH) {
    this.timeoutH = timeoutH;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorOptions monitorOptions = (MonitorOptions) o;
    return Objects.equals(this.aggregation, monitorOptions.aggregation) &&
        Objects.equals(this.deviceIds, monitorOptions.deviceIds) &&
        Objects.equals(this.enableLogsSample, monitorOptions.enableLogsSample) &&
        Objects.equals(this.escalationMessage, monitorOptions.escalationMessage) &&
        Objects.equals(this.evaluationDelay, monitorOptions.evaluationDelay) &&
        Objects.equals(this.includeTags, monitorOptions.includeTags) &&
        Objects.equals(this.locked, monitorOptions.locked) &&
        Objects.equals(this.minFailureDuration, monitorOptions.minFailureDuration) &&
        Objects.equals(this.minLocationFailed, monitorOptions.minLocationFailed) &&
        Objects.equals(this.newHostDelay, monitorOptions.newHostDelay) &&
        Objects.equals(this.noDataTimeframe, monitorOptions.noDataTimeframe) &&
        Objects.equals(this.notifyAudit, monitorOptions.notifyAudit) &&
        Objects.equals(this.notifyNoData, monitorOptions.notifyNoData) &&
        Objects.equals(this.renotifyInterval, monitorOptions.renotifyInterval) &&
        Objects.equals(this.requireFullWindow, monitorOptions.requireFullWindow) &&
        Objects.equals(this.silenced, monitorOptions.silenced) &&
        Objects.equals(this.syntheticsCheckId, monitorOptions.syntheticsCheckId) &&
        Objects.equals(this.thresholdWindows, monitorOptions.thresholdWindows) &&
        Objects.equals(this.thresholds, monitorOptions.thresholds) &&
        Objects.equals(this.timeoutH, monitorOptions.timeoutH);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregation, deviceIds, enableLogsSample, escalationMessage, evaluationDelay, includeTags, locked, minFailureDuration, minLocationFailed, newHostDelay, noDataTimeframe, notifyAudit, notifyNoData, renotifyInterval, requireFullWindow, silenced, syntheticsCheckId, thresholdWindows, thresholds, timeoutH);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorOptions {\n");
    sb.append("    aggregation: ").append(toIndentedString(aggregation)).append("\n");
    sb.append("    deviceIds: ").append(toIndentedString(deviceIds)).append("\n");
    sb.append("    enableLogsSample: ").append(toIndentedString(enableLogsSample)).append("\n");
    sb.append("    escalationMessage: ").append(toIndentedString(escalationMessage)).append("\n");
    sb.append("    evaluationDelay: ").append(toIndentedString(evaluationDelay)).append("\n");
    sb.append("    includeTags: ").append(toIndentedString(includeTags)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    minFailureDuration: ").append(toIndentedString(minFailureDuration)).append("\n");
    sb.append("    minLocationFailed: ").append(toIndentedString(minLocationFailed)).append("\n");
    sb.append("    newHostDelay: ").append(toIndentedString(newHostDelay)).append("\n");
    sb.append("    noDataTimeframe: ").append(toIndentedString(noDataTimeframe)).append("\n");
    sb.append("    notifyAudit: ").append(toIndentedString(notifyAudit)).append("\n");
    sb.append("    notifyNoData: ").append(toIndentedString(notifyNoData)).append("\n");
    sb.append("    renotifyInterval: ").append(toIndentedString(renotifyInterval)).append("\n");
    sb.append("    requireFullWindow: ").append(toIndentedString(requireFullWindow)).append("\n");
    sb.append("    silenced: ").append(toIndentedString(silenced)).append("\n");
    sb.append("    syntheticsCheckId: ").append(toIndentedString(syntheticsCheckId)).append("\n");
    sb.append("    thresholdWindows: ").append(toIndentedString(thresholdWindows)).append("\n");
    sb.append("    thresholds: ").append(toIndentedString(thresholds)).append("\n");
    sb.append("    timeoutH: ").append(toIndentedString(timeoutH)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

