package com.smolano.cupboard.resources;

import com.smolano.cupboard.entities.Category;
import com.smolano.cupboard.models.dto.CategoryDTO;
import com.smolano.cupboard.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.List;

@RestController
public class CategoryResourceImpl implements ICategoryResource {
    @Autowired
    private CategoryService categoryService;

    @Override
    public ResponseEntity<Category> createCategory(URI location, CategoryDTO categoryDTO) {
        final Category category = categoryService.saveCategory(categoryDTO);
        return ResponseEntity.created(location).body(category);
    }

    @Override
    public ResponseEntity<List<Category>> getAllCategories() {
        final List<Category> categories = categoryService.getAllCategories();
        return ResponseEntity.ok().body(categories);
    }

    @Override
    public ResponseEntity<CategoryDTO> updateCategory(URI location, CategoryDTO categoryDTO) {
        return null;
    }

    @Override
    public ResponseEntity<CategoryDTO> getCategoryById(String id) {
        return null;
    }
}
