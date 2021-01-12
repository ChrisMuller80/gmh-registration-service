/*
 * NBN:Resolver
 * For easy retrieval of a publication or data, assigned with a Dutch NBN in the Netherlands, a service called <a href ='https://persistent-identifier.nl'>National Resolver</a> is available. This service is managed by <a href ='https://dans.knaw.nl'>Data Archiving and Networked Services</a> (DANS) and <a href=\"https://www.kb.nl\">KB, National Library of the Netherlands</a> (KB). Find out more about the <a href=\"https://www.kb.nl/organisatie/onderzoek-expertise/informatie-infrastructuur-diensten-voor-bibliotheken/registration-agency-nbn\">'Registration Agency NBN'</a>.
 *
 * OpenAPI spec version: 0.1.0
 * Contact: harvester@dans.knaw.nl
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * NbnLocationsObject
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2021-01-08T12:34:19.815Z[GMT]")
public class NbnLocationsObject {

  @JsonProperty("identifier")
  private String identifier = null;

  @JsonProperty("locations")
  private List<String> locations = null;

  public NbnLocationsObject identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

  /**
   * Get identifier
   *
   * @return identifier
   **/
  @JsonProperty("identifier")
  @Schema(description = "")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public NbnLocationsObject locations(List<String> locations) {
    this.locations = locations;
    return this;
  }

  public NbnLocationsObject addLocationsItem(String locationsItem) {
    if (this.locations == null) {
      this.locations = new ArrayList<String>();
    }
    this.locations.add(locationsItem);
    return this;
  }

  /**
   * Get locations
   *
   * @return locations
   **/
  @JsonProperty("locations")
  @Schema(description = "")
  public List<String> getLocations() {
    return locations;
  }

  public void setLocations(List<String> locations) {
    this.locations = locations;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NbnLocationsObject nbnLocationsObject = (NbnLocationsObject) o;
    return Objects.equals(this.identifier, nbnLocationsObject.identifier) && Objects.equals(this.locations, nbnLocationsObject.locations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, locations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NbnLocationsObject {\n");

    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
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
