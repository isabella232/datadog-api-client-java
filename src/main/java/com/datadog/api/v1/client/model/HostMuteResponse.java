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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * HostMuteResponse
 */
@JsonPropertyOrder({
  HostMuteResponse.JSON_PROPERTY_ACTION,
  HostMuteResponse.JSON_PROPERTY_END,
  HostMuteResponse.JSON_PROPERTY_HOSTNAME,
  HostMuteResponse.JSON_PROPERTY_MESSAGE
})

public class HostMuteResponse {
  public static final String JSON_PROPERTY_ACTION = "action";
  private String action;

  public static final String JSON_PROPERTY_END = "end";
  private Long end;

  public static final String JSON_PROPERTY_HOSTNAME = "hostname";
  private String hostname;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;


  public HostMuteResponse action(String action) {
    
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Muted", value = "")
  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAction() {
    return action;
  }


  public void setAction(String action) {
    this.action = action;
  }


  public HostMuteResponse end(Long end) {
    
    this.end = end;
    return this;
  }

   /**
   * POSIX timestamp in seconds when the host is unmuted.
   * @return end
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1579098130", value = "POSIX timestamp in seconds when the host is unmuted.")
  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getEnd() {
    return end;
  }


  public void setEnd(Long end) {
    this.end = end;
  }


  public HostMuteResponse hostname(String hostname) {
    
    this.hostname = hostname;
    return this;
  }

   /**
   * Get hostname
   * @return hostname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "test.host", value = "")
  @JsonProperty(JSON_PROPERTY_HOSTNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHostname() {
    return hostname;
  }


  public void setHostname(String hostname) {
    this.hostname = hostname;
  }


  public HostMuteResponse message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Muting this host for a test!", value = "")
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostMuteResponse hostMuteResponse = (HostMuteResponse) o;
    return Objects.equals(this.action, hostMuteResponse.action) &&
        Objects.equals(this.end, hostMuteResponse.end) &&
        Objects.equals(this.hostname, hostMuteResponse.hostname) &&
        Objects.equals(this.message, hostMuteResponse.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, end, hostname, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostMuteResponse {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
