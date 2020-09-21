package dao;

import model.CategoryModel;

import java.util.List;

public interface ICategoryDAO extends IGenericDAO {
    List<CategoryModel> findAll();
}
