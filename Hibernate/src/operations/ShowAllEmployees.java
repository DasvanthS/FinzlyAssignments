package operations;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import Entity.Employee;
import config.EmployeeConfiguration;

public class ShowAllEmployees {

	public static void main(String[] args) {
		
		SessionFactory sf = EmployeeConfiguration.getSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		Criteria criteria = session.createCriteria(Employee.class);
		
		List<Employee> employees = criteria.list();
		
		employees.forEach(e -> System.out.println(e));
		
		tr.commit();
		session.close();
		
	}

}
