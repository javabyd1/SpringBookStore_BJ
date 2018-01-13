package com.mojafirma.springbookshop.controller;

import com.mojafirma.springbookshop.model.Book;
import com.mojafirma.springbookshop.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("/books")
public class BookRestController {

    @Autowired
    private BookServiceImpl bookService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Book> getBookList() {
        return bookService.getAllBooks();
    }

    @RequestMapping(method = POST)
    public void saveBook(@RequestBody Book book) {
        bookService.saveBook(book);
    };
}
