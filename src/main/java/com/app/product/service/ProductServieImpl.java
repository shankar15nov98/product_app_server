package com.app.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.app.product.domain.Product;
import com.app.product.repository.ProductRepository;

@Service
public class ProductServieImpl implements ProductService{

	@Autowired
    private ProductRepository productRepository;

	@Override
	public Page<Product> listProducts(Pageable pageable) {
		return productRepository.findAll(pageable);
	}

    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    public Page<Product> searchProducts(String keyword,Pageable pageable) {
    	return productRepository.findByNameContaining(keyword, pageable);
    	
    }

	


    
}
