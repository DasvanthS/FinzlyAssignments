package config;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Library;

public final class Config{
	
	private Config() {
		
	}
	
	public static SessionFactory getSessionFactory() {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Library.class);
		return cfg.buildSessionFactory();	
	}

}
