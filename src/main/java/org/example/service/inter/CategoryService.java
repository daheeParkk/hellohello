package org.example.service.inter;


import org.example.domain.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getCategoryList();
    Category getCategory(Long id);
    void createCategory(Category category);
    void updateCategory(Category category);
    void deleteCategory(Long id);
}
