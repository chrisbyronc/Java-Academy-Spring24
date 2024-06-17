package org.example;

import org.apache.commons.dbcp2.BasicDataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SakilaDataManager {
    private BasicDataSource dataSource;
    public SakilaDataManager(String username, String password){
        // Create the datasource
        this.dataSource = new BasicDataSource();

        // Configure the datasource
        dataSource.setUrl("jdbc:mysql://localhost:3306/sakila");
        dataSource.setUsername(username);
        dataSource.setPassword(password);
    }
    public List<Actor> getAllActors() {
        List<Actor> actors = new ArrayList<>();
        String sql = "SELECT * FROM actor";

       return actors;
    }
    public List<Actor> getActorByLastName(String lastname) {
        List<Actor> actors = new ArrayList<>();
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement =
                     connection.prepareStatement(
                             "SELECT * FROM actor WHERE last_name LIKE ?");
        ) {
            preparedStatement.setString(1, lastname + "%");

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    actors.add(new Actor(resultSet.getInt("actor_id"), resultSet.getString("first_name"), resultSet.getString("last_name")));
                }
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        return actors;
    }
}