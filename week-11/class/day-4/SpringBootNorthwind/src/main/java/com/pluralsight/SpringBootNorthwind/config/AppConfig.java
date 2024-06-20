package com.pluralsight.SpringBootNorthwind.config;

import com.pluralsight.SpringBootNorthwind.dao.ProductDAO;
import com.pluralsight.SpringBootNorthwind.dao.ProductDAOImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Value("${datasource.username}")
    private String username;

    @Value("${datasource.password}")
    private String password;

    @Bean
    public ProductDAO productDAO() {
        return new ProductDAOImpl(username, password);
    }

}
