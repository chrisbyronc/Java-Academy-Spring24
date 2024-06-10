package org.example;

import java.sql.*;
import javax.sql.DataSource;

public class App 
{

    public static void main( String[] args )
    {

        String url = "jdbc:mysql://127.0.0.1:3306/northwind";
        String username = "root";
        String password = args[0];

        try {
            Connection connection;
            connection = DriverManager.getConnection(url, username, password);

            Statement statement = connection.createStatement();

            String query = "SELECT ProductName FROM Products";

            ResultSet results = statement.executeQuery(query);

            while(results.next()) {
                System.out.println(results.getString(1));
            }

            connection.close();








        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
