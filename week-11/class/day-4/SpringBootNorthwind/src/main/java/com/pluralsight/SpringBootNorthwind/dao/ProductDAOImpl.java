package com.pluralsight.SpringBootNorthwind.dao;

import com.pluralsight.SpringBootNorthwind.model.Product;
import com.pluralsight.SpringBootNorthwind.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.*;
import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

@Component
public class ProductDAOImpl implements ProductDAO {

    private DataSource dataSource;

    @Autowired
    public ProductDAOImpl(DataSource dataSource) {
        this.dataSource = dataSource;
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
    public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();

        String sql = "SELECT * FROM Products;";
        try(Connection connection = dataSource.getConnection()){
            Statement statement = connection.createStatement();
            ResultSet rows = statement.executeQuery(sql);
            while(rows.next()){
                products.add(ProductService.generateProduct(rows));
            }
        }
        catch (SQLException e){
            System.out.println(e);
        }

        return products;
    }

    @Override
    public List<Product> getProductByID(int id) {
        List<Product> product = new ArrayList<>();

        String sql = "SELECT * FROM Products WHERE ProductID = ?;";
        try(Connection connection = dataSource.getConnection()){
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);

            ResultSet rows = statement.executeQuery();
            while(rows.next()){
                product.add(ProductService.generateProduct(rows));
            }
        }
        catch (SQLException e){
            System.out.println(e);
        }

        return product;
    }

    @Override
    public int addProduct(Product product) {
        int res = 0;

        String sql = "INSERT INTO Products(ProductName, CategoryID, QuantityPerUnit, UnitsInStock, UnitsOnOrder, UnitPrice) VALUES(?,?,?,?,?,?);";

        try(Connection connection = dataSource.getConnection();){
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, product.getProductName());
            statement.setInt(2, product.getCategoryId());
            statement.setString(3, product.getQuantityPerUnit());
            statement.setInt(4, product.getUnitsInStock());
            statement.setInt(5, product.getUnitsOnOrder());
            statement.setFloat(6, product.getUnitPrice());
            statement.executeUpdate();

            try (ResultSet keys = statement.getGeneratedKeys()) {
                // Iterate through the primary keys that were generated
                while (keys.next()) {
                    res = keys.getInt(1);
                }
            }
        }
        catch (SQLException e){
            System.out.println(e);
        }
        return res;
    }

    @Override
    public int updateProduct(int id, Product product) {
        int res = 0;

        String sql = "UPDATE Products SET ProductName = ?, CategoryID = ?, QuantityPerUnit = ?, UnitsInStock = ?, UnitsOnOrder = ?, UnitPrice = ? WHERE ProductID = ?";

        try(Connection connection = dataSource.getConnection();){
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1, product.getProductName());
            statement.setInt(2, product.getCategoryId());
            statement.setString(3, product.getQuantityPerUnit());
            statement.setInt(4, product.getUnitsInStock());
            statement.setInt(5, product.getUnitsOnOrder());
            statement.setFloat(6, product.getUnitPrice());
            statement.setInt(7, id);
            res = statement.executeUpdate();
        }
        catch (SQLException e){
            System.out.println(e);
        }
        return res;
    }

    @Override
    public boolean deleteProduct(int id) {
        String sql = "DELETE FROM Products WHERE ProductID = ?";

        try(Connection connection = dataSource.getConnection();){
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            statement.execute();
            return true;
        }
        catch (SQLException e){
            System.out.println(e);
        }
        return false;
    }

}
