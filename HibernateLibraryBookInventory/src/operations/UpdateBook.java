package operations;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import config.Config;
import entity.Library;

public class UpdateBook {

	public static void main(String[] args) {

		SessionFactory sf = Config.getSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		Library l = new Library();
		l.setId(9);
		l.setTitle("The King");
		l.setAuthor("Rowl");
		l.setYear(2001);
		l.setIsbn(3424234);
		
		session.update(l);
		
		tr.commit();
		session.close();
	}

}
