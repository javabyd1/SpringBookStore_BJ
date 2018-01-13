package com.mojafirma.springbookshop.service;

import com.mojafirma.springbookshop.interfaces.BookService;
import com.mojafirma.springbookshop.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mojafirma.springbookshop.repository.BookRepository;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepository bookRepository;

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public void saveBook(Book book) {
        bookRepository.save(book);
    }

    @Override
    public Book getBook(Long id) {
        return bookRepository.findOne(id);
    }
}
