package com.app.Appmanagement.appRepository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.app.Appmanagement.entity.AppEntity;
import com.app.Appmanagement.util.SessionFactoryUtil;

public class AppHqlRepository
{
	public List<AppEntity> findAll()
	{
		StringBuilder builder=new StringBuilder();
		builder.append("from AppEntity");
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Query query = session.createQuery(builder.toString());
		return query.getResultList();
	}
	public List<AppEntity> findByName(String service_name)
	{
		StringBuilder builder = new StringBuilder();
		builder.append("from AppEntity where service_name=:n");
		SessionFactory sessionfactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionfactory.openSession();
		Query query = session.createQuery(builder.toString());
		query.setParameter("n",service_name);
		return query.getResultList();
		
		
	}

}
