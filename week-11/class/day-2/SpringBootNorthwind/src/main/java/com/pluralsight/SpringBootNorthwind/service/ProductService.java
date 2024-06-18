package com.pluralsight.SpringBootNorthwind.service;

import com.pluralsight.SpringBootNorthwind.dao.ProductDAO;
import com.pluralsight.SpringBootNorthwind.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductService {

    private final ProductDAO productDAO;

    @Autowired
    public ProductService(ProductDAO productDAOImpl) {
        this.productDAO = productDAOImpl;
    }

    public String getAllProducts() {
        return productDAO.getAllProducts();
    }

}
