package dao;

import model.NewsModel;

import java.util.List;

public interface INewDAO extends IGenericDAO {
    List<NewsModel> findByCategoryId(Long categoryId);
}
