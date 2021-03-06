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
import com.datadog.api.v1.client.model.WidgetSort;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v1.client.JSON;


/**
 * Which column and order to sort by
 */
@ApiModel(description = "Which column and order to sort by")
@JsonPropertyOrder({
  WidgetFieldSort.JSON_PROPERTY_COLUMN,
  WidgetFieldSort.JSON_PROPERTY_ORDER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WidgetFieldSort {
  public static final String JSON_PROPERTY_COLUMN = "column";
  private String column;

  public static final String JSON_PROPERTY_ORDER = "order";
  private WidgetSort order;


  public WidgetFieldSort column(String column) {
    this.column = column;
    return this;
  }

   /**
   * Facet path for the column
   * @return column
  **/
  @ApiModelProperty(example = "", required = true, value = "Facet path for the column")
  @JsonProperty(JSON_PROPERTY_COLUMN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getColumn() {
    return column;
  }


  public void setColumn(String column) {
    this.column = column;
  }


  public WidgetFieldSort order(WidgetSort order) {
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public WidgetSort getOrder() {
    return order;
  }


  public void setOrder(WidgetSort order) {
    this.order = order;
  }


  /**
   * Return true if this WidgetFieldSort object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WidgetFieldSort widgetFieldSort = (WidgetFieldSort) o;
    return Objects.equals(this.column, widgetFieldSort.column) &&
        Objects.equals(this.order, widgetFieldSort.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(column, order);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WidgetFieldSort {\n");
    sb.append("    column: ").append(toIndentedString(column)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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

