package com.baeldung.springdoc.openapitools.models;

import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.Valid;

import java.util.List;
import java.util.Objects;

/**
 * TriggerEventParametersSubject
 */


@JsonTypeName("TriggerEventParameters_subject")
public class TriggerEventParametersSubject implements Subject {

  public TriggerEventParametersSubject() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TriggerEventParametersSubject(String format, String uri, String url, String email, String iss, String sub, String jti, String id, String phoneNumber, String issuer, String assertionId, List<@Valid SimpleSubject> identifiers) {
//    super(format, identifiers, uri, url, email, iss, sub, jti, id, phoneNumber, issuer, assertionId);
  }


  public TriggerEventParametersSubject format(String format) {
//    super.format(format);
    return this;
  }

  public TriggerEventParametersSubject identifiers(List<@Valid SimpleSubject> identifiers) {
//    super.identifiers(identifiers);
    return this;
  }

  public TriggerEventParametersSubject addIdentifiersItem(SimpleSubject identifiersItem) {
//    super.addIdentifiersItem(identifiersItem);
    return this;
  }

  public TriggerEventParametersSubject application(ComplexSubjectApplication application) {
//    super.application(application);
    return this;
  }

  public TriggerEventParametersSubject device(ComplexSubjectDevice device) {
//    super.device(device);
    return this;
  }

  public TriggerEventParametersSubject group(ComplexSubjectGroup group) {
//    super.group(group);
    return this;
  }

  public TriggerEventParametersSubject orgUnit(ComplexSubjectOrgUnit orgUnit) {
//    super.orgUnit(orgUnit);
    return this;
  }

  public TriggerEventParametersSubject session(ComplexSubjectSession session) {
//    super.session(session);
    return this;
  }

  public TriggerEventParametersSubject tenant(ComplexSubjectTenant tenant) {
//    super.tenant(tenant);
    return this;
  }

  public TriggerEventParametersSubject user(ComplexSubjectUser user) {
//    super.user(user);
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
    sb.append("class TriggerEventParametersSubject {\n");
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

