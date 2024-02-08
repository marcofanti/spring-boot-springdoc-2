package com.baeldung.springdoc.openapitools.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * JSON Object describing and Event Stream&#39;s configuration [Spec](https://openid.net/specs/openid-sse-framework-1_0.html#stream-config)\&quot; 
 */

@Schema(name = "StreamConfiguration", description = "JSON Object describing and Event Stream's configuration [Spec](https://openid.net/specs/openid-sse-framework-1_0.html#stream-config)\" ")
public class StreamConfiguration {

  private URI iss;

  private StreamConfigurationAud aud;

  @Valid
  private List<URI> eventsSupported;

  @Valid
  private List<URI> eventsRequested = new ArrayList<>();

  @Valid
  private List<URI> eventsDelivered;

  private StreamConfigurationDelivery delivery;

  private Integer minVerificationInterval;

  private String format;

  public StreamConfiguration() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public StreamConfiguration(List<URI> eventsRequested, StreamConfigurationDelivery delivery) {
    this.eventsRequested = eventsRequested;
    this.delivery = delivery;
  }

  public StreamConfiguration iss(URI iss) {
    this.iss = iss;
    return this;
  }

  /**
   * Read-Only. A URL using the https scheme with no query or fragment component that the Transmitter asserts as its Issuer Identifier. This MUST be identical to the iss Claim value in Security Event Tokens issued from this Transmitter.
   * @return iss
  */
  @Valid 
  @Schema(name = "iss", example = "https://most-secure.com", description = "Read-Only. A URL using the https scheme with no query or fragment component that the Transmitter asserts as its Issuer Identifier. This MUST be identical to the iss Claim value in Security Event Tokens issued from this Transmitter.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("iss")
  public URI getIss() {
    return iss;
  }

  public void setIss(URI iss) {
    this.iss = iss;
  }

  public StreamConfiguration aud(StreamConfigurationAud aud) {
    this.aud = aud;
    return this;
  }

  /**
   * Get aud
   * @return aud
  */
  @Valid 
  @Schema(name = "aud", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aud")
  public StreamConfigurationAud getAud() {
    System.out.println("StreamConfigurationAud: " + aud.toString());
    return aud;
  }

  public void setAud(StreamConfigurationAud aud) {
    this.aud = aud;
    System.out.println("StreamConfigurationAud: " + aud.toString());
  }

  public StreamConfiguration eventsSupported(List<URI> eventsSupported) {
    this.eventsSupported = eventsSupported;
    return this;
  }

  public StreamConfiguration addEventsSupportedItem(URI eventsSupportedItem) {
    if (this.eventsSupported == null) {
      this.eventsSupported = new ArrayList<>();
    }
    this.eventsSupported.add(eventsSupportedItem);
    return this;
  }

  /**
   * Read-Only. An array of URIs identifying the set of events supported by the Transmitter for this Receiver. If omitted, Event Transmitters SHOULD make this set available to the Event Receiver via some other means (e.g. publishing it in online documentation).
   * @return eventsSupported
  */
  @Valid 
  @Schema(name = "events_supported", example = "[\"https://schemas.openid.net/secevent/caep/event-type/session-revoked\",\"https://schemas.openid.net/secevent/risc/event-type/credential-compromise\"]", description = "Read-Only. An array of URIs identifying the set of events supported by the Transmitter for this Receiver. If omitted, Event Transmitters SHOULD make this set available to the Event Receiver via some other means (e.g. publishing it in online documentation).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("events_supported")
  public List<URI> getEventsSupported() {
    return eventsSupported;
  }

  public void setEventsSupported(List<URI> eventsSupported) {
    this.eventsSupported = eventsSupported;
  }

  public StreamConfiguration eventsRequested(List<URI> eventsRequested) {
    this.eventsRequested = eventsRequested;
    return this;
  }

  public StreamConfiguration addEventsRequestedItem(URI eventsRequestedItem) {
    if (this.eventsRequested == null) {
      this.eventsRequested = new ArrayList<>();
    }
    this.eventsRequested.add(eventsRequestedItem);
    return this;
  }

  /**
   * Read-Write. An array of URIs identifying the set of events that the Receiver requested. A Receiver SHOULD request only the events that it understands and it can act on. This is configurable by the Receiver.
   * @return eventsRequested
  */
  //@NotNull @Valid
  @Schema(name = "events_requested", example = "[\"https://schemas.openid.net/secevent/risc/event-type/credential-compromise\"]", description = "Read-Write. An array of URIs identifying the set of events that the Receiver requested. A Receiver SHOULD request only the events that it understands and it can act on. This is configurable by the Receiver.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("events_requested")
  public List<URI> getEventsRequested() {
    return eventsRequested;
  }

  public void setEventsRequested(List<URI> eventsRequested) {
    this.eventsRequested = eventsRequested;
  }

  public StreamConfiguration eventsDelivered(List<URI> eventsDelivered) {
    this.eventsDelivered = eventsDelivered;
    return this;
  }

  public StreamConfiguration addEventsDeliveredItem(URI eventsDeliveredItem) {
    if (this.eventsDelivered == null) {
      this.eventsDelivered = new ArrayList<>();
    }
    this.eventsDelivered.add(eventsDeliveredItem);
    return this;
  }

  /**
   * Read-Only. An array of URIs which is the intersection of events_supported and events_requested. These events MAY be delivered over the Event Stream.
   * @return eventsDelivered
  */
  @Valid 
  @Schema(name = "events_delivered", example = "[\"https://schemas.openid.net/secevent/risc/event-type/credential-compromise\"]", description = "Read-Only. An array of URIs which is the intersection of events_supported and events_requested. These events MAY be delivered over the Event Stream.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("events_delivered")
  public List<URI> getEventsDelivered() {
    return eventsDelivered;
  }

  public void setEventsDelivered(List<URI> eventsDelivered) {
    this.eventsDelivered = eventsDelivered;
  }

  public StreamConfiguration delivery(StreamConfigurationDelivery delivery) {
    this.delivery = delivery;
    return this;
  }

  /**
   * Get delivery
   * @return delivery
  */
  //@NotNull @Valid
  @Schema(name = "delivery", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("delivery")
  public StreamConfigurationDelivery getDelivery() {
    return delivery;
  }

  public void setDelivery(StreamConfigurationDelivery delivery) {
    this.delivery = delivery;
  }

  public StreamConfiguration minVerificationInterval(Integer minVerificationInterval) {
    this.minVerificationInterval = minVerificationInterval;
    return this;
  }

  /**
   * Read-Only. An integer indicating the minimum amount of time in seconds that must pass in between verification requests. If an Event Receiver submits verification requests more frequently than this, the Event Transmitter MAY respond with a 429 status code. An Event Transmitter SHOULD NOT respond with a 429 status code if an Event Receiver is not exceeding this frequency.
   * @return minVerificationInterval
  */
  
  @Schema(name = "min_verification_interval", description = "Read-Only. An integer indicating the minimum amount of time in seconds that must pass in between verification requests. If an Event Receiver submits verification requests more frequently than this, the Event Transmitter MAY respond with a 429 status code. An Event Transmitter SHOULD NOT respond with a 429 status code if an Event Receiver is not exceeding this frequency.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("min_verification_interval")
  public Integer getMinVerificationInterval() {
    return minVerificationInterval;
  }

  public void setMinVerificationInterval(Integer minVerificationInterval) {
    this.minVerificationInterval = minVerificationInterval;
  }

  public StreamConfiguration format(String format) {
    this.format = format;
    return this;
  }

  /**
   * Read-Write. The Subject Identifier Format that the Receiver wants for the events. If not set then the Transmitter might decide to use a type that discloses more information than necessary.
   * @return format
  */
  
  @Schema(name = "format", description = "Read-Write. The Subject Identifier Format that the Receiver wants for the events. If not set then the Transmitter might decide to use a type that discloses more information than necessary.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("format")
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamConfiguration streamConfiguration = (StreamConfiguration) o;
    return Objects.equals(this.iss, streamConfiguration.iss) &&
        Objects.equals(this.aud, streamConfiguration.aud) &&
        Objects.equals(this.eventsSupported, streamConfiguration.eventsSupported) &&
        Objects.equals(this.eventsRequested, streamConfiguration.eventsRequested) &&
        Objects.equals(this.eventsDelivered, streamConfiguration.eventsDelivered) &&
        Objects.equals(this.delivery, streamConfiguration.delivery) &&
        Objects.equals(this.minVerificationInterval, streamConfiguration.minVerificationInterval) &&
        Objects.equals(this.format, streamConfiguration.format);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iss, aud, eventsSupported, eventsRequested, eventsDelivered, delivery, minVerificationInterval, format);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamConfiguration {\n");
    sb.append("    iss: ").append(toIndentedString(iss)).append("\n");
    sb.append("    aud: ").append(toIndentedString(aud)).append("\n");
    sb.append("    eventsSupported: ").append(toIndentedString(eventsSupported)).append("\n");
    sb.append("    eventsRequested: ").append(toIndentedString(eventsRequested)).append("\n");
    sb.append("    eventsDelivered: ").append(toIndentedString(eventsDelivered)).append("\n");
    sb.append("    delivery: ").append(toIndentedString(delivery)).append("\n");
    sb.append("    minVerificationInterval: ").append(toIndentedString(minVerificationInterval)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
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

