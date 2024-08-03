package com.app.product.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.app.product.domain.Product;

public interface ProductService {

	 public Page<Product> listProducts(Pageable pageable);

	    public Product getProductById(Long id);

	    public Product saveProduct(Product product);

	    public void deleteProduct(Long id);

	    public Page<Product> searchProducts(String keyword,Pageable pageable);
	    
	    
}
