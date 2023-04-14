package io.jetprocess.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import io.jetprocess.model.Category;
import io.jetprocess.repository.CategoryRepository;
import io.jetprocess.service.CategoryService;

@Service
public class CategoryServiceImpl  implements CategoryService{

	private CategoryRepository categoryRepository;
	
	public CategoryServiceImpl(CategoryRepository categoryRepository) {
		super();
		this.categoryRepository = categoryRepository;
		
	}
	@Override
	public List<Category> getAllCategoryList() {
		return categoryRepository.findAll();
	}

}
