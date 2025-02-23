package com.example.product_service.dtos.response;

import lombok.*;

import java.math.BigDecimal;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class ProductResponse {

    String id;
    String name;
    String description;
    BigDecimal price;


}
