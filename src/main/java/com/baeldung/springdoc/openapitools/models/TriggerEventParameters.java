package com.baeldung.springdoc.openapitools.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * JSON Object describing request to create a security event to test SSE receiver/transmitter  
 */

@Schema(name = "TriggerEventParameters", description = "JSON Object describing request to create a security event to test SSE receiver/transmitter  ")
public class TriggerEventParameters {

  private String eventType;

  private TriggerEventParametersSubject subject;

  public TriggerEventParameters() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TriggerEventParameters(String eventType, TriggerEventParametersSubject subject) {
    this.eventType = eventType;
    this.subject = subject;
  }

  public TriggerEventParameters eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

  /**
   * Supports all [RISC](https://openid.net/specs/openid-risc-profile-specification-1_0-01.html) and [CAEP](https://openid.net/specs/openid-caep-specification-1_0-ID1.html) event types.
   * @return eventType
  */
  //@NotNull
  @Schema(name = "event_type", example = "credential-compromise", description = "Supports all [RISC](https://openid.net/specs/openid-risc-profile-specification-1_0-01.html) and [CAEP](https://openid.net/specs/openid-caep-specification-1_0-ID1.html) event types.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("event_type")
  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public TriggerEventParameters subject(TriggerEventParametersSubject subject) {
    this.subject = subject;
    return this;
  }

  /**
   * Get subject
   * @return subject
  */
  //@NotNull @Valid
  @Schema(name = "subject", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("subject")
  public TriggerEventParametersSubject getSubject() {
    return subject;
  }

  public void setSubject(TriggerEventParametersSubject subject) {
    this.subject = subject;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TriggerEventParameters triggerEventParameters = (TriggerEventParameters) o;
    return Objects.equals(this.eventType, triggerEventParameters.eventType) &&
        Objects.equals(this.subject, triggerEventParameters.subject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventType, subject);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TriggerEventParameters {\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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

