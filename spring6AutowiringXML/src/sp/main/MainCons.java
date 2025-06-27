package sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sp.beans.StudentCons;

public class MainCons {
	public static void main(String[] args) {
		String config_path = "sp/resources/ApplicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_path);

		StudentCons std = (StudentCons) context.getBean("stdId");
		std.display();
		
	}
}
