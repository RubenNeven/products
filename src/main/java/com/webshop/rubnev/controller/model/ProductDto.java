package com.webshop.rubnev.controller.model;

import lombok.*;

import javax.persistence.Column;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDto {
    private Long id;

    private String name;

    private String category;

    private int price;
}
