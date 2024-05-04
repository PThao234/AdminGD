package org.example.adminpagegp.service;

import org.example.adminpagegp.entity.Categories;
import org.example.adminpagegp.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Categories> search(String key){
        return categoryRepository.findAll();
    }

    public Categories create(Categories categories){
        return categoryRepository.save(categories);
    }
}
