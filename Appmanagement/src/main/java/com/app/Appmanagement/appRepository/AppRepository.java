package com.app.Appmanagement.appRepository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.app.Appmanagement.dto.Appdto;
import com.app.Appmanagement.entity.AppEntity;
import com.app.Appmanagement.util.ConnectionPropertiesUtil;
import com.app.Appmanagement.util.SessionFactoryUtil;

public class AppRepository
{
	public void saveOrUpdate(AppEntity appEntity)
	{
		/*Configuration cfg=new Configuration();
		cfg.setProperties(ConnectionPropertiesUtil.getMysqlDbProperties());
		cfg.addAnnotatedClass(AppEntity.class);
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		*/
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.merge(appEntity);
		transaction.commit();
	}
	public AppEntity findById(long id)
	{
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
       	return	session.get(AppEntity.class, id);
		
	}
	public void update(Appdto appDto)
	{
		AppEntity appEntity = findById(appDto.getAlt_key());
		appEntity.setService_name(appDto.getService_name());
		appEntity.setCreated_date(appDto.getCreated_date());
		appEntity.setUrl(appDto.getUrl());
		appEntity.setModify_date(appDto.getModify_date());
		saveOrUpdate(appEntity);		
	}
	public void delete(Appdto appdto1)
	{
		 AppEntity appEntity = findById(appdto1.getAlt_key());
	     SessionFactory sessionfactory = SessionFactoryUtil.getSessionFactory();
	     Session session = sessionfactory.openSession();
	     Transaction transaction = session.beginTransaction();
	     session.delete(appEntity);
	     transaction.commit();
		
	}

}
