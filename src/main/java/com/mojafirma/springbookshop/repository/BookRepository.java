package com.mojafirma.springbookshop.repository;

import com.mojafirma.springbookshop.model.Author;
import com.mojafirma.springbookshop.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long>{

    public Book findByTitle(String title);
    public Book findById(int id);
}
