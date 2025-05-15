package de.ait.userapi.controller;

import de.ait.userapi.dto.ProductResponseDto;
import de.ait.userapi.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
(получить все продукты, получить продукт по id, сохранить продукт в бахе
 */
@RestController
@RequiredArgsConstructor
public class ProductController {
    private final ProductService service;

    @GetMapping("/products")
    public List<ProductResponseDto> getProducts(){
        return service.getAllProducts();
    }

    @GetMapping("/products/{id}")
    public ProductResponseDto getById(@PathVariable(name = "id") Long productId){
        return service.getProductById(productId);
    }
}
