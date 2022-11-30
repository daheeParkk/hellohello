package org.example.controller;

import org.example.domain.Board;
import org.example.domain.Category;
import org.example.service.inter.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public List<Category> getCategoryList() {
        return categoryService.selectCategoryList();
    }

    @GetMapping("/{id}")
    public Category getCategory(@PathVariable("id") Long id) {
        return categoryService.selectCategory(id);
    }

    @PostMapping("/")
    public String createCategory(@RequestBody Category category) {
        categoryService.createCategory(category);
        return "ok";
    }

    @PutMapping
    public String updateCategory(@RequestBody Category category) {
        categoryService.updateCategory(category);
        return "ok";
    }

    @DeleteMapping("/{id}")
    public String deleteCategory(@PathVariable("id") Long id) {
        return "ok";
    }

}
