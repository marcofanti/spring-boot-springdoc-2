package com.baeldung.springdoc.openapitools.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import java.net.URI;
import java.util.Objects;

/**
 * PushDeliveryMethod
 */

public class PushDeliveryMethod implements StreamConfigurationDelivery {

  private String method = "https://schemas.openid.net/secevent/risc/delivery-method/push";

  private URI endpointUrl;

  private String authorizationHeader;

  public PushDeliveryMethod() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PushDeliveryMethod(String method, URI endpointUrl) {
    this.method = method;
    this.endpointUrl = endpointUrl;
  }

  public PushDeliveryMethod method(String method) {
    this.method = method;
    return this;
  }

  /**
   * Get method
   * @return method
  */
  //@NotNull
  @Schema(name = "method", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("method")
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public PushDeliveryMethod endpointUrl(URI endpointUrl) {
    this.endpointUrl = endpointUrl;
    return this;
  }

  /**
   * The URL where events are pushed through HTTP POST. This is set by the Receiver.
   * @return endpointUrl
  */
  //@NotNull @Valid
  @Schema(name = "endpoint_url", description = "The URL where events are pushed through HTTP POST. This is set by the Receiver.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("endpoint_url")
  public URI getEndpointUrl() {
    return endpointUrl;
  }

  public void setEndpointUrl(URI endpointUrl) {
    this.endpointUrl = endpointUrl;
  }

  public PushDeliveryMethod authorizationHeader(String authorizationHeader) {
    this.authorizationHeader = authorizationHeader;
    return this;
  }

  /**
   * The HTTP Authorization header that the Transmitter MUST set with each event delivery, if the configuration is present. The value is optional and it is set by the Receiver.
   * @return authorizationHeader
  */
  
  @Schema(name = "authorization_header", description = "The HTTP Authorization header that the Transmitter MUST set with each event delivery, if the configuration is present. The value is optional and it is set by the Receiver.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("authorization_header")
  public String getAuthorizationHeader() {
    return authorizationHeader;
  }

  public void setAuthorizationHeader(String authorizationHeader) {
    this.authorizationHeader = authorizationHeader;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PushDeliveryMethod pushDeliveryMethod = (PushDeliveryMethod) o;
    return Objects.equals(this.method, pushDeliveryMethod.method) &&
        Objects.equals(this.endpointUrl, pushDeliveryMethod.endpointUrl) &&
        Objects.equals(this.authorizationHeader, pushDeliveryMethod.authorizationHeader);
  }

  @Override
  public int hashCode() {
    return Objects.hash(method, endpointUrl, authorizationHeader);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PushDeliveryMethod {\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    endpointUrl: ").append(toIndentedString(endpointUrl)).append("\n");
    sb.append("    authorizationHeader: ").append(toIndentedString(authorizationHeader)).append("\n");
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

