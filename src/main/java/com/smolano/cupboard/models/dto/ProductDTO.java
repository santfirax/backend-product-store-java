package com.smolano.cupboard.models.dto;

import java.util.List;
import java.util.Set;

public class ProductDTO {
    private String name;
    private Set<CategoryDTO> categories;
    private String barCode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<CategoryDTO> getCategories() {
        return categories;
    }

    public void setCategories(Set<CategoryDTO> categories) {
        this.categories = categories;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    @Override
    public String toString() {
        return "ProductDTO{" +
                "name='" + name + '\'' +
                ", categories=" + categories +
                ", barCode='" + barCode + '\'' +
                '}';
    }
}
