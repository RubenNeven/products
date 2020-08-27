package com.webshop.rubnev.controller;

import com.webshop.rubnev.controller.model.ProductList;
import com.webshop.rubnev.entity.Product;
import com.webshop.rubnev.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    private final ProductService productService;


    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public ResponseEntity<ProductList> findAllProducts(){
        List<Product> products = productService.findAllProducts();
        return ResponseEntity.status(HttpStatus.OK)
                .body(new ProductList(products));
    }
}
