package by.intexsoft.hibernate.xml.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Admin on 06.08.2015.
 */
public class HibernateUtil {
    private static SessionFactory sessionFactory = null;

    static {
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (Exception e) {
            try {
                throw new ExceptionInInitializerError(e);
            } catch (ExceptionInInitializerError ex) {
                Logger.getLogger(HibernateUtil.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }

}
