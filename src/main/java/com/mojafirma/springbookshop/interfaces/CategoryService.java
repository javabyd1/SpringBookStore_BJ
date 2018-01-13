package com.mojafirma.springbookshop.interfaces;

import com.mojafirma.springbookshop.model.Book;
import com.mojafirma.springbookshop.model.Category;

import java.util.List;

public interface CategoryService {

    List<Category> getAllCategories();
    void saveCategory(Category category);
    Category getCategory(Long id);
}
