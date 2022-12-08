package com.khanglaptrinh.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.khanglaptrinh.dao.ICategoryDAO;
import com.khanglaptrinh.model.CategoryModel;
import com.khanglaptrinh.service.ICategoryService;

public class CategoryService implements ICategoryService {

	@Inject
	private ICategoryDAO categoryDAO;
	
	@Override
	public List<CategoryModel> findAll() {
		// TODO Auto-generated method stub
		return categoryDAO.findAll();
	}
	
}
