package com.app.Appmanagement.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.Appmanagement.entity.AppEntity;

public class SessionFactoryUtil 
{
	private static SessionFactory sessionFactory=null;
	public static SessionFactory getSessionFactory()
	{
		Configuration cfg = new Configuration();
		cfg.setProperties(ConnectionPropertiesUtil.getMysqlDbProperties());
		cfg.addAnnotatedClass(AppEntity.class);
		 sessionFactory = cfg.buildSessionFactory();
		 
		 return sessionFactory;
		 
	}

}
