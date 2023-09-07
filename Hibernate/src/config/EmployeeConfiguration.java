package config;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Entity.Employee;

public final class EmployeeConfiguration {
	
	private EmployeeConfiguration() {
		
	}
	
	public static SessionFactory getSessionFactory() {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		return cfg.buildSessionFactory();	
	}

}
