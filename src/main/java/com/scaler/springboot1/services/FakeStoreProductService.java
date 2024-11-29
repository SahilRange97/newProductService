package com.scaler.springboot1.services;

import com.scaler.springboot1.dtos.FakeStoreProductsDtos;
import com.scaler.springboot1.models.Category;
import com.scaler.springboot1.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class FakeStoreProductService implements ProductService{
   RestTemplate restTemplate;
    public FakeStoreProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    Product convertFakeStoreProductDtoToProduct(FakeStoreProductsDtos fakeStoreProductsDtos) {
        Product product = new Product();
        product.setTitle(fakeStoreProductsDtos.getTitle());
        product.setDescription(fakeStoreProductsDtos.getDescription());
        product.setPrice(fakeStoreProductsDtos.getPrice());
        product.setImage(fakeStoreProductsDtos.getImage());
        Category category = new Category();
        category.setDescription(fakeStoreProductsDtos.getCategory());
        product.setCategory(category);
        return product;
    }
    @Override
    public Product getProductById(long id) {
        FakeStoreProductsDtos fakeStoreProductsDtos
       = restTemplate.getForObject("https://fakestoreapi.com/products/" + id, FakeStoreProductsDtos.class);
        if (fakeStoreProductsDtos == null) {
         return null;
        }
        return convertFakeStoreProductDtoToProduct(fakeStoreProductsDtos);
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }
}
