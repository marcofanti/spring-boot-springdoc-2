package com.baeldung.springdoc.openapitools.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * [Spec](https://datatracker.ietf.org/doc/html/draft-ietf-secevent-subject-identifiers#section-3.2.3)  The Decentralized Identifier Format identifies a subject using a Decentralized Identifier (DID) URL as defined in [DID](https://www.w3.org/TR/did-core/). Subject Identifiers in this format MUST contain a \&quot;url\&quot; member whose value is a DID URL for the DID Subject being identified.  The value of the \&quot;url\&quot; member MUST be a valid DID URL and MAY be a bare DID.  The \&quot;url\&quot; member is REQUIRED and MUST NOT be null or empty.  The Decentralized Identifier Format is identified by the name \&quot;did\&quot;.
 */

@Schema(name = "DID", description = "[Spec](https://datatracker.ietf.org/doc/html/draft-ietf-secevent-subject-identifiers#section-3.2.3)  The Decentralized Identifier Format identifies a subject using a Decentralized Identifier (DID) URL as defined in [DID](https://www.w3.org/TR/did-core/). Subject Identifiers in this format MUST contain a \"url\" member whose value is a DID URL for the DID Subject being identified.  The value of the \"url\" member MUST be a valid DID URL and MAY be a bare DID.  The \"url\" member is REQUIRED and MUST NOT be null or empty.  The Decentralized Identifier Format is identified by the name \"did\".")
public class DID implements SimpleSubject {

  private String format = "did";

  private String url;

  public DID() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DID(String format, String url) {
    this.format = format;
    this.url = url;
  }

  public DID format(String format) {
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

  public DID url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
  */
  //@NotNull @Pattern(regexp = "^did:[^\\s]+$")
  @Schema(name = "url", example = "did:example:123456/did/url/path?versionId=1", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DID DID = (DID) o;
    return Objects.equals(this.format, DID.format) &&
        Objects.equals(this.url, DID.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DID {\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

