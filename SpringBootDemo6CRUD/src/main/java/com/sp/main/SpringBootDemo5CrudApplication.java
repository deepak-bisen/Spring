package com.sp.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sp.main.dao.UserDao;
import com.sp.main.entity.User;

@SpringBootApplication
public class SpringBootDemo5CrudApplication implements CommandLineRunner {
	@Autowired
	private UserDao userDAO;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemo5CrudApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//------------------------------INSERTION------------------------------------------------------
//		User user = new User("Deepak", "bisen1412@gmail.com", "male", "indore");
//		User user = new User("Tushar", "tushar@gmail.com", "male", "balaghat");
//		boolean status = userDAO.insertUser(user);
//		if (status) {
//			System.out.println("User Inserted Successfully.");
//		} else {
//			System.out.println("User Insertion Failed.");
//		}

//		-------------------------UPDATION 1------------------------------------------------------
//		User user = new User("Deepak", "bisen1412@gmail.com", "male", "balaghat");
//		boolean status = userDAO.updateUser(user);
//		if (status) {
//			System.out.println("User Updated Successfully.");
//		} else {
//			System.out.println("User Updation Failed.");
//		}
		
//		-------------------------UPDATION 2------------------------------------------------------
//		User user = userDAO.getUserByEmail("tushar@gmail.com");
//		user.setCity("khairi");
//		boolean status = userDAO.updateUser(user);
//		if (status) {
//			System.out.println("User Updated Successfully.");
//		} else {
//			System.out.println("User Updation Failed.");
//		}
//		-------------------------DELETION------------------------------------------------------
//		User user = new User("Deepak", "bisen1412@gmail.com", "male", "balaghat");
//		boolean status = userDAO.deleteUserByEmail(user);
//		if (status) {
//			System.out.println("User Deleted Successfully.");
//		} else {
//			System.out.println("User Deletion Failed.");
//		}

//	-------------------------SELECT One User---------------------------------------------------
//		User user = userDAO.getUserByEmail("tushar@gmail.com");
//			System.out.println("Name: "+user.getName());
//			System.out.println("Email: "+user.getEmail());
//			System.out.println("Gender: "+user.getGender());
//			System.out.println("City: "+user.getCity());
//		
//	}

//	-------------------------SELECT All Users--------------------------------------------------
		List<User> list = userDAO.getAllUsers();
		for (User user : list) {
			System.out.println("Name: " + user.getName());
			System.out.println("Email: " + user.getEmail());
			System.out.println("Gender: " + user.getGender());
			System.out.println("City: " + user.getCity());
			System.out.println("-----------------------------------------------");
		}
	}

}
