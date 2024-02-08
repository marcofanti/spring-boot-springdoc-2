package com.baeldung.springdoc.openapitools.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * [Spec](https://datatracker.ietf.org/doc/html/draft-ietf-secevent-subject-identifiers#section-3.2.7)  The Phone Number Identifier Format identifies a subject using a telephone number.  Subject Identifiers in this format MUST contain a \&quot;phone_number\&quot; member whose value is a string containing the full telephone number of the subject, including international dialing prefix, formatted according to E.164 [E164](https://datatracker.ietf.org/doc/html/draft-ietf-secevent-subject-identifiers#ref-E164). The \&quot;phone_number\&quot; member is REQUIRED and MUST NOT be null or empty. The Phone Number Identifier Format is identified by the name \&quot;phone_number\&quot;.
 */

@Schema(name = "PhoneNumber", description = "[Spec](https://datatracker.ietf.org/doc/html/draft-ietf-secevent-subject-identifiers#section-3.2.7)  The Phone Number Identifier Format identifies a subject using a telephone number.  Subject Identifiers in this format MUST contain a \"phone_number\" member whose value is a string containing the full telephone number of the subject, including international dialing prefix, formatted according to E.164 [E164](https://datatracker.ietf.org/doc/html/draft-ietf-secevent-subject-identifiers#ref-E164). The \"phone_number\" member is REQUIRED and MUST NOT be null or empty. The Phone Number Identifier Format is identified by the name \"phone_number\".")
public class PhoneNumber implements SimpleSubject {

  private String format = "phone_number";

  private String phoneNumber;

  public PhoneNumber() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PhoneNumber(String format, String phoneNumber) {
    this.format = format;
    this.phoneNumber = phoneNumber;
  }

  public PhoneNumber format(String format) {
    this.format = format;
    return this;
  }

  /**
   * Get format
   * @return format
  */
  //@NotNull
  @Schema(name = "format", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("format")
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public PhoneNumber phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Get phoneNumber
   * @return phoneNumber
  */
  //@NotNull
  @Schema(name = "phone_number", example = "+12065550100", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("phone_number")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneNumber phoneNumber = (PhoneNumber) o;
    return Objects.equals(this.format, phoneNumber.format) &&
        Objects.equals(this.phoneNumber, phoneNumber.phoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, phoneNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneNumber {\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
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

