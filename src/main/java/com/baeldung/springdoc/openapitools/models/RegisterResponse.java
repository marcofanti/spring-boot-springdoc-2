package com.baeldung.springdoc.openapitools.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * RegisterResponse
 */

public class RegisterResponse {

  private String token;

  public RegisterResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RegisterResponse(String token) {
    this.token = token;
  }

  public RegisterResponse token(String token) {
    this.token = token;
    return this;
  }

  /**
   * The Bearer Token that the receiver will need to use for all Stream Management API calls that require authorization.
   * @return token
  */
  //@NotNull
  @Schema(name = "token", description = "The Bearer Token that the receiver will need to use for all Stream Management API calls that require authorization.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("token")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegisterResponse registerResponse = (RegisterResponse) o;
    return Objects.equals(this.token, registerResponse.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisterResponse {\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

