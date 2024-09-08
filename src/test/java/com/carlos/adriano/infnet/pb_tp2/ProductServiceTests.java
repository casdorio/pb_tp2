package com.carlos.adriano.infnet.pb_tp2;

import com.carlos.adriano.infnet.pb_tp2.model.Category;
import com.carlos.adriano.infnet.pb_tp2.model.Product;
import com.carlos.adriano.infnet.pb_tp2.service.ProductService;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.util.List;


public class ProductServiceTests {


    @Autowired
    private ProductService productService;

    @Test
    public void testCreateProduct() {
        List<Product> products = productService.findAll();
        int estadoInicial = products.size();
        Product product = new Product();
        product.setName("Produto Teste");
        product.setPrice(BigDecimal.valueOf(4999.44));
        product.setDescription("Descrição do produto teste");
        Category category = new Category();
        category.setId(1L);
        product.setCategory(category);
        productService.create(product);
        products = productService.findAll();
        int estadoFinal = products.size();
        assertEquals(estadoInicial + 1, estadoFinal);
    }

   
}
