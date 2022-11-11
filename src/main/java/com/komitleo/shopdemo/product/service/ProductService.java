package com.komitleo.shopdemo.product.service;

import com.komitleo.shopdemo.product.model.Product;
import com.komitleo.shopdemo.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public Page<Product> getProducts(Pageable pageable){
        return productRepository.findAll(pageable);
    }

    public List<Product> getProductList(){
        return productRepository.findAll();
    }
}
