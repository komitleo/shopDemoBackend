package com.komitleo.shopdemo.product.controller;

import com.komitleo.shopdemo.product.model.Product;
import com.komitleo.shopdemo.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/api/products")
    public List<Product> getProduct(){
        return productService.getProducts();
    }

}