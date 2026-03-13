package com.klef.fsad.exam;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil 
{
	private static SessionFactory factory;

	static
	{
		factory = new Configuration()
				.configure()
				.addAnnotatedClass(Service.class)
				.buildSessionFactory();
	}

	public static SessionFactory getSessionFactory()
	{
		return factory;
	}
}