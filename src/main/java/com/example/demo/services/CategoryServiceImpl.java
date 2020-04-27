package com.example.demo.services;

import com.example.demo.models.Category;
import com.example.demo.repositories.CategoryRepository;

import java.util.List;


public class CategoryServiceImpl implements CategoryService {

//Create repositories's instance
//instance is variable that has attributes of the repository
    private CategoryRepository categoryRepository;

//We use methods from "repositories" to get date from the analog java class
    public void add(Category name) {
        categoryRepository.add(name);
    }

    public void delete(Category name) {
        categoryRepository.delete(name);
    }

    public List<Category> getAllCategories() {
        return categoryRepository.getAllCategories();
    }
}
