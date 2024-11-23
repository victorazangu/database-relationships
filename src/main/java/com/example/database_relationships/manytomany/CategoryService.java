package com.example.database_relationships.manytomany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository repo;

    public List<Category> allCategories() {
        return repo.findAll();
    }

    public Category getCategory(int id) {
        return repo.findById(id).get();
    }

    public Category addCategory(Category category) {
        category.setId(0);
        return repo.save(category);
    }

    public void deleteCategory(int id) {
        repo.deleteById(id);
    }
}