package com.mojafirma.springbookshop.repository;

import com.mojafirma.springbookshop.model.Author;
import com.mojafirma.springbookshop.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long>{

    public Book findByTitle(String title);
    public Optional<Book> findById(Long id);
}
