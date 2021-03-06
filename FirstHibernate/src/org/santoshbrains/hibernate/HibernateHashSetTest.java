package org.santoshbrains.hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.santoshbrains.dto.Address;
import org.santoshbrains.dto.UserDetails_HashSet;
public class HibernateHashSetTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDetails_HashSet user1 = new UserDetails_HashSet();
		Address addr1 = new Address();
		addr1.setStreet("Street_1");
		addr1.setState("State_1");
		addr1.setCity("City_1");
		addr1.setZip("Zip_1");
		user1.setUserId("Santosh");
		
		user1.getCollAddress().add(addr1);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user1);
		session.getTransaction().commit();
		session.close();
		
	}

}
