package com.baeldung.springdoc.repository;

import com.baeldung.springdoc.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    User findByName(String name);
}
