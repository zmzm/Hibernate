package by.intexsoft.hibernate.annotations.dao;

import by.intexsoft.hibernate.annotations.entity.User;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Admin on 06.08.2015.
 */
public interface UserDAO {
    public void addUser(User user) throws SQLException;
    public void updateUser(User user) throws SQLException;
    public User getUserById(Integer id) throws SQLException;
    public List getAllUsers() throws SQLException;
    public void deleteUser(User user) throws SQLException;
}
