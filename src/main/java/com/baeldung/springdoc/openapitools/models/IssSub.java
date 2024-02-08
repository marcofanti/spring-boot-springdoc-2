package com.baeldung.springdoc.openapitools.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * [Spec](https://datatracker.ietf.org/doc/html/draft-ietf-secevent-subject-identifiers#section-3.2.5)  The Issuer and Subject Identifier Format identifies a subject using a pair of \&quot;iss\&quot; and \&quot;sub\&quot; members, analagous to how subjects are identified using the \&quot;iss\&quot; and \&quot;sub\&quot; claims in OpenID Connect [OpenID.Core](http://openid.net/specs/openid-connect-core-1_0.html) ID Tokens. These members MUST follow the formats of the \&quot;iss\&quot; member and \&quot;sub\&quot; member defined by [RFC7519](https://datatracker.ietf.org/doc/html/rfc7519), respectively. Both the \&quot;iss\&quot; member and the \&quot;sub\&quot; member are REQUIRED and MUST NOT be null or empty.  The Issuer and Subject Identifier Format is identified by the name \&quot;iss_sub\&quot;.
 */

@Schema(name = "IssSub", description = "[Spec](https://datatracker.ietf.org/doc/html/draft-ietf-secevent-subject-identifiers#section-3.2.5)  The Issuer and Subject Identifier Format identifies a subject using a pair of \"iss\" and \"sub\" members, analagous to how subjects are identified using the \"iss\" and \"sub\" claims in OpenID Connect [OpenID.Core](http://openid.net/specs/openid-connect-core-1_0.html) ID Tokens. These members MUST follow the formats of the \"iss\" member and \"sub\" member defined by [RFC7519](https://datatracker.ietf.org/doc/html/rfc7519), respectively. Both the \"iss\" member and the \"sub\" member are REQUIRED and MUST NOT be null or empty.  The Issuer and Subject Identifier Format is identified by the name \"iss_sub\".")
public class IssSub implements SimpleSubject {

  private String format = "iss_sub";

  private String iss;

  private String sub;

  public IssSub() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IssSub(String format, String iss, String sub) {
    this.format = format;
    this.iss = iss;
    this.sub = sub;
  }

  public IssSub format(String format) {
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

  public IssSub iss(String iss) {
    this.iss = iss;
    return this;
  }

  /**
   * Get iss
   * @return iss
  */
  //@NotNull
  @Schema(name = "iss", example = "https://most-secure.com", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("iss")
  public String getIss() {
    return iss;
  }

  public void setIss(String iss) {
    this.iss = iss;
  }

  public IssSub sub(String sub) {
    this.sub = sub;
    return this;
  }

  /**
   * Get sub
   * @return sub
  */
  //@NotNull
  @Schema(name = "sub", example = "145234573", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sub")
  public String getSub() {
    return sub;
  }

  public void setSub(String sub) {
    this.sub = sub;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssSub issSub = (IssSub) o;
    return Objects.equals(this.format, issSub.format) &&
        Objects.equals(this.iss, issSub.iss) &&
        Objects.equals(this.sub, issSub.sub);
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, iss, sub);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssSub {\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    iss: ").append(toIndentedString(iss)).append("\n");
    sb.append("    sub: ").append(toIndentedString(sub)).append("\n");
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

