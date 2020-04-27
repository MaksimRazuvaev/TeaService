package com.example.demo.controllers;

import com.example.demo.models.Category;
import com.example.demo.services.CategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CategoryController {

    private CategoryService categoryService;

    @GetMapping("/categories")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="Categories") String name, Model model) {
        List<Category> allCategories = categoryService.getAllCategories();
        model.addAttribute("categories", allCategories);
        String[] categoriesListString = {"One", "two", "three"};
        name = "Everyone";
        model.addAttribute("name", name);
        return "categories";
    }
}
