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
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v1.client.JSON;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The field to sort by.
 */
public enum UsageAttributionSort {
  
  API_PERCENTAGE("api_percentage"),
  
  SNMP_USAGE("snmp_usage"),
  
  LAMBDA_PERCENTAGE("lambda_percentage"),
  
  APM_HOST_USAGE("apm_host_usage"),
  
  API_USAGE("api_usage"),
  
  CONTAINER_USAGE("container_usage"),
  
  CUSTOM_TIMESERIES_PERCENTAGE("custom_timeseries_percentage"),
  
  CONTAINER_PERCENTAGE("container_percentage"),
  
  LAMBDA_USAGE("lambda_usage"),
  
  APM_HOST_PERCENTAGE("apm_host_percentage"),
  
  NPM_HOST_PERCENTAGE("npm_host_percentage"),
  
  BROWSER_PERCENTAGE("browser_percentage"),
  
  BROWSER_USAGE("browser_usage"),
  
  INFRA_HOST_PERCENTAGE("infra_host_percentage"),
  
  SNMP_PERCENTAGE("snmp_percentage"),
  
  NPM_HOST_USAGE("npm_host_usage"),
  
  INFRA_HOST_USAGE("infra_host_usage"),
  
  CUSTOM_TIMESERIES_USAGE("custom_timeseries_usage");

  private String value;

  UsageAttributionSort(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static UsageAttributionSort fromValue(String value) {
    for (UsageAttributionSort b : UsageAttributionSort.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

