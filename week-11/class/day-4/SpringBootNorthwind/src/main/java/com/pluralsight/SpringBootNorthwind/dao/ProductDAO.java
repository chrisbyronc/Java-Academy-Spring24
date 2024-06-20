package com.pluralsight.SpringBootNorthwind.dao;

import com.pluralsight.SpringBootNorthwind.model.Product;

import java.util.List;

public interface ProductDAO {

    Product getByName();

    Product getByCategoryID();

    List<Product> getAllProducts();

    List<Product> getProductByID(int id);

    int addProduct(Product product);

    int updateProduct(int id, Product product);

    boolean deleteProduct(int id);

}
