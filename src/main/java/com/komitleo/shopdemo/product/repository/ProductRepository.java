package com.komitleo.shopdemo.product.repository;

import com.komitleo.shopdemo.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
