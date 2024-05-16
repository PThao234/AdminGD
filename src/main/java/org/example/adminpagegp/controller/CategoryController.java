package org.example.adminpagegp.controller;

import org.example.adminpagegp.entity.Categories;
import org.example.adminpagegp.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/api/v1/category/")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("create")
    public ModelAndView create(){
        return new ModelAndView("/admin/category/create");
    }

    @PostMapping ("create")
    public Categories create(@RequestBody Categories categories){
        return categoryService.create(categories);
    }

    @GetMapping("search")
    public List<Categories> search(@RequestParam String key){
        return categoryService.search(key);
    }
}
