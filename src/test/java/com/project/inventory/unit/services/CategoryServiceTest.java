package com.project.inventory.unit.services;

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
import org.modelmapper.ModelMapper;

import static org.hamcrest.Matchers.any;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class CategoryServiceTest {

    AutoCloseable closeable;

    @Mock
    private CategoryRepository categoryRepository;

    @Mock
    private ModelMapper modelMapper;

    @InjectMocks
    private CategoryService categoryService;

    @BeforeEach
    void setUp() {
        closeable = MockitoAnnotations.openMocks(this);
    }

    @Test
    void createCategory() {
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setName("Test category");
        categoryDTO.setId(1L);

        Response response = categoryService.createCategory(categoryDTO);

        assertEquals(201, response.getStatus());
    }

    @Test
    void getAllCategories() {
    }

    @Test
    void getCategoryById() {
    }

    @Test
    void updateCategory() {
    }

    @Test
    void deleteCategory() {
    }

    @AfterEach
    void tearDown() throws Exception {
        closeable.close();
    }
}