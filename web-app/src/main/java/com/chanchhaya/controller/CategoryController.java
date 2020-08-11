package com.chanchhaya.controller;

import com.chanchhaya.implementation.CategoryServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategoryController {

    private final CategoryServiceImp categoryServiceImp;

    @Autowired
    public CategoryController(CategoryServiceImp categoryServiceImp) {
        this.categoryServiceImp = categoryServiceImp;
    }

    @GetMapping("web-app/categories")
    public String viewCategory(ModelMap modelMap) {
        modelMap.addAttribute("data", categoryServiceImp.selectAll());
        return "category";
    }

}
