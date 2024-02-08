package com.baeldung.springdoc.openapitools.models;

import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.Objects;

/**
 * ComplexSubjectSession
 */


@JsonTypeName("ComplexSubject_session")
public class ComplexSubjectSession implements SimpleSubject {

  public ComplexSubjectSession() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ComplexSubjectSession(String format, String uri, String url, String email, String iss, String sub, String jti, String id, String phoneNumber, String issuer, String assertionId) {
//    super(format, uri, url, email, iss, sub, jti, id, phoneNumber, issuer, assertionId);
  }


  public ComplexSubjectSession format(String format) {
//    super.format(format);
    return this;
  }

  public ComplexSubjectSession uri(String uri) {
//    super.uri(uri);
    return this;
  }

  public ComplexSubjectSession url(String url) {
//    super.url(url);
    return this;
  }

  public ComplexSubjectSession email(String email) {
//    super.email(email);
    return this;
  }

  public ComplexSubjectSession iss(String iss) {
//    super.iss(iss);
    return this;
  }

  public ComplexSubjectSession sub(String sub) {
//    super.sub(sub);
    return this;
  }

  public ComplexSubjectSession jti(String jti) {
//    super.jti(jti);
    return this;
  }

  public ComplexSubjectSession id(String id) {
//    super.id(id);
    return this;
  }

  public ComplexSubjectSession phoneNumber(String phoneNumber) {
//    super.phoneNumber(phoneNumber);
    return this;
  }

  public ComplexSubjectSession issuer(String issuer) {
//    super.issuer(issuer);
    return this;
  }

  public ComplexSubjectSession assertionId(String assertionId) {
//    super.assertionId(assertionId);
    return this;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComplexSubjectSession {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

  @Override
  public String getFormat() {
    return null;
  }
}

