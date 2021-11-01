package com.smolano.cupboard.models.dto;

import java.util.List;
import java.util.Set;

public class CategoryDTO {
    private String name;
    private Set<ProductDTO> products;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<ProductDTO> getProducts() {
        return products;
    }

    public void setProducts(Set<ProductDTO> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "CategoryDTO{" +
                "name='" + name + '\'' +
                ", products=" + products +
                '}';
    }
}
