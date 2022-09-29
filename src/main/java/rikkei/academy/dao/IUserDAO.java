package rikkei.academy.dao;

import rikkei.academy.model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserDAO {
    public void insertUser(User user) throws SQLException;

    public User selectUser(int id);

    public List<User> searchByCountry(String country);

    public List<User> selectAllUsers();

    public List<User> selectUsersOrderByName();

    public boolean deleteUser(int id) throws SQLException;

    public boolean updateUser(User user) throws SQLException;
}
