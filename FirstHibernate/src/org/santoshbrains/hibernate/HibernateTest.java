package org.santoshbrains.hibernate;
import java.util.Date;
import java.text.SimpleDateFormat;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.santoshbrains.dto.*;

public class HibernateTest {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
		UserDetails user1 = new UserDetails();
		Address homeAddress = new Address();
		Address officeAddress = new Address();
		
		homeAddress.setStreet("Home Street Name");
		homeAddress.setCity("Home City Name");
		homeAddress.setState("Home State Name");
		homeAddress.setZip("Home Zip Code");
		officeAddress.setStreet("Office Street Name");
		officeAddress.setCity("Office City Name");
		officeAddress.setState("Office State Name");
		officeAddress.setZip("Office Zip Code");
		
		user1.setHomeAddress(homeAddress);
		user1.setOfficeAddress(officeAddress);
		
		UserDetails user2 = new UserDetails();
		user1.setName("Santosh");
		user2.setName("Santosh1");
		user1.setUser_ID("Santosh_is_best1");
		user2.setUser_ID("Santosh_is_best2");
		user1.setName("Santosh_is_king1");
		user2.setName("Santosh_is_king2");
		user1.setDateOfJoining(new Date("02/05/1986"));
		user2.setDateOfJoining(new Date("02/05/1986"));
		user1.setPhysicalAddress("USA");
		user2.setPhysicalAddress("USA2");
		SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user1); //Create and new table and insert or only insert into DB
		session.save(user2); //Create and new table and insert or only insert into DB
		session.getTransaction().commit();
		session.close();
		
	
		user2= null;
		session = sessionFactory.openSession();
		session.beginTransaction();
		user2 =  session.get(UserDetails.class,1);
		//System.out.println("User name retrieved is " + user2.getUser_ID());
		session.close();
		
		

	}

}
