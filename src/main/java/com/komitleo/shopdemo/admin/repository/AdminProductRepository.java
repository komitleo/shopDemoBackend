package com.komitleo.shopdemo.admin.repository;

import com.komitleo.shopdemo.admin.model.AdminProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminProductRepository  extends JpaRepository<AdminProduct, Long> {
}
