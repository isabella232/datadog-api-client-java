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
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v1.client.JSON;


/**
 * Incident management usage for a given organization for a given hour.
 */
@ApiModel(description = "Incident management usage for a given organization for a given hour.")
@JsonPropertyOrder({
  UsageIncidentManagementHour.JSON_PROPERTY_HOUR,
  UsageIncidentManagementHour.JSON_PROPERTY_MONTHLY_ACTIVE_USERS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UsageIncidentManagementHour {
  public static final String JSON_PROPERTY_HOUR = "hour";
  private OffsetDateTime hour;

  public static final String JSON_PROPERTY_MONTHLY_ACTIVE_USERS = "monthly_active_users";
  private Long monthlyActiveUsers;


  public UsageIncidentManagementHour hour(OffsetDateTime hour) {
    this.hour = hour;
    return this;
  }

   /**
   * The hour for the usage.
   * @return hour
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The hour for the usage.")
  @JsonProperty(JSON_PROPERTY_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getHour() {
    return hour;
  }


  public void setHour(OffsetDateTime hour) {
    this.hour = hour;
  }


  public UsageIncidentManagementHour monthlyActiveUsers(Long monthlyActiveUsers) {
    this.monthlyActiveUsers = monthlyActiveUsers;
    return this;
  }

   /**
   * Contains the total number monthly active users from the start of the given hour&#39;s month until the given hour.
   * @return monthlyActiveUsers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Contains the total number monthly active users from the start of the given hour's month until the given hour.")
  @JsonProperty(JSON_PROPERTY_MONTHLY_ACTIVE_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMonthlyActiveUsers() {
    return monthlyActiveUsers;
  }


  public void setMonthlyActiveUsers(Long monthlyActiveUsers) {
    this.monthlyActiveUsers = monthlyActiveUsers;
  }


  /**
   * Return true if this UsageIncidentManagementHour object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageIncidentManagementHour usageIncidentManagementHour = (UsageIncidentManagementHour) o;
    return Objects.equals(this.hour, usageIncidentManagementHour.hour) &&
        Objects.equals(this.monthlyActiveUsers, usageIncidentManagementHour.monthlyActiveUsers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hour, monthlyActiveUsers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageIncidentManagementHour {\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    monthlyActiveUsers: ").append(toIndentedString(monthlyActiveUsers)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
