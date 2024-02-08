package com.baeldung.springdoc.repository;

import com.baeldung.springdoc.model.Stream;
import com.baeldung.springdoc.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StreamRepository extends JpaRepository<User, String> {
    Stream findByName(String name);
}
