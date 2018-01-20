package dao;

import java.util.List;

import org.hibernate.Session;

import db.HibernateUtil;
import entity.categories;


public class DaoCategories  implements DaoInterface{

	@Override
	public void insert(Object ob) {
		Session session = HibernateUtil.getSession();
		session.save(ob);
		HibernateUtil.closeSession(session);
		
		
	}

	@Override
	public void delete(Object ob) {
		Session session = HibernateUtil.getSession();
		session.delete(ob);
		HibernateUtil.closeSession(session);
		
	}

	@Override
	public void update(Object ob) {
		Session session = HibernateUtil.getSession();
		session.update(ob);
		HibernateUtil.closeSession(session);
		
	}

	@Override
	public Object get(int id) {
		categories category = null;
		Session session = HibernateUtil.getSession().getSessionFactory().openSession();
		category = (categories)session.get(categories.class, id);
		return category;

		
	}

	@Override
	public List getAllByRequest(String sql) {
		Session session = HibernateUtil.getSession();
		List <categories> list = session.createQuery(sql).list();
		HibernateUtil.closeSession(session);
		return list;
	
	}

}
