package com.carlos.adriano.infnet.pb_tp2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.carlos.adriano.infnet.pb_tp2.model.Category;
import com.carlos.adriano.infnet.pb_tp2.service.CategoryService;

@SpringBootTest
public class CategoryServiceTests {
    @Autowired
    private CategoryService categoryService;

    @Test
    void testFindById() {
        Optional<Category> category = categoryService.findById(1L);
        assertTrue(category.isPresent());
        assertEquals("Eletrônicos", category.get().getName());
    }

    @Test
    void testFindAll() {
        assertEquals(5, categoryService.findAll().size());
    }

}
