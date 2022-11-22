package org.example.repository;

import org.example.domain.Category;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryMapper {

    List<Category> selectCategoryList();

    Category selectCategory(Long id);

    void createCategory(Category category);

    void updateCategory(Category category);

    void deleteCategory(Long id);
}
