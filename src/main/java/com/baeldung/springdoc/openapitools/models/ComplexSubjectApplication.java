package com.baeldung.springdoc.openapitools.models;

import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.Objects;

/**
 * ComplexSubjectApplication
 */


@JsonTypeName("ComplexSubject_application")
public class ComplexSubjectApplication implements SimpleSubject {

  public ComplexSubjectApplication() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ComplexSubjectApplication(String format, String uri, String url, String email, String iss, String sub, String jti, String id, String phoneNumber, String issuer, String assertionId) {
  }


  public ComplexSubjectApplication format(String format) {
    return this;
  }

  public ComplexSubjectApplication uri(String uri) {
    return this;
  }

  public ComplexSubjectApplication url(String url) {
    return this;
  }

  public ComplexSubjectApplication email(String email) {
    return this;
  }

  public ComplexSubjectApplication iss(String iss) {
    return this;
  }

  public ComplexSubjectApplication sub(String sub) {
    return this;
  }

  public ComplexSubjectApplication jti(String jti) {
    return this;
  }

  public ComplexSubjectApplication id(String id) {
    return this;
  }

  public ComplexSubjectApplication phoneNumber(String phoneNumber) {
    return this;
  }

  public ComplexSubjectApplication issuer(String issuer) {
    return this;
  }

  public ComplexSubjectApplication assertionId(String assertionId) {
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
    sb.append("class ComplexSubjectApplication {\n");
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

