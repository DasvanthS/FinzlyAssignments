package operations;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;

import entity.Employee;
import config.Config;

public class ReadById {

	public static void main(String[] args) {

		SessionFactory sf = Config.getSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		Employee emp = new Employee();
		
		Employee s = session.load(Employee.class, 1);
		System.out.println(s);
		
		tr.commit();
		session.close();
	}

}
