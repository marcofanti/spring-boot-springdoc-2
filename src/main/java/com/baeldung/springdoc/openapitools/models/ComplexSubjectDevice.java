package com.baeldung.springdoc.openapitools.models;

import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.Objects;
//import javax.validation.Valid;
//import javax.validation.constraints.*;

//import javax.annotation.Generated;

/**
 * ComplexSubjectDevice
 */


@JsonTypeName("ComplexSubject_device")
//@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-15T16:42:52.857708-05:00[America/New_York]")
public class ComplexSubjectDevice implements SimpleSubject {

  public ComplexSubjectDevice() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ComplexSubjectDevice(String format, String uri, String url, String email, String iss, String sub, String jti, String id, String phoneNumber, String issuer, String assertionId) {
  }


  public ComplexSubjectDevice format(String format) {
    return this;
  }

  public ComplexSubjectDevice uri(String uri) {
    return this;
  }

  public ComplexSubjectDevice url(String url) {
    return this;
  }

  public ComplexSubjectDevice email(String email) {
    return this;
  }

  public ComplexSubjectDevice iss(String iss) {
    return this;
  }

  public ComplexSubjectDevice sub(String sub) {
    return this;
  }

  public ComplexSubjectDevice jti(String jti) {
    return this;
  }

  public ComplexSubjectDevice id(String id) {
    return this;
  }

  public ComplexSubjectDevice phoneNumber(String phoneNumber) {
    return this;
  }

  public ComplexSubjectDevice issuer(String issuer) {
    return this;
  }

  public ComplexSubjectDevice assertionId(String assertionId) {
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
    sb.append("class ComplexSubjectDevice {\n");
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

