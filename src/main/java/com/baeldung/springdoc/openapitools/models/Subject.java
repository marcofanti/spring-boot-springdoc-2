package com.baeldung.springdoc.openapitools.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;


@JsonIgnoreProperties(
  value = "format", // ignore manually set format, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the format to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "format", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = AddSubjectParametersSubject.class, name = "AddSubjectParameters_subject"),
  @JsonSubTypes.Type(value = Aliases.class, name = "Aliases"),
  @JsonSubTypes.Type(value = ComplexSubject.class, name = "ComplexSubject"),
  @JsonSubTypes.Type(value = RemoveSubjectParametersSubject.class, name = "RemoveSubjectParameters_subject"),
  @JsonSubTypes.Type(value = SimpleSubject.class, name = "SimpleSubject"),
  @JsonSubTypes.Type(value = TriggerEventParametersSubject.class, name = "TriggerEventParameters_subject")
})

public interface Subject {
    public String getFormat();
}
