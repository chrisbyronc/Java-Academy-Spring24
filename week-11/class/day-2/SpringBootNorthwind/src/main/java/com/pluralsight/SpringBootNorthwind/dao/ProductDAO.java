package com.pluralsight.SpringBootNorthwind.dao;

import com.pluralsight.SpringBootNorthwind.model.Product;

import java.util.List;

public interface ProductDAO {

    Product getByName();

    Product getByCategoryID();

    String getAllProducts();



}
