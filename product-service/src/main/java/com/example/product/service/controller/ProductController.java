package com.example.product.service.controller;

import com.example.product.service.dto.request.ProductRequest;
import com.example.product.service.dto.request.response.ProductResponse;
import com.example.product.service.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {
    public final ProductService productService;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct( @RequestBody ProductRequest productRequest){
        productService.createProduct(productRequest);

    }

    @GetMapping
    @ResponseStatus
    public List<ProductResponse> getAllProduct(){
        return productService.getAllProduct();


    }
}
