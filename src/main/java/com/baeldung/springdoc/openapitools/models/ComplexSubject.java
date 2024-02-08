package com.baeldung.springdoc.openapitools.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

import java.util.Objects;

/**
 * [Spec](https://openid.net/specs/openid-sse-framework-1_0.html#rfc.section.3.2)  A Complex Subject Member has a name and a value that is a JSON object that has one or more Simple Subject Members. All members within a Complex Subject MUST represent attributes of the same Subject Principal. As a whole, the Complex Subject MUST refer to exactly one Subject Principal.
 */

@Schema(name = "ComplexSubject", description = "[Spec](https://openid.net/specs/openid-sse-framework-1_0.html#rfc.section.3.2)  A Complex Subject Member has a name and a value that is a JSON object that has one or more Simple Subject Members. All members within a Complex Subject MUST represent attributes of the same Subject Principal. As a whole, the Complex Subject MUST refer to exactly one Subject Principal.")
public class ComplexSubject implements Subject {

  private ComplexSubjectApplication application;

  private ComplexSubjectDevice device;

  private ComplexSubjectGroup group;

  private ComplexSubjectOrgUnit orgUnit;

  private ComplexSubjectSession session;

  private ComplexSubjectTenant tenant;

  private ComplexSubjectUser user;

  public ComplexSubject application(ComplexSubjectApplication application) {
    this.application = application;
    return this;
  }

  /**
   * Get application
   * @return application
  */
  @Valid
  @Schema(name = "application", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("application")
  public ComplexSubjectApplication getApplication() {
    return application;
  }

  public void setApplication(ComplexSubjectApplication application) {
    this.application = application;
  }

  public ComplexSubject device(ComplexSubjectDevice device) {
    this.device = device;
    return this;
  }

  /**
   * Get device
   * @return device
  */
  @Valid 
  @Schema(name = "device", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("device")
  public ComplexSubjectDevice getDevice() {
    return device;
  }

  public void setDevice(ComplexSubjectDevice device) {
    this.device = device;
  }

  public ComplexSubject group(ComplexSubjectGroup group) {
    this.group = group;
    return this;
  }

  /**
   * Get group
   * @return group
  */
  @Valid 
  @Schema(name = "group", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("group")
  public ComplexSubjectGroup getGroup() {
    return group;
  }

  public void setGroup(ComplexSubjectGroup group) {
    this.group = group;
  }

  public ComplexSubject orgUnit(ComplexSubjectOrgUnit orgUnit) {
    this.orgUnit = orgUnit;
    return this;
  }

  /**
   * Get orgUnit
   * @return orgUnit
  */
  @Valid 
  @Schema(name = "org_unit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org_unit")
  public ComplexSubjectOrgUnit getOrgUnit() {
    return orgUnit;
  }

  public void setOrgUnit(ComplexSubjectOrgUnit orgUnit) {
    this.orgUnit = orgUnit;
  }

  public ComplexSubject session(ComplexSubjectSession session) {
    this.session = session;
    return this;
  }

  /**
   * Get session
   * @return session
  */
  @Valid 
  @Schema(name = "session", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("session")
  public ComplexSubjectSession getSession() {
    return session;
  }

  public void setSession(ComplexSubjectSession session) {
    this.session = session;
  }

  public ComplexSubject tenant(ComplexSubjectTenant tenant) {
    this.tenant = tenant;
    return this;
  }

  /**
   * Get tenant
   * @return tenant
  */
  @Valid 
  @Schema(name = "tenant", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tenant")
  public ComplexSubjectTenant getTenant() {
    return tenant;
  }

  public void setTenant(ComplexSubjectTenant tenant) {
    this.tenant = tenant;
  }

  public ComplexSubject user(ComplexSubjectUser user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
  */
  @Valid 
  @Schema(name = "user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user")
  public ComplexSubjectUser getUser() {
    return user;
  }

  public void setUser(ComplexSubjectUser user) {
    this.user = user;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComplexSubject complexSubject = (ComplexSubject) o;
    return Objects.equals(this.application, complexSubject.application) &&
        Objects.equals(this.device, complexSubject.device) &&
        Objects.equals(this.group, complexSubject.group) &&
        Objects.equals(this.orgUnit, complexSubject.orgUnit) &&
        Objects.equals(this.session, complexSubject.session) &&
        Objects.equals(this.tenant, complexSubject.tenant) &&
        Objects.equals(this.user, complexSubject.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(application, device, group, orgUnit, session, tenant, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComplexSubject {\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    orgUnit: ").append(toIndentedString(orgUnit)).append("\n");
    sb.append("    session: ").append(toIndentedString(session)).append("\n");
    sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

