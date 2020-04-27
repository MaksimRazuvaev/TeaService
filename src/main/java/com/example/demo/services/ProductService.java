package com.example.demo.services;

import com.example.demo.models.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProduct();
    Product getProductByCategoryId(int categoryId);
}
