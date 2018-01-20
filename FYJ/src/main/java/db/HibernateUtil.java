package db;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
private static SessionFactory sessionFactory;
	
	static {
		sessionFactory = new Configuration().configure().buildSessionFactory();
	}
	
	public static Session getSession() {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		return session;
	}
	
	public static void closeSession(Session session) {
		session.getTransaction().commit();
		session.close();
	}
	
}
