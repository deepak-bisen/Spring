package com.sp.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sp.main.entity.Student;
import com.sp.main.repository.StudentRepository;
import com.sp.main.service.StudentService;
import com.sp.main.service.StudentServiceImpl;

@SpringBootApplication
public class SpringBootWithDataJpaApplication {

	private final StudentRepository studentRepository;

	SpringBootWithDataJpaApplication(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootWithDataJpaApplication.class, args);
		StudentService studentService = context.getBean(StudentServiceImpl.class);

		Student student = new Student();
		student.setName("Deepak");
		student.setRollNo("0810CA6e4");
		student.setMarks(98.9f);

		boolean status = studentService.addStudentDetails(student);
		if (status) {
			System.out.println("Student Inserted Successfully.");
		} else {
			System.out.println("Student Not Inserted.");
		}
	}

}
