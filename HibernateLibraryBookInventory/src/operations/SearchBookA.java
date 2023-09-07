package operations;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import config.Config;
import entity.Library;

public class SearchBookA {

	public static void main(String[] args) {

		SessionFactory sf = Config.getSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		Criteria criteria = session.createCriteria(Library.class);
		criteria.add(Restrictions.between("year", 1990, 2000));
		
		List<Library> list = criteria.list();
		list.forEach(e -> System.out.println(e));
		
		tr.commit();
		session.close();
	}

}
