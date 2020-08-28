package com.webshop.rubnev.controller;

import com.webshop.rubnev.controller.model.ProductDto;
import com.webshop.rubnev.controller.model.ProductList;
import com.webshop.rubnev.entity.Product;
import com.webshop.rubnev.service.ProductService;
import com.webshop.rubnev.service.utilities.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;
    private final ProductMapper productMapper;


    @Autowired
    public ProductController(ProductService productService, ProductMapper productMapper) {
        this.productService = productService;
        this.productMapper = productMapper;
    }

    @GetMapping()
    public ResponseEntity<ProductList> findAllProducts(){
        List<Product> products = productService.findAllProducts();
        return ResponseEntity.status(HttpStatus.OK)
                .body(new ProductList(products));
    }
}
