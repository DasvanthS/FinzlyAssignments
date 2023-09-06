package crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class InsertEmployee {

	public static void main(String[] args) {

		SessionFactory sf = EmployeeConfiguration.getSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		Employee e = new Employee();
		
		e.setUsername("Dasvanth");
		e.setPassword("12345");
		session.save(e);
		
		tr.commit();
		session.close();
	}

}
