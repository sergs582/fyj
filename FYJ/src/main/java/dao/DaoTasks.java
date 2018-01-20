package dao;

import java.util.List;

import org.hibernate.Session;

import db.HibernateUtil;
import entity.tasks;

public class DaoTasks implements DaoInterface <tasks> {

	@Override
	public void insert(tasks ob) {
		Session session = HibernateUtil.getSession();
		session.save(ob);
		HibernateUtil.closeSession(session);
		
		
	}

	@Override
	public void delete(tasks ob) {
		Session session = HibernateUtil.getSession();
		session.delete(ob);
		HibernateUtil.closeSession(session);
		
	}

	@Override
	public void update(tasks ob) {
		Session session = HibernateUtil.getSession();
		session.update(ob);
		HibernateUtil.closeSession(session);
	}

	@Override
	public tasks get(int id) {
		tasks task = null;
		Session session = HibernateUtil.getSession().getSessionFactory().openSession();
		task = (tasks)session.get(tasks.class, id);
		return task;

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<tasks> getAllByRequest(String sql) {
		Session session = HibernateUtil.getSession();
		List <tasks> list = session.createQuery(sql).list();
		
		HibernateUtil.closeSession(session);
		return list;
	}

}
