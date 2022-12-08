package com.khanglaptrinh.dao;

import java.util.List;

import com.khanglaptrinh.model.CategoryModel;

public interface ICategoryDAO extends GenericDAO<CategoryModel> {
	List<CategoryModel> findAll();
}
