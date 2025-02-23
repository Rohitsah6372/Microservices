package com.example.product_service.Controllers;

import com.example.product_service.Services.ProductService;
import com.example.product_service.dtos.request.ProductRequest;
import com.example.product_service.dtos.response.ProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/product")
public class ProductController {


    @Autowired
    ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest){
        productService.createProduct(productRequest);

    }


    @GetMapping
    public List<ProductResponse> getAllProduct(){

        return  productService.getAllProducts();

    }


}
