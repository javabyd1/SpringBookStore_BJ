package com.mojafirma.springbookshop.controller;

import com.mojafirma.springbookshop.model.Author;
import com.mojafirma.springbookshop.service.AuthorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorRestController {

    @Autowired
    private AuthorServiceImpl authorService;

    @GetMapping
    public List<Author> getAuthorList() {
        return authorService.getAllAuthorss();
    }

    @PostMapping
    public void saveAuthor(@RequestBody Author author) {
        authorService.saveAuthor(author);
    };
}
