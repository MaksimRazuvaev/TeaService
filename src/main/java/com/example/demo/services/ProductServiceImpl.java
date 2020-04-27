package com.example.demo.services;

import com.example.demo.models.Product;
import com.example.demo.repositories.ProductRepository;

import java.util.List;

public class ProductServiceImpl implements ProductService{

    private ProductRepository ProductRepository;

    public List<Product> getAllProduct() {
        return ProductRepository.getAllProduct();
    }

    public Product getProductByCategoryId(int categoryId) {
        return ProductRepository.getProductByCategoryId(categoryId);
    }
}
