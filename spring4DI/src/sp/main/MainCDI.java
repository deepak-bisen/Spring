package sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sp.beans.StudentCDI;

public class MainCDI {
public static void main(String[] args) {
	String config_path = "sp/resources/ApplicationContextCDI.xml";
	ApplicationContext context = new ClassPathXmlApplicationContext(config_path);
	
	StudentCDI std = (StudentCDI) context.getBean(StudentCDI.class);
	std.display();
}
}
