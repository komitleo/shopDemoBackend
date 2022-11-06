package com.komitleo.shopdemo.product.controller;

import com.komitleo.shopdemo.product.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/products")
    public List<Product> getProduct(){
        return List.of(
                new Product("Produkt 1", "Kategoria 2", "Opis 1", new BigDecimal("10.99"), "PLN"),
                new Product("Produkt 1", "Kategoria 2", "Opis 1", new BigDecimal("10.99"), "PLN"),
                new Product("Produkt 1", "Kategoria 2", "Opis 1", new BigDecimal("10.99"), "PLN"),
                new Product("Produkt 1", "Kategoria 2", "Opis 1", new BigDecimal("10.99"), "PLN"),
                new Product("Produkt 1", "Kategoria 2", "Opis 1", new BigDecimal("10.99"), "PLN"),
                new Product("Produkt 1", "Kategoria 2", "Opis 1", new BigDecimal("10.99"), "PLN")
        );
    }

}