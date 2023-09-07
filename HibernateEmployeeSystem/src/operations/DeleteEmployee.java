package operations;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import config.Config;
import entity.Employee;

public class DeleteEmployee {

	public static void main(String[] args) {


		SessionFactory sf = Config.getSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		Employee emp = new Employee();
		emp.setId(5);
		
		session.delete(emp);
		
		tr.commit();
		session.close();
	}

}
