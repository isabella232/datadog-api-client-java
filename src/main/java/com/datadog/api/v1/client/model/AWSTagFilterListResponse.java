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
import com.datadog.api.v1.client.model.AWSTagFilterListResponseFilters;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v1.client.JSON;


/**
 * An array of tag filter rules by &#x60;namespace&#x60; and tag filter string.
 */
@ApiModel(description = "An array of tag filter rules by `namespace` and tag filter string.")
@JsonPropertyOrder({
  AWSTagFilterListResponse.JSON_PROPERTY_FILTERS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AWSTagFilterListResponse {
  public static final String JSON_PROPERTY_FILTERS = "filters";
  private List<AWSTagFilterListResponseFilters> filters = null;


  public AWSTagFilterListResponse filters(List<AWSTagFilterListResponseFilters> filters) {
    this.filters = filters;
    return this;
  }

  public AWSTagFilterListResponse addFiltersItem(AWSTagFilterListResponseFilters filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

   /**
   * An array of tag filters.
   * @return filters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of tag filters.")
  @JsonProperty(JSON_PROPERTY_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AWSTagFilterListResponseFilters> getFilters() {
    return filters;
  }


  public void setFilters(List<AWSTagFilterListResponseFilters> filters) {
    this.filters = filters;
  }


  /**
   * Return true if this AWSTagFilterListResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AWSTagFilterListResponse awSTagFilterListResponse = (AWSTagFilterListResponse) o;
    return Objects.equals(this.filters, awSTagFilterListResponse.filters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AWSTagFilterListResponse {\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
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

