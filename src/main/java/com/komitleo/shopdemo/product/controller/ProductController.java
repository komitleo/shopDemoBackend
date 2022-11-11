package com.komitleo.shopdemo.product.controller;

import com.komitleo.shopdemo.product.model.Product;
import com.komitleo.shopdemo.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/products/page")
    public Page<Product> getProductsPage(Pageable pageable){
        return productService.getProducts(pageable);
    }
    @GetMapping("/products")
    public List<Product> getProductList(){
        return productService.getProductList();
    }

}