package operations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import config.Config;
import entity.Library;

public class AddBook {

	public static void main(String[] args) {

		SessionFactory sf = Config.getSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		Library l = new Library();
		l.setTitle("Harry Potter");
		l.setAuthor("JK Rowling");
		l.setYear(1999);
		l.setIsbn(374892739);
		
		session.save(l);
		
		tr.commit();
		session.close();
	}

}
