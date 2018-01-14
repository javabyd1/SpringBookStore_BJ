package com.mojafirma.springbookshop.interfaces;

import com.mojafirma.springbookshop.model.Author;
import com.mojafirma.springbookshop.model.Book;

import java.util.List;
import java.util.Optional;

public interface AuthorService {

    List<Author> getAllAuthorss();
    void saveAuthor(Author author);
    Author getAuthor(Long id);
    Author findById(Long id);
}
