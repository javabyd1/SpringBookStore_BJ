package com.mojafirma.springbookshop.repository;

import com.mojafirma.springbookshop.model.Book;
import com.mojafirma.springbookshop.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Long>{

    public Optional<Category> findById(Long id);
}
