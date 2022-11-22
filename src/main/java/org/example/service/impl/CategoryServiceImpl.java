package org.example.service.impl;

import org.example.domain.Category;
import org.example.repository.CategoryMapper;
import org.example.service.inter.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryMapper categoryMapper;

    @Autowired
    public CategoryServiceImpl(CategoryMapper categoryMapper) {
        this.categoryMapper = categoryMapper;
    }

    public List<Category> getCategoryList() {
        return categoryMapper.selectCategoryList();
    }

    public Category getCategory(Long id) {
        return categoryMapper.selectCategory(id);
    }

    public void createCategory(Category category) {
        categoryMapper.createCategory(category);
    }

    public void updateCategory(Category category) {
        categoryMapper.updateCategory(category);
    }

    public void deleteCategory(Long id) {
        categoryMapper.deleteCategory(id);
    }
}
