package sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import sp.beans.Student;
import sp.beans.Address;

@Configuration
public class SpringConfig {
	@Bean("std1")
//	@Bean
	public Student createStdObj() {
		Student std = new Student();

		std.setName("deepak");
		std.setRollno(123);
		std.setAddress(createAddObj());
		return std;
	}

	@Bean
	public Address createAddObj() {

		Address address = new Address();
		address.setHno(456);
		address.setCity("indore");
		address.setPincode(452010);
		return address;

	}
}
