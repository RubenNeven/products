package com.webshop.rubnev.controller.model;

import com.webshop.rubnev.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductList {
    List<Product> products;


}
