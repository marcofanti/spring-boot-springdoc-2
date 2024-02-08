package com.baeldung.springdoc.openapitools.models;

import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.Objects;

/**
 * ComplexSubjectGroup
 */


@JsonTypeName("ComplexSubject_group")
public class ComplexSubjectGroup implements SimpleSubject {

  public ComplexSubjectGroup() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ComplexSubjectGroup(String format, String uri, String url, String email, String iss, String sub, String jti, String id, String phoneNumber, String issuer, String assertionId) {
  }


  public ComplexSubjectGroup format(String format) {
    return this;
  }

  public ComplexSubjectGroup uri(String uri) {
    return this;
  }

  public ComplexSubjectGroup url(String url) {
    return this;
  }

  public ComplexSubjectGroup email(String email) {
    return this;
  }

  public ComplexSubjectGroup iss(String iss) {
    return this;
  }

  public ComplexSubjectGroup sub(String sub) {
    return this;
  }

  public ComplexSubjectGroup jti(String jti) {
    return this;
  }

  public ComplexSubjectGroup id(String id) {
   return this;
  }

  public ComplexSubjectGroup phoneNumber(String phoneNumber) {
    return this;
  }

  public ComplexSubjectGroup issuer(String issuer) {
    return this;
  }

  public ComplexSubjectGroup assertionId(String assertionId) {
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
    sb.append("class ComplexSubjectGroup {\n");
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

