package by.intexsoft.hibernate.xml;

import by.intexsoft.hibernate.xml.dao.DAOFactory;
import by.intexsoft.hibernate.xml.entity.User;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        User user = new User("Test2", "Testov2");

        DAOFactory.getInstance().getUserDAO().addUser(user);

        User user1 = DAOFactory.getInstance().getUserDAO().getUserById(new Integer(1));
        System.out.println("Get user: " + user1.getFirstName());

        DAOFactory.getInstance().getUserDAO().deleteUser(user1);
        System.out.println("Delete user");
    }
}
