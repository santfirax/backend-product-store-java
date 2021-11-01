package com.smolano.cupboard.resources;

import com.smolano.cupboard.entities.Product;
import com.smolano.cupboard.models.dto.ProductDTO;
import com.smolano.cupboard.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.List;

@RestController
public class ProductResourceImpl implements IProductResource {
    @Autowired
    private ProductService productService;


    @Override
    public ResponseEntity<Product> createProduct(URI location, ProductDTO productDTO) {
        Product product = productService.saveProduct(productDTO);
        return ResponseEntity.created(location).body(product);
    }

    @Override
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> products = productService.getAllProducts();
        return ResponseEntity.ok().body(products);
    }

    @Override
    public ResponseEntity<Product> updateProduct(URI location, ProductDTO productDTO) {
        return null;
    }

    @Override
    public ResponseEntity<Product> getProductByName(String name) {
        return null;
    }
}
