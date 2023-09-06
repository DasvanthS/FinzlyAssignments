package crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ReadEmployee {

	public static void main(String[] args) {
		
		SessionFactory sf = EmployeeConfiguration.getSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		Employee e = new Employee();
		
		Employee s = session.load(Employee.class, 1);
		System.out.println(s);
		tr.commit();
		session.close();

	}

}
