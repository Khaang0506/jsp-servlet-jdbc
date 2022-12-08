package com.khanglaptrinh.dao.impl;

import java.util.List;

import com.khanglaptrinh.dao.ICategoryDAO;
import com.khanglaptrinh.mapper.CategoryMapper;
import com.khanglaptrinh.model.CategoryModel;

public class CategoryDAO extends AbstractDAO<CategoryModel> implements ICategoryDAO {

	@Override
	public List<CategoryModel> findAll() {
		String sql = "SELECT * FROM category";
		return query(sql, new CategoryMapper());
	}

}
