package dao.impl;

import dao.ICategoryDAO;
import model.CategoryModel;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoryDAO extends AbstractDAO implements ICategoryDAO {

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/newservlet";
            String user = "lechitu";
            String password = "12345678";
            return DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            return null;
        }
    }

    @Override
    public List<CategoryModel> findAll() {
        List<CategoryModel> results = new ArrayList<>();
        String sql = "SELECT * FROM category";

        Connection connection = getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        if (connection != null) {
            try {
                statement = connection.prepareStatement(sql);
                resultSet = statement.executeQuery();
                while (resultSet.next()){
                    CategoryModel category = new CategoryModel();
                    category.setId(resultSet.getLong("id"));
                    category.setCode(resultSet.getString("code"));
                    category.setName(resultSet.getString("name"));
                    results.add(category);
                }
                return results;
            } catch (SQLException e) {
                return null;
            } finally {
                try {
                    if (connection != null) {
                        connection.close();
                    }
                    if (statement != null) {
                        statement.close();
                    }
                    if (resultSet != null) {
                        resultSet.close();
                    }
                } catch (SQLException e) {
                    return null;
                }
            }
        }
        return null;
    }
}
