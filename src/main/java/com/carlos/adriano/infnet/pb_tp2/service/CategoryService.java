package com.carlos.adriano.infnet.pb_tp2.service;

import java.util.List;
import java.util.Optional;

import com.carlos.adriano.infnet.pb_tp2.model.Category;
import com.carlos.adriano.infnet.pb_tp2.model.Product;

public interface CategoryService {

    List<Category> findAll();

    Optional<Category> findById(Long id);

    List<Product> findProductsByCategory(Long categoryId);
}
