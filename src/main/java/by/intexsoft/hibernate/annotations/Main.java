package by.intexsoft.hibernate.annotations;

import by.intexsoft.hibernate.annotations.dao.DAOFactory;
import by.intexsoft.hibernate.annotations.entity.User;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        System.out.println("Hibernate ANNOTATIONS");
        User user = new User("Test2", "Testov2");

        /*DAOFactory.getInstance().getUserDAO().addUser(user);*/

        User user1 = DAOFactory.getInstance().getUserDAO().getUserById(new Integer(2));
        System.out.println("Get user: " + user1.getUserId());

        DAOFactory.getInstance().getUserDAO().deleteUser(user1);
        System.out.println("Delete user");
    }
}
