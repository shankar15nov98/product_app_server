package com.app.product.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.product.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {


	Page<Product> findByNameContaining(String keyword, Pageable pageable);
}
