package com.baeldung.springdoc.openapitools.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import org.openapitools.jackson.nullable.JsonNullable;

import java.net.URI;
import java.util.Arrays;
import java.util.Objects;

/**
 * PollDeliveryMethod
 */

public class PollDeliveryMethod implements StreamConfigurationDelivery {

  private String method = "https://schemas.openid.net/secevent/risc/delivery-method/poll";

  private JsonNullable<URI> endpointUrl = JsonNullable.<URI>undefined();

  public PollDeliveryMethod() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PollDeliveryMethod(String method) {
    this.method = method;
  }

  public PollDeliveryMethod method(String method) {
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

  public PollDeliveryMethod endpointUrl(URI endpointUrl) {
    this.endpointUrl = JsonNullable.of(endpointUrl);
    return this;
  }

  /**
   * The URL where events can be retrieved from. This is specified by the Transmitter.
   * @return endpointUrl
  */
  @Valid
  @Schema(name = "endpoint_url", description = "The URL where events can be retrieved from. This is specified by the Transmitter.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endpoint_url")
  public JsonNullable<URI> getEndpointUrl() {
    return endpointUrl;
  }

  public void setEndpointUrl(JsonNullable<URI> endpointUrl) {
    this.endpointUrl = endpointUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PollDeliveryMethod pollDeliveryMethod = (PollDeliveryMethod) o;
    return Objects.equals(this.method, pollDeliveryMethod.method) &&
        equalsNullable(this.endpointUrl, pollDeliveryMethod.endpointUrl);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(method, hashCodeNullable(endpointUrl));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PollDeliveryMethod {\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    endpointUrl: ").append(toIndentedString(endpointUrl)).append("\n");
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

