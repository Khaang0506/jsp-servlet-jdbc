package com.khanglaptring.dao;

import java.util.List;

import com.khanglaptrinh.model.CategoryModel;

public interface ICategoryDAO {
	List<CategoryModel> findAll();
}
