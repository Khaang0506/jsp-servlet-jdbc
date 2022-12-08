package com.khanglaptrinh.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.khanglaptrinh.model.NewsModel;

public class NewsMapper implements RowMapper<NewsModel> {

	@Override
	public NewsModel mapRow(ResultSet resultSet) {
		try {
			NewsModel news = new NewsModel();
			news.setCategoryId(resultSet.getLong("categoryid"));
			news.setTitle(resultSet.getString("title"));
			return news;
		} catch (SQLException e) {
			return null;
		}
	}

}
