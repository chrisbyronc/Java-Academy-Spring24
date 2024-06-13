package org.example;

import java.sql.*;
import javax.sql.DataSource;

public class App 
{

    public static void main( String[] args )
    {

        String url = "jdbc:mysql://localhost:3306/northwind";
        String username = "root";
        String password = args[0];

        String query = "SELECT * FROM Products WHERE ProductName LIKE ? OR ProductID = ?";

        try {
            Connection connection;
            connection = DriverManager.getConnection(url, username, password);
            PreparedStatement statement = connection.prepareStatement(query);

            String userSearch = "a";

            statement.setString(1, userSearch);
            statement.setInt(2, 100);

            ResultSet results = statement.executeQuery();

            while(results.next()) {
                System.out.println(results.getString("ProductName"));
            }

            results.close();
            statement.close();
            connection.close();








        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
