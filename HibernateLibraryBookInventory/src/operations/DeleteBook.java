package operations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import config.Config;
import entity.Library;

public class DeleteBook {

	public static void main(String[] args) {

		SessionFactory sf = Config.getSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		Library l = new Library();
		l.setId(9);
		
		session.delete(l);
		
		tr.commit();
		session.close();
	}

}
