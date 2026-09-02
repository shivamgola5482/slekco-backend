package com.ecommerce.slekco.repository;

import com.ecommerce.slekco.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}