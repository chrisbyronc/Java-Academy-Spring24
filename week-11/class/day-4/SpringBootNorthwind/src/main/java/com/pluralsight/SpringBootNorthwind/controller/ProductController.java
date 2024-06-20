package com.pluralsight.SpringBootNorthwind.controller;

import com.pluralsight.SpringBootNorthwind.model.Product;
import com.pluralsight.SpringBootNorthwind.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public List<Product> products() {
        return productService.getAllProducts();
    }

    @RequestMapping(path="/products/{id}", method=RequestMethod.GET)
    public List<Product> product(@PathVariable int id) {
        return productService.getProductByID(id);
    }

    @RequestMapping(path="/products", method=RequestMethod.POST)
    public int addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    @RequestMapping(path="/products/{id}", method=RequestMethod.PUT)
    public int updateProduct(@PathVariable int id, @RequestBody Product product) {
//        return productService.updateProduct(id, product);
        return 0;
    }

    @RequestMapping(path="/products/{id}", method=RequestMethod.DELETE)
    public int deleteProduct(@PathVariable int id) {
//        return productService.updateProduct(id, product);
        return 0;
    }

}
