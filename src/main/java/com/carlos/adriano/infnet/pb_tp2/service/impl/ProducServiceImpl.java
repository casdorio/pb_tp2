package com.carlos.adriano.infnet.pb_tp2.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.carlos.adriano.infnet.pb_tp2.model.Product;
import com.carlos.adriano.infnet.pb_tp2.repository.ProductRepository;
import com.carlos.adriano.infnet.pb_tp2.service.ProductService;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProducServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public Product create(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        if(!productRepository.existsById(id)) {
            throw new EntityNotFoundException("Produto não encontrado " + id);
        }
        productRepository.deleteById(id);
    }

    @Override
    public Product update(Long id, Product productAlterado) {
        return productRepository.findById(id).map(product -> {
            product.setName(productAlterado.getName());
            product.setDescription(productAlterado.getDescription());
            return productRepository.save(product);
        }).orElseGet(() -> {
            productAlterado.setId(id);
            return productRepository.save(productAlterado);
        });
    }

}
