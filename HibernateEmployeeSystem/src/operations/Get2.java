package operations;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import config.Config;
import entity.Employee;

public class Get2 {

	public static void main(String[] args) {

		SessionFactory sf = Config.getSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		Criteria criteria = session.createCriteria(Employee.class);
        criteria.add(Restrictions.in("dept", "dev", "test"));

		List<Employee> employees = criteria.list();
		employees.forEach(e -> System.out.println(e));
		tr.commit();
		session.close();
	}

}
