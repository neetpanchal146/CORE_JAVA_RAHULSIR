package com.util;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.User;

public class HBUtil 
{
	Properties prop=null;
	SessionFactory fact=null;
	Configuration cfg=null;
	Session session=null;
	
	public Session getSessionData()
	{
		prop=new Properties();
		prop.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
		prop.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/m5q1");
		prop.setProperty("hibernate.connection.username", "root");
		prop.setProperty("hibernate.connection.password", "");
		prop.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		prop.setProperty("hibernate.hbm2ddl.auto", "update");
		prop.setProperty("hibernate.format_sql", "true");
		prop.setProperty("hibernate.show_sql", "true");
		
		cfg=new Configuration();
		cfg.addProperties(prop).addAnnotatedClass(User.class);
				
		fact=cfg.buildSessionFactory();
		session=fact.openSession();
		return session;
	}
}