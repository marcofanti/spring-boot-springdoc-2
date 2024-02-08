package com.baeldung.springdoc.openapitools.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Pattern;

import java.util.Objects;

/**
 * [Spec](https://datatracker.ietf.org/doc/html/draft-ietf-secevent-subject-identifiers#section-3.2.1)  The Account Identifier Format identifies a subject using an account at a service provider, identified with an \&quot;acct\&quot; URI as defined in [RFC7565](https://datatracker.ietf.org/doc/html/rfc7565). Subject Identifiers in this format MUST contain a \&quot;uri\&quot; member whose value is the \&quot;acct\&quot; URI for the subject.  The \&quot;uri\&quot; member is REQUIRED and MUST NOT be null or empty.  The Account Identifier Format is identified by the name \&quot;account\&quot;.
 */

@Schema(name = "Account", description = "[Spec](https://datatracker.ietf.org/doc/html/draft-ietf-secevent-subject-identifiers#section-3.2.1)  The Account Identifier Format identifies a subject using an account at a service provider, identified with an \"acct\" URI as defined in [RFC7565](https://datatracker.ietf.org/doc/html/rfc7565). Subject Identifiers in this format MUST contain a \"uri\" member whose value is the \"acct\" URI for the subject.  The \"uri\" member is REQUIRED and MUST NOT be null or empty.  The Account Identifier Format is identified by the name \"account\".")
public class Account implements SimpleSubject {

  private String format = "account";

  private String uri;

  public Account() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Account(String format, String uri) {
    this.format = format;
    this.uri = uri;
  }

  public Account format(String format) {
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

  public Account uri(String uri) {
    this.uri = uri;
    return this;
  }

  /**
   * Get uri
   * @return uri
  */
  //@NotNull
  @Pattern(regexp = "^acct:[^\\s]+$")
  @Schema(name = "uri", example = "acct:reginold@popular-app.com", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("uri")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.format, account.format) &&
        Objects.equals(this.uri, account.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, uri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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

