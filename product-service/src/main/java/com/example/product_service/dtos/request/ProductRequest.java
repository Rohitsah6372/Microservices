package com.example.product_service.dtos.request;

import lombok.*;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter  // ✅ Ensure this is present to generate getName()
@Setter
@Builder
public class ProductRequest {
    private String name;
    private String description;
    private BigDecimal price;
}
