package com.smolano.cupboard.services;

import com.smolano.cupboard.entities.Product;
import com.smolano.cupboard.models.dto.ProductDTO;
import com.smolano.cupboard.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ConversionService conversionService;

    @Transactional
    public Product saveProduct(ProductDTO productDTO) {
        Product product = conversionService.mapObject(productDTO, Product.class);
        return productRepository.save(product);
    }

    @Transactional
    public List<Product> getAllProducts() {
        return this.productRepository.findAll();
    }
}
