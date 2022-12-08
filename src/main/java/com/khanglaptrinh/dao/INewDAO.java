package com.khanglaptrinh.dao;

import java.util.List;

import com.khanglaptrinh.model.NewsModel;

public interface INewDAO extends GenericDAO<NewsModel> {
	List<NewsModel> findByCategoryId(Long categoryId);
	Long save(NewsModel newsModel);
}
