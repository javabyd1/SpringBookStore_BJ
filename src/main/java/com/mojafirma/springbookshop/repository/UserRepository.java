package com.mojafirma.springbookshop.repository;

import com.mojafirma.springbookshop.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findAllByName(String name);
    User findByLastname(String lastname);
    User findById(Long id);
    User findByEmail(String email);
}
