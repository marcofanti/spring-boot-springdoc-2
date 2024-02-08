package com.baeldung.springdoc.openapitools.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * [Spec](https://datatracker.ietf.org/doc/html/draft-ietf-secevent-subject-identifiers#section-3.2.2)  The Aliases Identifier Format describes a subject that is identified with a list of different Subject Identifiers.  It is intended for use when a variety of identifiers have been shared with the party that will be interpreting the Subject Identifier, and it is unknown which of those identifiers they will recognize or support.  Subject Identifiers in this format MUST contain an \&quot;identifiers\&quot; member whose value is a JSON array containing one or more Subject Identifiers. Each Subject Identifier in the array MUST identify the same entity. The \&quot;identifiers\&quot; member is REQUIRED and MUST NOT be null or empty. It MAY contain multiple instances of the same Identifier Format (e.g., multiple Email Subject Identifiers), but SHOULD NOT contain exact duplicates.  This format is identified by the name \&quot;aliases\&quot;.  \&quot;alias\&quot; Subject Identifiers MUST NOT be nested; i.e., the \&quot;identifiers\&quot; member of an \&quot;alias\&quot; Subject Identifier MUST NOT contain a Subject Identifier in the \&quot;aliases\&quot; format.&#39;
 */

@Schema(name = "Aliases", description = "[Spec](https://datatracker.ietf.org/doc/html/draft-ietf-secevent-subject-identifiers#section-3.2.2)  The Aliases Identifier Format describes a subject that is identified with a list of different Subject Identifiers.  It is intended for use when a variety of identifiers have been shared with the party that will be interpreting the Subject Identifier, and it is unknown which of those identifiers they will recognize or support.  Subject Identifiers in this format MUST contain an \"identifiers\" member whose value is a JSON array containing one or more Subject Identifiers. Each Subject Identifier in the array MUST identify the same entity. The \"identifiers\" member is REQUIRED and MUST NOT be null or empty. It MAY contain multiple instances of the same Identifier Format (e.g., multiple Email Subject Identifiers), but SHOULD NOT contain exact duplicates.  This format is identified by the name \"aliases\".  \"alias\" Subject Identifiers MUST NOT be nested; i.e., the \"identifiers\" member of an \"alias\" Subject Identifier MUST NOT contain a Subject Identifier in the \"aliases\" format.'")
public class Aliases implements Subject {

  private String format = "aliases";

  @Valid
  private List<@Valid SimpleSubject> identifiers = new ArrayList<>();

  public Aliases() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Aliases(String format, List<@Valid SimpleSubject> identifiers) {
    this.format = format;
    this.identifiers = identifiers;
  }

  public Aliases format(String format) {
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

  public Aliases identifiers(List<@Valid SimpleSubject> identifiers) {
    this.identifiers = identifiers;
    return this;
  }

  public Aliases addIdentifiersItem(SimpleSubject identifiersItem) {
    if (this.identifiers == null) {
      this.identifiers = new ArrayList<>();
    }
    this.identifiers.add(identifiersItem);
    return this;
  }

  /**
   * Get identifiers
   * @return identifiers
  */
  //@NotNull @Valid @Size(min = 1)
  @Schema(name = "identifiers", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("identifiers")
  public List<@Valid SimpleSubject> getIdentifiers() {
    return identifiers;
  }

  public void setIdentifiers(List<@Valid SimpleSubject> identifiers) {
    this.identifiers = identifiers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Aliases aliases = (Aliases) o;
    return Objects.equals(this.format, aliases.format) &&
        Objects.equals(this.identifiers, aliases.identifiers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, identifiers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Aliases {\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    identifiers: ").append(toIndentedString(identifiers)).append("\n");
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

