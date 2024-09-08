package com.carlos.adriano.infnet.pb_tp2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carlos.adriano.infnet.pb_tp2.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> { 
}
