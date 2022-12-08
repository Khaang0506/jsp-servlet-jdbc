package com.khanglaptrinh.dao.impl;

import java.util.List;

import com.khanglaptrinh.dao.INewDAO;
import com.khanglaptrinh.mapper.NewsMapper;
import com.khanglaptrinh.model.NewsModel;

public class NewDAO extends AbstractDAO<NewsModel> implements INewDAO {

	@Override
	public List<NewsModel> findByCategoryId(Long categoryId) {
		String sql = "SELECT * FROM news WHERE categoryid = ?";
		return query(sql, new NewsMapper(), categoryId);
	}

	@Override
	public Long save(NewsModel newsModel) {
		String sql = "INSERT INTO news (title, content, categoryid) VALUES(?,?,?)";
		return insert(sql, newsModel.getTitle(), newsModel.getContent(), newsModel.getCategoryId());
	}

}
