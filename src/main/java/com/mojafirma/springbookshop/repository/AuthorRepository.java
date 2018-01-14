package com.mojafirma.springbookshop.repository;

import com.mojafirma.springbookshop.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthorRepository extends JpaRepository<Author, Long>{

    public Author findByName(String name);
    public Optional<Author> findById(Long id);
}
