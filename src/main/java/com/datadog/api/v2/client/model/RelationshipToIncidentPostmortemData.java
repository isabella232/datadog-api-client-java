/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v2.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.datadog.api.v2.client.model.IncidentPostmortemType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v2.client.JSON;


/**
 * The postmortem relationship data.
 */
@ApiModel(description = "The postmortem relationship data.")
@JsonPropertyOrder({
  RelationshipToIncidentPostmortemData.JSON_PROPERTY_ID,
  RelationshipToIncidentPostmortemData.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RelationshipToIncidentPostmortemData {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private IncidentPostmortemType type = IncidentPostmortemType.INCIDENT_POSTMORTEMS;


  public RelationshipToIncidentPostmortemData id(String id) {
    this.id = id;
    return this;
  }

   /**
   * A unique identifier that represents the postmortem.
   * @return id
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", required = true, value = "A unique identifier that represents the postmortem.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public RelationshipToIncidentPostmortemData type(IncidentPostmortemType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public IncidentPostmortemType getType() {
    return type;
  }


  public void setType(IncidentPostmortemType type) {
    this.type = type;
  }


  /**
   * Return true if this RelationshipToIncidentPostmortemData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelationshipToIncidentPostmortemData relationshipToIncidentPostmortemData = (RelationshipToIncidentPostmortemData) o;
    return Objects.equals(this.id, relationshipToIncidentPostmortemData.id) &&
        Objects.equals(this.type, relationshipToIncidentPostmortemData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelationshipToIncidentPostmortemData {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

