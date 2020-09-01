package myjava8.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @ClassName HibernateUtils
 *
 * @Author Chris Chen
 * @Date 2019-06-19 10:39
 * @Version 1.0
 **/

public class HibernateUtils {
    private static SessionFactory factory;

    static {
        try {
            //读取hibernate.cfg.xml文件
            Configuration cfg = new Configuration().configure("hibernate.cfg.xml");

            //建立SessionFactory
            factory = cfg.buildSessionFactory();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    /*
     *打开Session
     */

    public static Session getSession() {
        return factory.openSession();
    }
    /*
     *关闭Session
     */

    public static void closeSession(Session session) {
        if (session != null) {
            if (session.isOpen()) {
                session.close();
            }
        }
    }

    public static SessionFactory getSessionFactory() {
        return factory;
    }
}