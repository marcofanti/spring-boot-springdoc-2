package com.baeldung.springdoc.repository;

import com.baeldung.springdoc.model.Audience;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AudienceRepository extends JpaRepository<Audience, String> {
    Audience findByName(String name);
}
