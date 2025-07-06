package com.sp.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sp.main.entity.User;

@SpringBootApplication
public class HibernateDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(HibernateDemo1Application.class, args);

		Configuration cfg = new Configuration();
		cfg.configure("com/sp/main/config/hibernate.cfg.xml");

		try {
			SessionFactory sessionFactory = cfg.buildSessionFactory();
			Session session = sessionFactory.openSession();
//			Transaction transaction = session.beginTransaction();

			User user = session.get(User.class, 1);
			if (user != null) {
				System.out.println(user.getName());
				System.out.println(user.getEmail());
			} else
				System.out.println("User not found");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
