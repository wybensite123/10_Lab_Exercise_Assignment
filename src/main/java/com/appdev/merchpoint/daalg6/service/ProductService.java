package com.appdev.merchpoint.daalg6.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appdev.merchpoint.daalg6.entity.ProductEntity;
import com.appdev.merchpoint.daalg6.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<ProductEntity> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<ProductEntity> getProductById(int id) {
        return productRepository.findById(id);
    }

    public ProductEntity saveProduct(ProductEntity product) {
        return productRepository.save(product);
    }
}