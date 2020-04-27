package com.example.demo.services;

import com.example.demo.models.Category;
import java.util.List;


//Repeat methods from "repositories"
public interface CategoryService {
    void add(Category name);
    void delete(Long id);
    List<Category> getAllCategories();
}
