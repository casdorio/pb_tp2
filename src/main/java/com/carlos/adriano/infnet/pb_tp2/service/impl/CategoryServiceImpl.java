package com.carlos.adriano.infnet.pb_tp2.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.carlos.adriano.infnet.pb_tp2.model.Category;
import com.carlos.adriano.infnet.pb_tp2.model.Product;
import com.carlos.adriano.infnet.pb_tp2.repository.CategoryRepository;
import com.carlos.adriano.infnet.pb_tp2.service.CategoryService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {


    private final CategoryRepository categoryRepository;

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Optional<Category> findById(Long id) {
        return categoryRepository.findById(id);
    }
    
    @Override
    public List<Product> findProductsByCategory(Long categoryId) {
        Category category = categoryRepository.findById(categoryId)
                .orElseThrow(() -> new RuntimeException("Categoria não encontrada"));
        return category.getProducts();
    }
}
