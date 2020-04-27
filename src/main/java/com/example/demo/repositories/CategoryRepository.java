package com.example.demo.repositories;

import com.example.demo.models.Category;
import java.util.List;


//create methods how to interact with db
//First step is to write them in the interface and then implement in the "java class"
public interface CategoryRepository {
    void add(Category name);
    void delete(Category name);
    List<Category> getAllCategories();
}
