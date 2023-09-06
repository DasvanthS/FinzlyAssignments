package crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class UpdateEmployee {

	public static void main(String[] args) {

		SessionFactory sf = EmployeeConfiguration.getSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		Employee e = new Employee();
		
		e.setId(22);
		e.setUsername("Vijay");
		e.setPassword("12345");
		session.update(e);
		
		tr.commit();
		session.close();
	}

}
