package com.pluralsight.SpringBootNorthwind.service;

import com.pluralsight.SpringBootNorthwind.dao.ProductDAO;
import com.pluralsight.SpringBootNorthwind.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.sql.*;

@Component
public class ProductService {

    private final ProductDAO productDAO;

    @Autowired
    public ProductService(ProductDAO productDAOImpl) {
        this.productDAO = productDAOImpl;
    }

    public List<Product> getAllProducts() {
        return productDAO.getAllProducts();
    }

    public List<Product> getProductByID(int id) {
        return productDAO.getProductByID(id);
    }

    public int addProduct(Product product) {
        return productDAO.addProduct(product);
    }




    public static Product generateProduct(ResultSet rs) throws SQLException {
        Product newProduct = new Product();
        newProduct.setProductName(rs.getString("productName"));
        newProduct.setUnitsInStock(rs.getInt("unitsInStock"));
        newProduct.setUnitsInOrder(rs.getInt("unitsOnOrder"));
        newProduct.setCategoryId(rs.getInt("categoryId"));
        newProduct.setQuantityPerUnit(rs.getString("quantityPerUnit"));
        newProduct.setUnitPrice(rs.getFloat("unitPrice"));
        newProduct.setProductID(rs.getInt("productId"));
        return newProduct;
    }

}
