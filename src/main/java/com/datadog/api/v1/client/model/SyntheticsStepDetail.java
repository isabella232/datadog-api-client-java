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
import com.datadog.api.v1.client.model.SyntheticsBrowserError;
import com.datadog.api.v1.client.model.SyntheticsCheckType;
import com.datadog.api.v1.client.model.SyntheticsPlayingTab;
import com.datadog.api.v1.client.model.SyntheticsResource;
import com.datadog.api.v1.client.model.SyntheticsStepDetailWarnings;
import com.datadog.api.v1.client.model.SyntheticsStepType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * SyntheticsStepDetail
 */
@JsonPropertyOrder({
  SyntheticsStepDetail.JSON_PROPERTY_BROWSER_ERRORS,
  SyntheticsStepDetail.JSON_PROPERTY_CHECK_TYPE,
  SyntheticsStepDetail.JSON_PROPERTY_DESCRIPTION,
  SyntheticsStepDetail.JSON_PROPERTY_DURATION,
  SyntheticsStepDetail.JSON_PROPERTY_ERROR,
  SyntheticsStepDetail.JSON_PROPERTY_PLAYING_TAB,
  SyntheticsStepDetail.JSON_PROPERTY_RESOURCES,
  SyntheticsStepDetail.JSON_PROPERTY_SCREENSHOT_BUCKET_KEY,
  SyntheticsStepDetail.JSON_PROPERTY_SKIPPED,
  SyntheticsStepDetail.JSON_PROPERTY_SNAPSHOT_BUCKET_KEY,
  SyntheticsStepDetail.JSON_PROPERTY_STEP_ID,
  SyntheticsStepDetail.JSON_PROPERTY_SUB_TEST_STEP_DETAILS,
  SyntheticsStepDetail.JSON_PROPERTY_TIME_TO_INTERACTIVE,
  SyntheticsStepDetail.JSON_PROPERTY_TYPE,
  SyntheticsStepDetail.JSON_PROPERTY_URL,
  SyntheticsStepDetail.JSON_PROPERTY_VALUE,
  SyntheticsStepDetail.JSON_PROPERTY_WARNINGS
})

public class SyntheticsStepDetail {
  public static final String JSON_PROPERTY_BROWSER_ERRORS = "browserErrors";
  private List<SyntheticsBrowserError> browserErrors = null;

  public static final String JSON_PROPERTY_CHECK_TYPE = "checkType";
  private SyntheticsCheckType checkType;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private Double duration;

  public static final String JSON_PROPERTY_ERROR = "error";
  private String error;

  public static final String JSON_PROPERTY_PLAYING_TAB = "playingTab";
  private SyntheticsPlayingTab playingTab;

  public static final String JSON_PROPERTY_RESOURCES = "resources";
  private List<SyntheticsResource> resources = null;

  public static final String JSON_PROPERTY_SCREENSHOT_BUCKET_KEY = "screenshotBucketKey";
  private Boolean screenshotBucketKey;

  public static final String JSON_PROPERTY_SKIPPED = "skipped";
  private Boolean skipped;

  public static final String JSON_PROPERTY_SNAPSHOT_BUCKET_KEY = "snapshotBucketKey";
  private Boolean snapshotBucketKey;

  public static final String JSON_PROPERTY_STEP_ID = "stepId";
  private Long stepId;

  public static final String JSON_PROPERTY_SUB_TEST_STEP_DETAILS = "subTestStepDetails";
  private List<SyntheticsStepDetail> subTestStepDetails = null;

  public static final String JSON_PROPERTY_TIME_TO_INTERACTIVE = "timeToInteractive";
  private Double timeToInteractive;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SyntheticsStepType type;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_VALUE = "value";
  private Object value;

  public static final String JSON_PROPERTY_WARNINGS = "warnings";
  private List<SyntheticsStepDetailWarnings> warnings = null;


  public SyntheticsStepDetail browserErrors(List<SyntheticsBrowserError> browserErrors) {
    
    this.browserErrors = browserErrors;
    return this;
  }

  public SyntheticsStepDetail addBrowserErrorsItem(SyntheticsBrowserError browserErrorsItem) {
    if (this.browserErrors == null) {
      this.browserErrors = new ArrayList<>();
    }
    this.browserErrors.add(browserErrorsItem);
    return this;
  }

   /**
   * Get browserErrors
   * @return browserErrors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BROWSER_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SyntheticsBrowserError> getBrowserErrors() {
    return browserErrors;
  }


  public void setBrowserErrors(List<SyntheticsBrowserError> browserErrors) {
    this.browserErrors = browserErrors;
  }


  public SyntheticsStepDetail checkType(SyntheticsCheckType checkType) {
    
    this.checkType = checkType;
    return this;
  }

   /**
   * Get checkType
   * @return checkType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CHECK_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SyntheticsCheckType getCheckType() {
    return checkType;
  }


  public void setCheckType(SyntheticsCheckType checkType) {
    this.checkType = checkType;
  }


  public SyntheticsStepDetail description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public SyntheticsStepDetail duration(Double duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getDuration() {
    return duration;
  }


  public void setDuration(Double duration) {
    this.duration = duration;
  }


  public SyntheticsStepDetail error(String error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getError() {
    return error;
  }


  public void setError(String error) {
    this.error = error;
  }


  public SyntheticsStepDetail playingTab(SyntheticsPlayingTab playingTab) {
    
    this.playingTab = playingTab;
    return this;
  }

   /**
   * Get playingTab
   * @return playingTab
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PLAYING_TAB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SyntheticsPlayingTab getPlayingTab() {
    return playingTab;
  }


  public void setPlayingTab(SyntheticsPlayingTab playingTab) {
    this.playingTab = playingTab;
  }


  public SyntheticsStepDetail resources(List<SyntheticsResource> resources) {
    
    this.resources = resources;
    return this;
  }

  public SyntheticsStepDetail addResourcesItem(SyntheticsResource resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

   /**
   * Get resources
   * @return resources
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RESOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SyntheticsResource> getResources() {
    return resources;
  }


  public void setResources(List<SyntheticsResource> resources) {
    this.resources = resources;
  }


  public SyntheticsStepDetail screenshotBucketKey(Boolean screenshotBucketKey) {
    
    this.screenshotBucketKey = screenshotBucketKey;
    return this;
  }

   /**
   * Get screenshotBucketKey
   * @return screenshotBucketKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SCREENSHOT_BUCKET_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getScreenshotBucketKey() {
    return screenshotBucketKey;
  }


  public void setScreenshotBucketKey(Boolean screenshotBucketKey) {
    this.screenshotBucketKey = screenshotBucketKey;
  }


  public SyntheticsStepDetail skipped(Boolean skipped) {
    
    this.skipped = skipped;
    return this;
  }

   /**
   * Get skipped
   * @return skipped
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SKIPPED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSkipped() {
    return skipped;
  }


  public void setSkipped(Boolean skipped) {
    this.skipped = skipped;
  }


  public SyntheticsStepDetail snapshotBucketKey(Boolean snapshotBucketKey) {
    
    this.snapshotBucketKey = snapshotBucketKey;
    return this;
  }

   /**
   * Get snapshotBucketKey
   * @return snapshotBucketKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SNAPSHOT_BUCKET_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSnapshotBucketKey() {
    return snapshotBucketKey;
  }


  public void setSnapshotBucketKey(Boolean snapshotBucketKey) {
    this.snapshotBucketKey = snapshotBucketKey;
  }


  public SyntheticsStepDetail stepId(Long stepId) {
    
    this.stepId = stepId;
    return this;
  }

   /**
   * Get stepId
   * @return stepId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STEP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getStepId() {
    return stepId;
  }


  public void setStepId(Long stepId) {
    this.stepId = stepId;
  }


  public SyntheticsStepDetail subTestStepDetails(List<SyntheticsStepDetail> subTestStepDetails) {
    
    this.subTestStepDetails = subTestStepDetails;
    return this;
  }

  public SyntheticsStepDetail addSubTestStepDetailsItem(SyntheticsStepDetail subTestStepDetailsItem) {
    if (this.subTestStepDetails == null) {
      this.subTestStepDetails = new ArrayList<>();
    }
    this.subTestStepDetails.add(subTestStepDetailsItem);
    return this;
  }

   /**
   * Get subTestStepDetails
   * @return subTestStepDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUB_TEST_STEP_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SyntheticsStepDetail> getSubTestStepDetails() {
    return subTestStepDetails;
  }


  public void setSubTestStepDetails(List<SyntheticsStepDetail> subTestStepDetails) {
    this.subTestStepDetails = subTestStepDetails;
  }


  public SyntheticsStepDetail timeToInteractive(Double timeToInteractive) {
    
    this.timeToInteractive = timeToInteractive;
    return this;
  }

   /**
   * Get timeToInteractive
   * @return timeToInteractive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TIME_TO_INTERACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getTimeToInteractive() {
    return timeToInteractive;
  }


  public void setTimeToInteractive(Double timeToInteractive) {
    this.timeToInteractive = timeToInteractive;
  }


  public SyntheticsStepDetail type(SyntheticsStepType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SyntheticsStepType getType() {
    return type;
  }


  public void setType(SyntheticsStepType type) {
    this.type = type;
  }


  public SyntheticsStepDetail url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public SyntheticsStepDetail value(Object value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getValue() {
    return value;
  }


  public void setValue(Object value) {
    this.value = value;
  }


  public SyntheticsStepDetail warnings(List<SyntheticsStepDetailWarnings> warnings) {
    
    this.warnings = warnings;
    return this;
  }

  public SyntheticsStepDetail addWarningsItem(SyntheticsStepDetailWarnings warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

   /**
   * Get warnings
   * @return warnings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SyntheticsStepDetailWarnings> getWarnings() {
    return warnings;
  }


  public void setWarnings(List<SyntheticsStepDetailWarnings> warnings) {
    this.warnings = warnings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsStepDetail syntheticsStepDetail = (SyntheticsStepDetail) o;
    return Objects.equals(this.browserErrors, syntheticsStepDetail.browserErrors) &&
        Objects.equals(this.checkType, syntheticsStepDetail.checkType) &&
        Objects.equals(this.description, syntheticsStepDetail.description) &&
        Objects.equals(this.duration, syntheticsStepDetail.duration) &&
        Objects.equals(this.error, syntheticsStepDetail.error) &&
        Objects.equals(this.playingTab, syntheticsStepDetail.playingTab) &&
        Objects.equals(this.resources, syntheticsStepDetail.resources) &&
        Objects.equals(this.screenshotBucketKey, syntheticsStepDetail.screenshotBucketKey) &&
        Objects.equals(this.skipped, syntheticsStepDetail.skipped) &&
        Objects.equals(this.snapshotBucketKey, syntheticsStepDetail.snapshotBucketKey) &&
        Objects.equals(this.stepId, syntheticsStepDetail.stepId) &&
        Objects.equals(this.subTestStepDetails, syntheticsStepDetail.subTestStepDetails) &&
        Objects.equals(this.timeToInteractive, syntheticsStepDetail.timeToInteractive) &&
        Objects.equals(this.type, syntheticsStepDetail.type) &&
        Objects.equals(this.url, syntheticsStepDetail.url) &&
        Objects.equals(this.value, syntheticsStepDetail.value) &&
        Objects.equals(this.warnings, syntheticsStepDetail.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(browserErrors, checkType, description, duration, error, playingTab, resources, screenshotBucketKey, skipped, snapshotBucketKey, stepId, subTestStepDetails, timeToInteractive, type, url, value, warnings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsStepDetail {\n");
    sb.append("    browserErrors: ").append(toIndentedString(browserErrors)).append("\n");
    sb.append("    checkType: ").append(toIndentedString(checkType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    playingTab: ").append(toIndentedString(playingTab)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    screenshotBucketKey: ").append(toIndentedString(screenshotBucketKey)).append("\n");
    sb.append("    skipped: ").append(toIndentedString(skipped)).append("\n");
    sb.append("    snapshotBucketKey: ").append(toIndentedString(snapshotBucketKey)).append("\n");
    sb.append("    stepId: ").append(toIndentedString(stepId)).append("\n");
    sb.append("    subTestStepDetails: ").append(toIndentedString(subTestStepDetails)).append("\n");
    sb.append("    timeToInteractive: ").append(toIndentedString(timeToInteractive)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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

