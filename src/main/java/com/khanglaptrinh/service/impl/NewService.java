package com.khanglaptrinh.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.khanglaptrinh.dao.INewDAO;
import com.khanglaptrinh.model.NewsModel;
import com.khanglaptrinh.service.INewService;

public class NewService implements INewService {

	@Inject
	private INewDAO newDAO;
	
	@Override
	public List<NewsModel> findByCategoryId(Long categoryId) {
		return newDAO.findByCategoryId(categoryId);
	}

	@Override
	public NewsModel save(NewsModel newsModel) {
		Long newsId = newDAO.save(newsModel);
		System.out.println(newsId);
		return null;
	}

}
