package com.mojafirma.springbookshop.interfaces;

import com.mojafirma.springbookshop.model.Author;
import com.mojafirma.springbookshop.model.Book;

import java.util.List;

public interface AuthorService {

    List<Author> getAllAuthorss();
    void saveAuthor(Author author);
    Author getAuthor(Long id);
}
