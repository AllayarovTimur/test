package ru.shop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.shop.model.Product;
import ru.shop.service.CustomerService;
import ru.shop.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    ProductService productService;


    @GetMapping("/get")
    public List<Product> getAllProducts() {
        return productService.findAll();
    }




}
