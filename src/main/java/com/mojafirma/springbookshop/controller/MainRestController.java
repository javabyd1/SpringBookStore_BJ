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
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/authors/{id}")
    public ResponseEntity<Author> getAuthorById(@PathVariable Long id) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(authorService.findById(id));
    }


    @Autowired
    private BookServiceImpl bookService;

    @CrossOrigin("http://localhost:9999")
    @GetMapping("/books")
    public List<Book> getBookList() {
        return bookService.getAllBooks();
    }

    @GetMapping("/books/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(bookService.findById(id));
    }

    @GetMapping("/booksByTitle/{title}")
    public Book getBookByTitle(@PathVariable String title) {
        return bookService.findByTitle(title);
    }

    @CrossOrigin("http://localhost:9999")
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

    @GetMapping("/categories/{id}")
    public ResponseEntity<Category> getCategoryById(@PathVariable Long id) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(categoryService.findById(id));
    }


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

    @GetMapping("/publishers/{id}")
    public ResponseEntity<Publisher> getPublisherById(@PathVariable Long id) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(publisherService.findById(id));
    }
}
