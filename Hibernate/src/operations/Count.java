package operations;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;

import Entity.Employee;
import config.EmployeeConfiguration;

public class Count {

	public static void main(String[] args) {

		SessionFactory sf = EmployeeConfiguration.getSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		Criteria criteria = session.createCriteria(Employee.class);
		
		criteria.setProjection(Projections.count("username"));
		List<Integer> count = criteria.list();
		
		System.out.println(count);
		
		tr.commit();
		session.close();
	}

}
