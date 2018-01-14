package com.mojafirma.springbookshop.controller;

import com.mojafirma.springbookshop.model.Author;
import com.mojafirma.springbookshop.model.Book;
import com.mojafirma.springbookshop.model.Category;
import com.mojafirma.springbookshop.model.Publisher;
import com.mojafirma.springbookshop.service.AuthorServiceImpl;
import com.mojafirma.springbookshop.service.BookServiceImpl;
import com.mojafirma.springbookshop.service.CategoryServiceImpl;
import com.mojafirma.springbookshop.service.PublisherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("/app")
public class MainRestController {

    @Autowired
    private AuthorServiceImpl authorService;

    @GetMapping("/authors")
    public List<Author> getAuthorList() {
        return authorService.getAllAuthorss();
    }

    @PostMapping("/authors")
    public void saveAuthor(@RequestBody Author author) {
        authorService.saveAuthor(author);
    };


    @Autowired
    private BookServiceImpl bookService;

    @GetMapping("/books")
    public List<Book> getBookList() {
        return bookService.getAllBooks();
    }

    @PostMapping("/books")
    public void saveBook(@RequestBody Book book) {
        bookService.saveBook(book);
    };


    @Autowired
    private CategoryServiceImpl categoryService;

    @GetMapping("/categories")
    public List<Category> getCategoryList() {
        return categoryService.getAllCategories();
    }

    @PostMapping("/categories")
    public void saveCategory(@RequestBody Category category) {
        categoryService.saveCategory(category);
    };


    @Autowired
    private PublisherServiceImpl publisherService;

    @GetMapping("/publishers")
    public List<Publisher> getPublisherList() {
        return publisherService.getAllPublishers();
    }

    @PostMapping("/publishers")
    public void savePublisher(@RequestBody Publisher publisher) {
        publisherService.savePublisher(publisher);
    };
}
