package by.intexsoft.hibernate.xml.dao;

/**
 * Created by Admin on 06.08.2015.
 */
public class DAOFactory {
    private static UserDAO userDAO = null;
    private static DAOFactory instance = null;

    public static synchronized DAOFactory getInstance() {
        if (instance == null){
            instance = new DAOFactory();
        }
        return instance;
    }

    public UserDAO getUserDAO() {
        if (userDAO == null){
            userDAO = new UserDAOImpl();
        }
        return userDAO;
    }
}
