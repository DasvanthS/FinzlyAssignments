package operations;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import Entity.Employee;
import config.EmployeeConfiguration;

public class Between {

	public static void main(String[] args) {

		SessionFactory sf = EmployeeConfiguration.getSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		Criteria criteria = session.createCriteria(Employee.class);
		
		criteria.add(Restrictions.between("id", 1, 5));
		List<Integer> avg = criteria.list();
		
		System.out.println(avg);
		
		tr.commit();
		session.close();
	}

}
