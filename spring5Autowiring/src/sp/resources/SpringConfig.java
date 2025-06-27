package sp.resources;

import java.util.List;
import java.util.ArrayList;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import sp.beans.Address;
import sp.beans.Student;
import sp.beans.Subjects;

@Configuration
public class SpringConfig {
	@Bean
	public Student createStdObj() {
		Student std = new Student();
		std.setName("deepak");
		std.setRollno(123);
//		std.setAddress(creatAdd()); // manual DI
//		std.setSub(createSub());   //  manual DI
		return std;
	}

	@Bean
	public Address creatAdd1() {
		Address address = new Address();
		address.setHno(123);
		address.setCity("indore");
		address.setPincode(452001);
		return address;

	}
	
	@Bean
	public Address creatAdd2() {
		Address address = new Address();
		address.setHno(52);
		address.setCity("khairi");
		address.setPincode(481337);
		return address;

	}
	
	@Bean
	public Subjects createSub() {
		Subjects subject = new Subjects();
		
		List<String> subList = new ArrayList<String>();
		subList.add("java");
		subList.add("dbms");
		subList.add("networks");
		
		subject.setSubjects(subList);
		return subject;
	}
}
