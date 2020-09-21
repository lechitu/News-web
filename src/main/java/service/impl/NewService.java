package service.impl;

import dao.INewDAO;
import model.NewsModel;
import service.INewService;

import javax.inject.Inject;
import java.util.List;

public class NewService implements INewService {

    @Inject
    private INewDAO newDAO;

    @Override
    public List<NewsModel> findByCategoryId(Long categoryId) {
        return newDAO.findByCategoryId(categoryId);
    }
}
