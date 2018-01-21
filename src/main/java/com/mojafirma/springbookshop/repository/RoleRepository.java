package com.mojafirma.springbookshop.repository;

import com.mojafirma.springbookshop.model.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Roles, Long> {

    Roles findByRole(String role);
}
