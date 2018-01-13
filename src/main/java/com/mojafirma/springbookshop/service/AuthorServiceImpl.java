package com.mojafirma.springbookshop.service;

import com.mojafirma.springbookshop.interfaces.AuthorService;
import com.mojafirma.springbookshop.interfaces.BookService;
import com.mojafirma.springbookshop.model.Author;
import com.mojafirma.springbookshop.model.Book;
import com.mojafirma.springbookshop.repository.AuthorRepository;
import com.mojafirma.springbookshop.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    @Override
    public List<Author> getAllAuthorss() {
        return authorRepository.findAll();
    }

    @Override
    public void saveAuthor(Author author) {
        authorRepository.save(author);
    }

    @Override
    public Author getAuthor(Long id) {
        return authorRepository.findOne(id);
    }
}
