package org.example.controller;

import org.example.domain.Board;
import org.example.domain.Category;
import org.example.service.inter.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/category")
public class CategoryController {

    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public String getCategoryList() {
        return "ok";
    }

    @GetMapping("/{id}")
    public String getCategory(@PathVariable("id") Long id) {
        return "ok";
    }

    @PostMapping("/c")
    public String createCategory(@RequestBody Category category) {
        categoryService.createCategory(category);
        return "ok";
    }
    @PutMapping
    @PatchMapping("/u")
    public String updateCategory(@RequestBody Category category) {
        categoryService.updateCategory(category);
        return "ok";
    }

    @DeleteMapping("/d/{id}")
    public String deleteCategory(@PathVariable("id") Long id) {
        return "ok";
    }

}
