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
import com.datadog.api.v2.client.model.Creator;
import com.datadog.api.v2.client.model.DashboardType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v2.client.JSON;


/**
 * A dashboard within a list.
 */
@ApiModel(description = "A dashboard within a list.")
@JsonPropertyOrder({
  DashboardListItem.JSON_PROPERTY_AUTHOR,
  DashboardListItem.JSON_PROPERTY_CREATED,
  DashboardListItem.JSON_PROPERTY_ICON,
  DashboardListItem.JSON_PROPERTY_ID,
  DashboardListItem.JSON_PROPERTY_IS_FAVORITE,
  DashboardListItem.JSON_PROPERTY_IS_READ_ONLY,
  DashboardListItem.JSON_PROPERTY_IS_SHARED,
  DashboardListItem.JSON_PROPERTY_MODIFIED,
  DashboardListItem.JSON_PROPERTY_POPULARITY,
  DashboardListItem.JSON_PROPERTY_TITLE,
  DashboardListItem.JSON_PROPERTY_TYPE,
  DashboardListItem.JSON_PROPERTY_URL
})

public class DashboardListItem {
  public static final String JSON_PROPERTY_AUTHOR = "author";
  private Creator author;

  public static final String JSON_PROPERTY_CREATED = "created";
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_ICON = "icon";
  private String icon;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_IS_FAVORITE = "is_favorite";
  private Boolean isFavorite;

  public static final String JSON_PROPERTY_IS_READ_ONLY = "is_read_only";
  private Boolean isReadOnly;

  public static final String JSON_PROPERTY_IS_SHARED = "is_shared";
  private Boolean isShared;

  public static final String JSON_PROPERTY_MODIFIED = "modified";
  private OffsetDateTime modified;

  public static final String JSON_PROPERTY_POPULARITY = "popularity";
  private Integer popularity;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TYPE = "type";
  private DashboardType type;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;


  public DashboardListItem author(Creator author) {
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUTHOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Creator getAuthor() {
    return author;
  }


  public void setAuthor(Creator author) {
    this.author = author;
  }


   /**
   * Date of creation of the dashboard.
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date of creation of the dashboard.")
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreated() {
    return created;
  }




   /**
   * URL to the icon of the dashboard.
   * @return icon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL to the icon of the dashboard.")
  @JsonProperty(JSON_PROPERTY_ICON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIcon() {
    return icon;
  }




  public DashboardListItem id(String id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the dashboard.
   * @return id
  **/
  @ApiModelProperty(example = "q5j-nti-fv6", required = true, value = "ID of the dashboard.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


   /**
   * Whether or not the dashboard is in the favorites.
   * @return isFavorite
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not the dashboard is in the favorites.")
  @JsonProperty(JSON_PROPERTY_IS_FAVORITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsFavorite() {
    return isFavorite;
  }




   /**
   * Whether or not the dashboard is read only.
   * @return isReadOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not the dashboard is read only.")
  @JsonProperty(JSON_PROPERTY_IS_READ_ONLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsReadOnly() {
    return isReadOnly;
  }




   /**
   * Whether the dashboard is publicly shared or not.
   * @return isShared
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the dashboard is publicly shared or not.")
  @JsonProperty(JSON_PROPERTY_IS_SHARED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsShared() {
    return isShared;
  }




   /**
   * Date of last edition of the dashboard.
   * @return modified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date of last edition of the dashboard.")
  @JsonProperty(JSON_PROPERTY_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getModified() {
    return modified;
  }




   /**
   * Popularity of the dashboard.
   * maximum: 5
   * @return popularity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Popularity of the dashboard.")
  @JsonProperty(JSON_PROPERTY_POPULARITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPopularity() {
    return popularity;
  }




   /**
   * Title of the dashboard.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Title of the dashboard.")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }




  public DashboardListItem type(DashboardType type) {
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

  public DashboardType getType() {
    return type;
  }


  public void setType(DashboardType type) {
    this.type = type;
  }


   /**
   * URL path to the dashboard.
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL path to the dashboard.")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }




  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardListItem dashboardListItem = (DashboardListItem) o;
    return Objects.equals(this.author, dashboardListItem.author) &&
        Objects.equals(this.created, dashboardListItem.created) &&
        Objects.equals(this.icon, dashboardListItem.icon) &&
        Objects.equals(this.id, dashboardListItem.id) &&
        Objects.equals(this.isFavorite, dashboardListItem.isFavorite) &&
        Objects.equals(this.isReadOnly, dashboardListItem.isReadOnly) &&
        Objects.equals(this.isShared, dashboardListItem.isShared) &&
        Objects.equals(this.modified, dashboardListItem.modified) &&
        Objects.equals(this.popularity, dashboardListItem.popularity) &&
        Objects.equals(this.title, dashboardListItem.title) &&
        Objects.equals(this.type, dashboardListItem.type) &&
        Objects.equals(this.url, dashboardListItem.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, created, icon, id, isFavorite, isReadOnly, isShared, modified, popularity, title, type, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardListItem {\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isFavorite: ").append(toIndentedString(isFavorite)).append("\n");
    sb.append("    isReadOnly: ").append(toIndentedString(isReadOnly)).append("\n");
    sb.append("    isShared: ").append(toIndentedString(isShared)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    popularity: ").append(toIndentedString(popularity)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

