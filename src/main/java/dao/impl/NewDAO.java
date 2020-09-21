package dao.impl;

import dao.INewDAO;
import model.CategoryModel;
import model.NewsModel;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class NewDAO extends AbstractDAO implements INewDAO {

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
    public List<NewsModel> findByCategoryId(Long categoryId) {
        List<NewsModel> results = new ArrayList<>();
        String sql = "SELECT * FROM news WHERE categoryid = ?";

        Connection connection = getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        if (connection != null) {
            try {
                statement = connection.prepareStatement(sql);
                statement.setLong(1, categoryId);
                resultSet = statement.executeQuery();
                while (resultSet.next()){
                    NewsModel news = new NewsModel();
                    news.setId(resultSet.getLong("id"));
                    news.setTitle(resultSet.getString("title"));
                    results.add(news);
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
