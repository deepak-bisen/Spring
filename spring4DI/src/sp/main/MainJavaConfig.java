package sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import sp.beans.Student;
import sp.resources.SpringConfig;

public class MainJavaConfig {
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
//		Student std = (Student) context.getBean("createStdObj");
//		Student std = (Student) context.getBean("std1");
		Student std = (Student) context.getBean(Student.class);
		
		std.display();
	}
}
