package service;

import model.NewsModel;

import java.util.List;

public interface INewService {
    List<NewsModel> findByCategoryId(Long categoryId);
}
