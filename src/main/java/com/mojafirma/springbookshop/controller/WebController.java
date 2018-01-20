package com.mojafirma.springbookshop.controller;

import com.mojafirma.springbookshop.service.AuthorServiceImpl;
import com.mojafirma.springbookshop.service.BookServiceImpl;
import com.mojafirma.springbookshop.service.CategoryServiceImpl;
import com.mojafirma.springbookshop.service.PublisherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {

    @Autowired
    private BookServiceImpl bookService;
    @Autowired
    private AuthorServiceImpl authorService;
    @Autowired
    private PublisherServiceImpl publisherService;
    @Autowired
    private CategoryServiceImpl categoryService;

    @GetMapping(value = "booklist")
    public ModelAndView showBooks() {
        ModelAndView model = new ModelAndView();
        model.addObject("books", bookService.getAllBooks());
        model.setViewName("booklist");
        return model;
    }

    @GetMapping(value = "publisherlist")
    public ModelAndView showPublishers() {
        ModelAndView model = new ModelAndView();
        model.addObject("publishers", publisherService.getAllPublishers());
        model.setViewName("publisherlist");
        return model;
    }

    @GetMapping(value = "authorlist")
    public ModelAndView showAuthors() {
        ModelAndView model = new ModelAndView();
        model.addObject("authors", authorService.getAllAuthorss());
        model.setViewName("authorlist");
        return model;
    }

    @GetMapping(value = "categorylist")
    public ModelAndView showCategories() {
        ModelAndView model = new ModelAndView();
        model.addObject("categories", categoryService.getAllCategories());
        model.setViewName("categorylist");
        return model;
    }
}
