package com.project.inventory.unit.controllers;

import com.project.inventory.controllers.CategoryController;
import org.junit.jupiter.api.Test;
import com.project.inventory.dtos.CategoryDTO;
import com.project.inventory.dtos.Response;
import com.project.inventory.models.Category;
import com.project.inventory.repositories.CategoryRepository;
import com.project.inventory.services.CategoryService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import static org.hamcrest.Matchers.any;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import static org.junit.jupiter.api.Assertions.*;

class CategoryControllerTest {

    AutoCloseable closeable;

    @Mock
    CategoryService categoryService;

    @InjectMocks
    CategoryController categoryController;

    @BeforeEach
    void setUp() {
        closeable = MockitoAnnotations.openMocks(this);
    }

    @Test
    void createCategory() {
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setName("Test");

        Response mockResponse = Response.builder().status(200)
                .message("Category test created successfully").build();

        when(categoryService.createCategory(categoryDTO)).thenReturn(mockResponse);
        ResponseEntity<Response> responseEntity = categoryController.createCategory(categoryDTO);

        assertEquals(200, responseEntity.getStatusCodeValue());
        assertEquals(mockResponse, responseEntity.getBody());

    }

    @Test
    void getAllCategories() {
    }

    @Test
    void getCategoryById() {
    }

    @Test
    void updateUser() {
    }

    @Test
    void deleteCategory() {
    }
}