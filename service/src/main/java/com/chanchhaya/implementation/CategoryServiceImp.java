package com.chanchhaya.implementation;

import com.chanchhaya.CategoryService;
import com.chanchhaya.model.Category;
import com.chanchhaya.mybatis.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImp implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryServiceImp(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<Category> selectAll() {
        return categoryRepository.selectAll();
    }

}
