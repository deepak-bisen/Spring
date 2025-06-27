package sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import sp.beans.StudentCDI;
import sp.resources.SpringConfigCDI;

public class MainJavaConfigCDI {
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigCDI.class);
		
//		Student std = (Student) context.getBean("createStdObj");
//		Student std = (Student) context.getBean("std1");
		StudentCDI std = (StudentCDI) context.getBean(StudentCDI.class);
		
		std.display();
	}
}
