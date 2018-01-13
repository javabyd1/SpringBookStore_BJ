package com.mojafirma.springbookshop.service;

import com.mojafirma.springbookshop.interfaces.AuthorService;
import com.mojafirma.springbookshop.interfaces.CategoryService;
import com.mojafirma.springbookshop.model.Author;
import com.mojafirma.springbookshop.model.Category;
import com.mojafirma.springbookshop.repository.AuthorRepository;
import com.mojafirma.springbookshop.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public void saveCategory(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public Category getCategory(Long id) {
        return categoryRepository.findOne(id);
    }
}
