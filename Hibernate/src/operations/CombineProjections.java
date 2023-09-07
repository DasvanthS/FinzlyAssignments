package operations;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;

import Entity.Employee;
import config.EmployeeConfiguration;

public class CombineProjections {

	public static void main(String[] args) {

		SessionFactory sf = EmployeeConfiguration.getSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		Criteria criteria = session.createCriteria(Employee.class);
		
		criteria.setProjection(Projections.projectionList().add(Projections.property("username")).add(Projections.property("password")));
		List<Object> dis = criteria.list();
		
		dis.forEach(e -> System.out.println(e.toString()));
		
		tr.commit();
		session.close();
	}

}
