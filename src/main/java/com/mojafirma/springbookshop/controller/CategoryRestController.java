package com.mojafirma.springbookshop.controller;

import com.mojafirma.springbookshop.model.Book;
import com.mojafirma.springbookshop.model.Category;
import com.mojafirma.springbookshop.service.BookServiceImpl;
import com.mojafirma.springbookshop.service.CategoryServiceImpl;
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
@RequestMapping("/categories")
public class CategoryRestController {

    @Autowired
    private CategoryServiceImpl categoryService;

    @GetMapping
    public List<Category> getBookList() {
        return categoryService.getAllCategories();
    }

    @PostMapping
    public void saveCategory(@RequestBody Category category) {
        categoryService.saveCategory(category);
    };
}
