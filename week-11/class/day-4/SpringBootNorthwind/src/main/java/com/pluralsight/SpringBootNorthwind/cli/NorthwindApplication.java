package com.pluralsight.SpringBootNorthwind.cli;

import com.pluralsight.SpringBootNorthwind.model.Product;
import com.pluralsight.SpringBootNorthwind.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class NorthwindApplication implements CommandLineRunner {

    private final ProductService productService;

    @Autowired
    public NorthwindApplication(ProductService productService) {
        this.productService = productService;
    }


    @Override
    public void run(String... args) throws Exception {
//        System.out.println(productService.getAllProducts());
    }
}
