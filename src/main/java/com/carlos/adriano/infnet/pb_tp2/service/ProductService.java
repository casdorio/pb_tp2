package com.carlos.adriano.infnet.pb_tp2.service;

import java.util.List;
import java.util.Optional;

import com.carlos.adriano.infnet.pb_tp2.model.Product;


public interface ProductService {
    
    Product create(Product product);
    
    List<Product> findAll();
    
    Optional<Product> findById(Long id);
    
    void delete(Long id);
    
    Product update(Long id, Product product);
}
