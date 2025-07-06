package com.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.beans.Student;
import com.mappers.StudentRowMapper;
import com.resources.SpringConfigJdbc;

/**
 * CRUD Operation
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigJdbc.class);

		JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);

////-----------------INSERTION QUERY-------------------		
//		int sno = 3;
//		String name = "kharif";
//		long mno = 789878;
//
//		String insert_query = "INSERT INTO deepak VALUES(?,?,?)";
//
//		int count = jdbcTemplate.update(insert_query, sno, name, mno);
//
//		if (count > 0) {
//			System.out.println("insertion successfull.");
//		} else {
//			System.out.println("insertion Unsuccessfull.");
//		}

//	//-----------------UPDATE QUERY-------------------		
//			int sno = 2;
//			long mno = 72240556;
//	
//			String update_query = "UPDATE deepak SET mobile = ? WHERE sno = ?";
//	
//			int count = jdbcTemplate.update(update_query, mno,sno);
//	
//			if (count > 0) {
//				System.out.println("updation successfull.");
//			} else {
//				System.out.println("updation Unsuccessfull.");
//			}

//		//-----------------DELETE QUERY-------------------		
//		int sno = 3;
//	
//		String update_query = "DELETE FROM deepak WHERE sno = ?";
//
//		int count = jdbcTemplate.update(update_query,sno);
//
//		if (count > 0) {
//			System.out.println("deletion successfull.");
//		} else {
//			System.out.println("deletion Unsuccessfull.");
//		}
//		
//		// -----------------SELECT QUERY - 1 -------------------
//		
//
//		String select_query = "SELECT * FROM deepak";
//
//		List<Student> std_list = jdbcTemplate.query(select_query, new StudentRowMapper());
//
//		for (Student std : std_list) {
//			System.out.println("sno: "+std.getSno());
//			System.out.println("name: "+std.getName());
//			System.out.println("mobile: "+std.getMobile());
//			System.out.println("--------------------------");
//		}

//		// -----------------SELECT QUERY - 2-------------------
//				int sno = 2;
//
//				String select_query = "SELECT * FROM deepak WHERE sno = ?";
//
//				List<Student> std_list = jdbcTemplate.query(select_query, new StudentRowMapper(),sno);
//
//				for (Student std : std_list) {
//					System.out.println("sno: "+std.getSno());
//					System.out.println("name: "+std.getName());
//					System.out.println("mobile: "+std.getMobile());
//					System.out.println("--------------------------");
//				}

		// -----------------SELECT QUERY - 2-------------------
		int sno = 1;

		String select_query = "SELECT * FROM deepak WHERE sno = ?";

		Student std = jdbcTemplate.queryForObject(select_query, new StudentRowMapper(), sno);

		System.out.println("sno: " + std.getSno());
		System.out.println("name: " + std.getName());
		System.out.println("mobile: " + std.getMobile());
		System.out.println("--------------------------");

	}
}
