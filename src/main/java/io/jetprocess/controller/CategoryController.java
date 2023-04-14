package io.jetprocess.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.jetprocess.model.Category;
import io.jetprocess.service.CategoryService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/jetprocess/category")
public class CategoryController {

	
	private CategoryService categoryService;

	public CategoryController(CategoryService categoryService) {
		super();
		this.categoryService = categoryService;
	}
	// build get Category List REST API
	// http://localhost:8080/api/v1/jetprocess/category
	@GetMapping
	public List<Category> getAllCategoryList(){
		return categoryService.getAllCategoryList();	
	}
 
	
	
}
