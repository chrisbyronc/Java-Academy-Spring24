package com.pluralsight.SpringBootNorthwind.dao;

import com.pluralsight.SpringBootNorthwind.model.Product;

import java.util.List;

public class ProductDAOImpl implements ProductDAO {


    public ProductDAOImpl(String username, String password) {
        System.out.println("User signed in: " + username);

//        @TODO add db connection
    }

    @Override
    public Product getByName() {
        return null;
    }

    @Override
    public Product getByCategoryID() {
        return null;
    }

    @Override
    public String getAllProducts() {
        return "Getting all proudcts";
    }
}
