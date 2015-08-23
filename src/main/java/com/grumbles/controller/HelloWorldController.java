package com.grumbles.controller;

import com.grumbles.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    private ProductService productService;

    @Autowired
    public HelloWorldController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/")
    public String home() {
        return productService.getProductName(1);
    }
}
