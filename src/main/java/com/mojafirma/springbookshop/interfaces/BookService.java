package com.mojafirma.springbookshop.interfaces;

import com.mojafirma.springbookshop.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {

    List<Book> getAllBooks();
    void saveBook(Book book);
    Book getBook(Long id);
    Book findByTitle(String title);
    Book findById(Long id);
}
