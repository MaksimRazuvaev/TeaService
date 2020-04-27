package com.example.demo.repositories;

import com.example.demo.models.Product;
import java.util.List;


public interface ProductRepository {
    List<Product> getAllProduct();
   Product getProductByCategoryId(int categoryId);
}
