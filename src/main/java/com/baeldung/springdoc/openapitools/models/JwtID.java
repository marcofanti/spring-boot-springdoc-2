package com.baeldung.springdoc.openapitools.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * [Spec](https://openid.net/specs/openid-sse-framework-1_0.html#rfc.section.3.4.1)  The \&quot;JWT ID\&quot; Subject Identifier Format specifies a JSON Web Token (JWT) identifier, defined in [RFC7519](https://datatracker.ietf.org/doc/html/rfc7519).
 */

@Schema(name = "JwtID", description = "[Spec](https://openid.net/specs/openid-sse-framework-1_0.html#rfc.section.3.4.1)  The \"JWT ID\" Subject Identifier Format specifies a JSON Web Token (JWT) identifier, defined in [RFC7519](https://datatracker.ietf.org/doc/html/rfc7519).")
public class JwtID implements SimpleSubject {

  private String format = "jwt_id";

  private String iss;

  private String jti;

  public JwtID() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public JwtID(String format, String iss, String jti) {
    this.format = format;
    this.iss = iss;
    this.jti = jti;
  }

  public JwtID format(String format) {
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

  public JwtID iss(String iss) {
    this.iss = iss;
    return this;
  }

  /**
   * The \"iss\" (issuer) claim of the JWT being identified, defined in [RFC7519](https://datatracker.ietf.org/doc/html/rfc7519)
   * @return iss
  */
  //@NotNull
  @Schema(name = "iss", example = "https://most-secure.com", description = "The \"iss\" (issuer) claim of the JWT being identified, defined in [RFC7519](https://datatracker.ietf.org/doc/html/rfc7519)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("iss")
  public String getIss() {
    return iss;
  }

  public void setIss(String iss) {
    this.iss = iss;
  }

  public JwtID jti(String jti) {
    this.jti = jti;
    return this;
  }

  /**
   * The \"jti\" (JWT token ID) claim of the JWT being identified, defined in [RFC7519](https://datatracker.ietf.org/doc/html/rfc7519)
   * @return jti
  */
  //@NotNull
  @Schema(name = "jti", example = "B70BA622-9515-4353-A866-823539EECBC8", description = "The \"jti\" (JWT token ID) claim of the JWT being identified, defined in [RFC7519](https://datatracker.ietf.org/doc/html/rfc7519)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("jti")
  public String getJti() {
    return jti;
  }

  public void setJti(String jti) {
    this.jti = jti;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JwtID jwtID = (JwtID) o;
    return Objects.equals(this.format, jwtID.format) &&
        Objects.equals(this.iss, jwtID.iss) &&
        Objects.equals(this.jti, jwtID.jti);
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, iss, jti);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JwtID {\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    iss: ").append(toIndentedString(iss)).append("\n");
    sb.append("    jti: ").append(toIndentedString(jti)).append("\n");
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

