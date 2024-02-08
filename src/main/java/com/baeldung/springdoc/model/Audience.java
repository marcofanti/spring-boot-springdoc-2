package com.baeldung.springdoc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "audience")
public class Audience {
    @Id
    private String id;
    private String name;
    private String token;

    public Audience(String id, String name, String token) {
        this.id = id;
        this.name = name;
        this.token = token;
    }

    public Audience() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Audience audience = (Audience) o;
        return Objects.equals(name, audience.name);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Audience{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            ", token='" + token + '\'' +
            '}';
    }
}
