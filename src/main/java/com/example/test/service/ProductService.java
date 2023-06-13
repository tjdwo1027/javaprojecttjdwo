package com.example.test.service;


import com.example.test.entity.Product;

import java.util.List;

public interface ProductService {
    Product updateProduct(Long id, Product product);

    Product createProduct(Product product);

    void deleteProduct(Long id);

    List<Product> getProductList();

    List<Product> getProductListOrderByPrice();

    List<Product> getProductListByName(String name);

    Product getProductById(Long id);
}
