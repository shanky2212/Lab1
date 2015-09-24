package com.mausam.hibernate;

import org.hibernate.*;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.*;

public class HibernateUtil {

static SessionFactory factory;
static{

Configuration cfg= new Configuration();
  cfg=cfg.configure();

	
StandardServiceRegistryBuilder ssrBuilder = new StandardServiceRegistryBuilder();
StandardServiceRegistry ssRegistry = ssrBuilder.applySettings(cfg.getProperties()).build();
factory= cfg.buildSessionFactory(ssRegistry);
}

public static SessionFactory getSessionFactory(){
	
	return factory;
}

}
