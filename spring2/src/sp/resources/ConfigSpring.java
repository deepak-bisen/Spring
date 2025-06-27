package sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import sp.beans.Student;

@Configuration
public class ConfigSpring {

	@Bean
	public Student stdObj1() {
		Student std = new Student();
		std.setName("amit");
		std.setEmail("amit@gmail.com");
		std.setRollno(4561);
		return std;

	}
	
	@Bean("stdOb")
	public Student  stdObj2() {
		Student std = new Student();
		std.setName("vishesh");
		std.setEmail("vishesh@gmail.com");
		std.setRollno(778945);
		return std ;
	}
}
