package com.baeldung.springdoc.openapitools.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Transmitters have metadata describing their configuration. [OpenID Spec](https://openid.net/specs/openid-sse-framework-1_0.html#discovery-meta) 
 */

@Schema(name = "TransmitterConfiguration", description = "Transmitters have metadata describing their configuration. [OpenID Spec](https://openid.net/specs/openid-sse-framework-1_0.html#discovery-meta) ")
public class TransmitterConfiguration {

  private URI issuer;

  private URI jwksUri;

  @Valid
  private List<URI> deliveryMethodsSupported;

  private URI configurationEndpoint;

  private URI statusEndpoint;

  private URI addSubjectEndpoint;

  private URI removeSubjectEndpoint;

  private URI verificationEndpoint;

  @Valid
  private List<String> criticalSubjectMembers;

  public TransmitterConfiguration() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TransmitterConfiguration(URI issuer, URI jwksUri) {
    this.issuer = issuer;
    this.jwksUri = jwksUri;
  }

  public TransmitterConfiguration issuer(URI issuer) {
    this.issuer = issuer;
    return this;
  }

  /**
   * URL using the https scheme with no query or fragment component that the Transmitter asserts as its Issuer Identifier. This MUST be identical to the iss claim value in Security Event Tokens issued from this Transmitter. 
   * @return issuer
  */
  //@NotNull @Valid
  @Schema(name = "issuer", example = "https://most-secure.com", description = "URL using the https scheme with no query or fragment component that the Transmitter asserts as its Issuer Identifier. This MUST be identical to the iss claim value in Security Event Tokens issued from this Transmitter. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("issuer")
  public URI getIssuer() {
    return issuer;
  }

  public void setIssuer(URI issuer) {
    this.issuer = issuer;
  }

  public TransmitterConfiguration jwksUri(URI jwksUri) {
    this.jwksUri = jwksUri;
    return this;
  }

  /**
   * URL of the Transmitter's [JSON Web Key Set](https://openid.net/specs/openid-sse-framework-1_0.html#RFC7517) document. This contains the signing key(s) the Receiver uses to validate signatures from the Transmitter. 
   * @return jwksUri
  */
  //@NotNull @Valid
  @Schema(name = "jwks_uri", example = "https://transmitter.most-secure.com/jwks.json", description = "URL of the Transmitter's [JSON Web Key Set](https://openid.net/specs/openid-sse-framework-1_0.html#RFC7517) document. This contains the signing key(s) the Receiver uses to validate signatures from the Transmitter. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("jwks_uri")
  public URI getJwksUri() {
    return jwksUri;
  }

  public void setJwksUri(URI jwksUri) {
    this.jwksUri = jwksUri;
  }

  public TransmitterConfiguration deliveryMethodsSupported(List<URI> deliveryMethodsSupported) {
    this.deliveryMethodsSupported = deliveryMethodsSupported;
    return this;
  }

  public TransmitterConfiguration addDeliveryMethodsSupportedItem(URI deliveryMethodsSupportedItem) {
    if (this.deliveryMethodsSupported == null) {
      this.deliveryMethodsSupported = new ArrayList<>();
    }
    this.deliveryMethodsSupported.add(deliveryMethodsSupportedItem);
    return this;
  }

  /**
   * List of supported delivery method URIs. Recommended.
   * @return deliveryMethodsSupported
  */
  @Valid 
  @Schema(name = "delivery_methods_supported", example = "[\"https://schemas.openid.net/secevent/risc/delivery-method/push\",\"https://schemas.openid.net/secevent/risc/delivery-method/poll\"]", description = "List of supported delivery method URIs. Recommended.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("delivery_methods_supported")
  public List<URI> getDeliveryMethodsSupported() {
    return deliveryMethodsSupported;
  }

  public void setDeliveryMethodsSupported(List<URI> deliveryMethodsSupported) {
    this.deliveryMethodsSupported = deliveryMethodsSupported;
  }

  public TransmitterConfiguration configurationEndpoint(URI configurationEndpoint) {
    this.configurationEndpoint = configurationEndpoint;
    return this;
  }

  /**
   * The URL of the Configuration Endpoint.
   * @return configurationEndpoint
  */
  @Valid 
  @Schema(name = "configuration_endpoint", example = "https://transmitter.most-secure.com/stream", description = "The URL of the Configuration Endpoint.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("configuration_endpoint")
  public URI getConfigurationEndpoint() {
    return configurationEndpoint;
  }

  public void setConfigurationEndpoint(URI configurationEndpoint) {
    this.configurationEndpoint = configurationEndpoint;
  }

  public TransmitterConfiguration statusEndpoint(URI statusEndpoint) {
    this.statusEndpoint = statusEndpoint;
    return this;
  }

  /**
   * The URL of the Status Endpoint.
   * @return statusEndpoint
  */
  @Valid 
  @Schema(name = "status_endpoint", example = "https://transmitter.most-secure.com/status", description = "The URL of the Status Endpoint.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status_endpoint")
  public URI getStatusEndpoint() {
    return statusEndpoint;
  }

  public void setStatusEndpoint(URI statusEndpoint) {
    this.statusEndpoint = statusEndpoint;
  }

  public TransmitterConfiguration addSubjectEndpoint(URI addSubjectEndpoint) {
    this.addSubjectEndpoint = addSubjectEndpoint;
    return this;
  }

  /**
   * The URL of the Add Subject Endpoint.
   * @return addSubjectEndpoint
  */
  @Valid 
  @Schema(name = "add_subject_endpoint", example = "https://transmitter.most-secure.com/add-subject", description = "The URL of the Add Subject Endpoint.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("add_subject_endpoint")
  public URI getAddSubjectEndpoint() {
    return addSubjectEndpoint;
  }

  public void setAddSubjectEndpoint(URI addSubjectEndpoint) {
    this.addSubjectEndpoint = addSubjectEndpoint;
  }

  public TransmitterConfiguration removeSubjectEndpoint(URI removeSubjectEndpoint) {
    this.removeSubjectEndpoint = removeSubjectEndpoint;
    return this;
  }

  /**
   * The URL of the Remove Subject Endpoint.
   * @return removeSubjectEndpoint
  */
  @Valid 
  @Schema(name = "remove_subject_endpoint", example = "https://transmitter.most-secure.com/remove-subject", description = "The URL of the Remove Subject Endpoint.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("remove_subject_endpoint")
  public URI getRemoveSubjectEndpoint() {
    return removeSubjectEndpoint;
  }

  public void setRemoveSubjectEndpoint(URI removeSubjectEndpoint) {
    this.removeSubjectEndpoint = removeSubjectEndpoint;
  }

  public TransmitterConfiguration verificationEndpoint(URI verificationEndpoint) {
    this.verificationEndpoint = verificationEndpoint;
    return this;
  }

  /**
   * The URL of the Verification Endpoint.
   * @return verificationEndpoint
  */
  @Valid 
  @Schema(name = "verification_endpoint", example = "https://transmitter.most-secure.com/verification", description = "The URL of the Verification Endpoint.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("verification_endpoint")
  public URI getVerificationEndpoint() {
    return verificationEndpoint;
  }

  public void setVerificationEndpoint(URI verificationEndpoint) {
    this.verificationEndpoint = verificationEndpoint;
  }

  public TransmitterConfiguration criticalSubjectMembers(List<String> criticalSubjectMembers) {
    this.criticalSubjectMembers = criticalSubjectMembers;
    return this;
  }

  public TransmitterConfiguration addCriticalSubjectMembersItem(String criticalSubjectMembersItem) {
    if (this.criticalSubjectMembers == null) {
      this.criticalSubjectMembers = new ArrayList<>();
    }
    this.criticalSubjectMembers.add(criticalSubjectMembersItem);
    return this;
  }

  /**
   * List of member names in a Complex Subject which, if present in a Subject Member in an event, MUST be interpreted by a Receiver. 
   * @return criticalSubjectMembers
  */
  
  @Schema(name = "critical_subject_members", example = "[\"tenant\",\"user\"]", description = "List of member names in a Complex Subject which, if present in a Subject Member in an event, MUST be interpreted by a Receiver. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("critical_subject_members")
  public List<String> getCriticalSubjectMembers() {
    return criticalSubjectMembers;
  }

  public void setCriticalSubjectMembers(List<String> criticalSubjectMembers) {
    this.criticalSubjectMembers = criticalSubjectMembers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransmitterConfiguration transmitterConfiguration = (TransmitterConfiguration) o;
    return Objects.equals(this.issuer, transmitterConfiguration.issuer) &&
        Objects.equals(this.jwksUri, transmitterConfiguration.jwksUri) &&
        Objects.equals(this.deliveryMethodsSupported, transmitterConfiguration.deliveryMethodsSupported) &&
        Objects.equals(this.configurationEndpoint, transmitterConfiguration.configurationEndpoint) &&
        Objects.equals(this.statusEndpoint, transmitterConfiguration.statusEndpoint) &&
        Objects.equals(this.addSubjectEndpoint, transmitterConfiguration.addSubjectEndpoint) &&
        Objects.equals(this.removeSubjectEndpoint, transmitterConfiguration.removeSubjectEndpoint) &&
        Objects.equals(this.verificationEndpoint, transmitterConfiguration.verificationEndpoint) &&
        Objects.equals(this.criticalSubjectMembers, transmitterConfiguration.criticalSubjectMembers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuer, jwksUri, deliveryMethodsSupported, configurationEndpoint,
        statusEndpoint, addSubjectEndpoint, removeSubjectEndpoint, verificationEndpoint, criticalSubjectMembers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransmitterConfiguration {\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    jwksUri: ").append(toIndentedString(jwksUri)).append("\n");
    sb.append("    deliveryMethodsSupported: ").append(toIndentedString(deliveryMethodsSupported)).append("\n");
    sb.append("    configurationEndpoint: ").append(toIndentedString(configurationEndpoint)).append("\n");
    sb.append("    statusEndpoint: ").append(toIndentedString(statusEndpoint)).append("\n");
    sb.append("    addSubjectEndpoint: ").append(toIndentedString(addSubjectEndpoint)).append("\n");
    sb.append("    removeSubjectEndpoint: ").append(toIndentedString(removeSubjectEndpoint)).append("\n");
    sb.append("    verificationEndpoint: ").append(toIndentedString(verificationEndpoint)).append("\n");
    sb.append("    criticalSubjectMembers: ").append(toIndentedString(criticalSubjectMembers)).append("\n");
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

