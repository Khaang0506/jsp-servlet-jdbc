package com.khanglaptrinh.service;

import java.util.List;

import com.khanglaptrinh.model.NewsModel;

public interface INewService {
	List<NewsModel> findByCategoryId(Long categoryId);
	NewsModel save(NewsModel newsModel);
}
