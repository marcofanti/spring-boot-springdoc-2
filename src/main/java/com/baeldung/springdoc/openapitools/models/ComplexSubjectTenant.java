package com.baeldung.springdoc.openapitools.models;

import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.Objects;

/**
 * ComplexSubjectTenant
 */


@JsonTypeName("ComplexSubject_tenant")
public class ComplexSubjectTenant implements SimpleSubject {

  public ComplexSubjectTenant() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ComplexSubjectTenant(String format, String uri, String url, String email, String iss, String sub, String jti, String id, String phoneNumber, String issuer, String assertionId) {
//    super(format, uri, url, email, iss, sub, jti, id, phoneNumber, issuer, assertionId);
  }


  public ComplexSubjectTenant format(String format) {
//    super.format(format);
    return this;
  }

  public ComplexSubjectTenant uri(String uri) {
//    super.uri(uri);
    return this;
  }

  public ComplexSubjectTenant url(String url) {
//    super.url(url);
    return this;
  }

  public ComplexSubjectTenant email(String email) {
//    super.email(email);
    return this;
  }

  public ComplexSubjectTenant iss(String iss) {
//    super.iss(iss);
    return this;
  }

  public ComplexSubjectTenant sub(String sub) {
//    super.sub(sub);
    return this;
  }

  public ComplexSubjectTenant jti(String jti) {
//    super.jti(jti);
    return this;
  }

  public ComplexSubjectTenant id(String id) {
//    super.id(id);
    return this;
  }

  public ComplexSubjectTenant phoneNumber(String phoneNumber) {
//    super.phoneNumber(phoneNumber);
    return this;
  }

  public ComplexSubjectTenant issuer(String issuer) {
//    super.issuer(issuer);
    return this;
  }

  public ComplexSubjectTenant assertionId(String assertionId) {
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
    sb.append("class ComplexSubjectTenant {\n");
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

