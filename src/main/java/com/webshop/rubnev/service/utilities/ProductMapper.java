package com.webshop.rubnev.service.utilities;

import com.webshop.rubnev.controller.model.ProductDto;
import com.webshop.rubnev.entity.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public Product map(ProductDto productDto) {
        return Product.builder()
                .id(productDto.getId())
                .name(productDto.getName())
                .category(productDto.getCategory())
                .price(productDto.getPrice())
                .build();
    }

    public ProductDto map(Product product){
        return ProductDto.builder()
                .id(product.getId())
                .name(product.getName())
                .category(product.getName())
                .price(product.getPrice())
                .build();
    }
}
