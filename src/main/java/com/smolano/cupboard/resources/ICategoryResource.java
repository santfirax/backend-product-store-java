package com.smolano.cupboard.resources;

import com.smolano.cupboard.entities.Category;
import com.smolano.cupboard.models.dto.CategoryDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RequestMapping("/categories")
public interface ICategoryResource {
    @PostMapping
    ResponseEntity<Category> createCategory(URI location, @RequestBody CategoryDTO categoryDTO);

    @GetMapping
    ResponseEntity<List<Category>> getAllCategories();

    @PutMapping
    ResponseEntity<CategoryDTO> updateCategory(URI location, @RequestBody CategoryDTO categoryDTO);

    @GetMapping("/{id}")
    ResponseEntity<CategoryDTO> getCategoryById(@PathVariable String id);
}
