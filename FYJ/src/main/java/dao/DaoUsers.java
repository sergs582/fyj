package dao;

import java.util.List;

import org.hibernate.Session;

import db.HibernateUtil;
import entity.users;

public class DaoUsers implements DaoInterface <users>{

	@Override
	public void insert(users ob) {
		Session session = HibernateUtil.getSession();
		session.save(ob);
		HibernateUtil.closeSession(session);
		
	}

	@Override
	public void delete(users ob) {
		Session session = HibernateUtil.getSession();
		session.delete(ob);
		HibernateUtil.closeSession(session);
	}

	@Override
	public void update(users ob) {
		Session session = HibernateUtil.getSession();
		session.update(ob);
		HibernateUtil.closeSession(session);
	}

	@Override
	public users get(int id) {
		users user = null;
		Session session = HibernateUtil.getSession().getSessionFactory().openSession();
		user = (users)session.get(users.class, id);
		return user;

	}

	
	@SuppressWarnings("unchecked")
	@Override
	public List<users> getAllByRequest(String sql) {
		Session session = HibernateUtil.getSession();
		List <users> list = session.createQuery(sql).list();
		HibernateUtil.closeSession(session);
		return list;
	}

	
}
