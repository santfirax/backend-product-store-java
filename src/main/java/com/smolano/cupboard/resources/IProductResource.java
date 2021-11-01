package com.smolano.cupboard.resources;

import com.smolano.cupboard.entities.Product;
import com.smolano.cupboard.models.dto.ProductDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RequestMapping("/products")
public interface IProductResource {
    @PostMapping
    ResponseEntity<Product> createProduct(URI location, @RequestBody ProductDTO productDTO);

    @GetMapping
    ResponseEntity<List<Product>> getAllProducts();

    @PutMapping
    ResponseEntity<Product> updateProduct(URI location, @RequestBody ProductDTO productDTO);

    @GetMapping("/{name}")
    ResponseEntity<Product> getProductByName(@PathVariable String name);
}
