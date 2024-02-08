package com.baeldung.springdoc.openapitools.models;

import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.Valid;

import java.util.List;
import java.util.Objects;

/**
 * RemoveSubjectParametersSubject
 */


@JsonTypeName("RemoveSubjectParameters_subject")
public class RemoveSubjectParametersSubject implements Subject {

  public RemoveSubjectParametersSubject() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RemoveSubjectParametersSubject(String format, String uri, String url, String email, String iss, String sub, String jti, String id, String phoneNumber, String issuer, String assertionId, List<@Valid SimpleSubject> identifiers) {
//    super(format, identifiers, uri, url, email, iss, sub, jti, id, phoneNumber, issuer, assertionId);
  }


  public RemoveSubjectParametersSubject format(String format) {
//    super.format(format);
    return this;
  }

  public RemoveSubjectParametersSubject identifiers(List<@Valid SimpleSubject> identifiers) {
//    super.identifiers(identifiers);
    return this;
  }

  public RemoveSubjectParametersSubject addIdentifiersItem(SimpleSubject identifiersItem) {
//    super.addIdentifiersItem(identifiersItem);
    return this;
  }

  public RemoveSubjectParametersSubject application(ComplexSubjectApplication application) {
//    super.application(application);
    return this;
  }

  public RemoveSubjectParametersSubject device(ComplexSubjectDevice device) {
//    super.device(device);
    return this;
  }

  public RemoveSubjectParametersSubject group(ComplexSubjectGroup group) {
//    super.group(group);
    return this;
  }

  public RemoveSubjectParametersSubject orgUnit(ComplexSubjectOrgUnit orgUnit) {
//    super.orgUnit(orgUnit);
    return this;
  }

  public RemoveSubjectParametersSubject session(ComplexSubjectSession session) {
//    super.session(session);
    return this;
  }

  public RemoveSubjectParametersSubject tenant(ComplexSubjectTenant tenant) {
//    super.tenant(tenant);
    return this;
  }

  public RemoveSubjectParametersSubject user(ComplexSubjectUser user) {
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
    sb.append("class RemoveSubjectParametersSubject {\n");
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

