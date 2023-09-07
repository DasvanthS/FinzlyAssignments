package operations;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import config.Config;
import entity.Employee;

public class UpdateEmployee {

	public static void main(String[] args) {

		SessionFactory sf = Config.getSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		Employee emp = new Employee();
		emp.setId(5);
		emp.setFname("Vikas");
		emp.setLname("ram");
		emp.setDob(LocalDate.of(2003, 3, 19));
		emp.setEmail("vi@gmail.com");
		emp.setDept("dev");
		emp.setSalary(24324);
		
		session.update(emp);
		
		tr.commit();
		session.close();
	}

}
