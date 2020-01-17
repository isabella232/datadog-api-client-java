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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * ServiceLevelObjectiveDeleted
 */
@JsonPropertyOrder({
  ServiceLevelObjectiveDeleted.JSON_PROPERTY_DATA
})

public class ServiceLevelObjectiveDeleted {
  public static final String JSON_PROPERTY_DATA = "data";
  private List<String> data = new ArrayList<String>();


  public ServiceLevelObjectiveDeleted data(List<String> data) {
    
    this.data = data;
    return this;
  }

  public ServiceLevelObjectiveDeleted addDataItem(String dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * An array containing the ID of the deleted service level objective object.
   * @return data
  **/
  @ApiModelProperty(required = true, value = "An array containing the ID of the deleted service level objective object.")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getData() {
    return data;
  }


  public void setData(List<String> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceLevelObjectiveDeleted serviceLevelObjectiveDeleted = (ServiceLevelObjectiveDeleted) o;
    return Objects.equals(this.data, serviceLevelObjectiveDeleted.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceLevelObjectiveDeleted {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
