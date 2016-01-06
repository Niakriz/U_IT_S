package uits.jv.Lesson15.DB;

import org.hibernate.*;
import org.hibernate.cfg.*;

/**
 * Created by Nia on 21.12.2015.
 */
public class HibernateUtil {
    private static final SessionFactory factory;
    static {
        try {
            factory = new Configuration().configure().buildSessionFactory();

        }catch (Throwable t){
            System.out.println("Enable Connect to base");
            throw new ExceptionInInitializerError(t);
        }
    }

    public static synchronized SessionFactory getFactory(){

        return factory;
    }

}
