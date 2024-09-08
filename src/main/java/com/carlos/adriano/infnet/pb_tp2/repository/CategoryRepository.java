package com.carlos.adriano.infnet.pb_tp2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carlos.adriano.infnet.pb_tp2.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> { 
}
