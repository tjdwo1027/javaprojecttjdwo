package com.example.test.controller;


import com.example.test.entity.Product;
import com.example.test.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable("id") Long id, @RequestBody Product product) {
        return productService.updateProduct(id, product);
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") Long id) {
        productService.deleteProduct(id);
    }

    @GetMapping("/list")
    public List<Product> getProductList() {
        return productService.getProductList();
    }

    @GetMapping("/listOrderByPrice")
    public List<Product> getProductListOrderByPrice() {
        return productService.getProductListOrderByPrice();
    }

    @GetMapping("/byName/{name}")
    public List<Product> getProductListByName(@PathVariable("name") String name) {
        return productService.getProductListByName(name);
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Long id) {
        return productService.getProductById(id);
    }
}
