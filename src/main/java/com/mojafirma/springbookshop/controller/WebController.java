package com.mojafirma.springbookshop.controller;

import com.mojafirma.springbookshop.model.Book;
import com.mojafirma.springbookshop.service.AuthorServiceImpl;
import com.mojafirma.springbookshop.service.BookServiceImpl;
import com.mojafirma.springbookshop.service.CategoryServiceImpl;
import com.mojafirma.springbookshop.service.PublisherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

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
        model.addObject("categories", categoryService.getAllCategories());
        model.addObject("publishers", publisherService.getAllPublishers());
        model.addObject("authors", authorService.getAllAuthorss());
        model.addObject("book", new Book());
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

    @PostMapping("addbook")
    public String addBook(@ModelAttribute("book") @Valid Book book, BindingResult bookResult, RedirectAttributes redirectAttributes) {

        bookService.saveBook(book);
        redirectAttributes.addFlashAttribute("message", "Successfully added..");

        return "redirect:/booklist";
    }
}
