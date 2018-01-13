package com.mojafirma.springbookshop.interfaces;

import com.mojafirma.springbookshop.model.Book;

import java.util.List;

public interface BookService {

    List<Book> getAllBooks();
    void saveBook(Book book);
    Book getBook(Long id);
}
