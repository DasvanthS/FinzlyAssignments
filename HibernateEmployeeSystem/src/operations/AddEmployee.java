package operations;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import config.Config;
import entity.Employee;

public class AddEmployee {

	public static void main(String[] args) {

		SessionFactory sf = Config.getSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		Employee emp = new Employee();
		emp.setFname("Vikranth");
		emp.setLname("Singh");
		emp.setDob(LocalDate.of(2004, 11, 29));
		emp.setEmail("vikrant@gmail.com");
		emp.setDept("ops");
		emp.setSalary(4293);
		
		session.save(emp);
		
		tr.commit();
		session.close();
	}

}
