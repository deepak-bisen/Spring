package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.resources.SpringConfigJdbc;

/**
 * CRUD Operation
 *
 */
public class App {
	public static void main(String[] args) {
		int sno = 2;
		String name = "tushar";
		int mno = 465987;

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigJdbc.class);

		JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);

		String insert_query = "INSERT INTO deepak VALUES(?,?,?)";

		int count = jdbcTemplate.update(insert_query, sno, name, mno);

		if (count > 0) {
			System.out.println("insertion successfull.");
		} else {
			System.out.println("insertion Unsuccessfull.");
		}

	}
}
