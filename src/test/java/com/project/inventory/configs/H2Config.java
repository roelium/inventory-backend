package com.project.inventory.configs;

import com.project.inventory.models.Category;
import com.project.inventory.repositories.CategoryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class H2Config {

    private static final Logger logger = LoggerFactory.getLogger(H2Config.class);

    public static final List<Category> mockCategories = List.of(
            new Category(1L,"category1"),
            new Category(2L,"category2")

    );

    @Bean
    CommandLineRunner initDb(CategoryRepository repository) {
        return args -> mockCategories.forEach(repository::save);
    }
}
