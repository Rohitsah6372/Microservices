package com.example.product_service.Services;

import com.example.product_service.Models.Product;
import com.example.product_service.Repository.ProductRepository;
import com.example.product_service.dtos.request.ProductRequest;
import com.example.product_service.dtos.response.ProductResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Slf4j
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void createProduct(ProductRequest productRequest) {
        Product product = Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();

        productRepository.save(product);
        log.info("Product {} saved successfully", product.getId());
    }

    public List<ProductResponse> getAllProducts() {
        return productRepository.findAll().stream()
                .map(product -> ProductResponse.builder()
                        .name(product.getName())
                        .id(product.getId())
                        .description(product.getDescription())
                        .price(product.getPrice())
                        .build())
                .toList();  // Converts stream to list
    }

}
