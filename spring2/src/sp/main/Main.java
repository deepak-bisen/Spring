package sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

import sp.beans.Student;
import sp.resources.ConfigSpring;

public class Main {
public static void main(String[] args) {
	
	ApplicationContext context = new AnnotationConfigApplicationContext(ConfigSpring.class);
	Student std1 = (Student) context.getBean("stdObj1");
	std1.display();
	
	System.out.println();
	
	Student std2 = (Student) context.getBean("stdOb");
	std2.display();
}
}
