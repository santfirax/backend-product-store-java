package com.smolano.cupboard.repositories;

import com.smolano.cupboard.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
