package com.scaler.springboot1.services;

import com.scaler.springboot1.models.Product;

import java.util.List;

public interface ProductService {
   Product getProductById(long id);
   List<Product> getAllProducts();
}
