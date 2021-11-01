package com.smolano.cupboard.repositories;

import com.smolano.cupboard.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
