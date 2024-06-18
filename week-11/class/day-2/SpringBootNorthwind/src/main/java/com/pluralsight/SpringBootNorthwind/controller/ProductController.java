package com.pluralsight.SpringBootNorthwind.controller;

import com.pluralsight.SpringBootNorthwind.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @RequestMapping(path="/", method= RequestMethod.GET)
    public String index(@RequestParam(defaultValue = "World") String name) {
        return "Hello " + name;
    }

    @RequestMapping(path="/products", method=RequestMethod.GET)
    public String products() {
        return productService.getAllProducts();
    }
}
