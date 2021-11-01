package com.smolano.cupboard.services;

import com.smolano.cupboard.entities.Category;
import com.smolano.cupboard.models.dto.CategoryDTO;
import com.smolano.cupboard.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    ConversionService conversionService;
    @Transactional
    public Category saveCategory(CategoryDTO categoryDTO) {
        Category category = conversionService.mapObject(categoryDTO, Category.class);
        return this.categoryRepository.save(category);
    }

    @Transactional
    public List<Category> getAllCategories() {
        return this.categoryRepository.findAll();

    }
}
