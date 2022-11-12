package com.komitleo.shopdemo.admin.controller;

import com.komitleo.shopdemo.admin.model.AdminProduct;
import com.komitleo.shopdemo.admin.service.AdminProductService;
import com.komitleo.shopdemo.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AdminProductController {

    private final AdminProductService AdminProductService;

    @GetMapping("/admin/products")
    public Page <AdminProduct> getProducts(Pageable pageable){
        return AdminProductService.getProducts(pageable);
    }
}
