package sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sp.beans.Student;
import sp.resourceJava.SpringConfig;

public class Main {
	public static void main(String[] args) {

		// using XML COnfig file
		
		String resource_file_path = "sp/resources/ApplicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(resource_file_path);

		Student std = (Student) context.getBean("student");
		std.display();

		
//using java Configuration class	

//		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//		Student std = (Student) context.getBean("student");
//		std.display();
	}
}