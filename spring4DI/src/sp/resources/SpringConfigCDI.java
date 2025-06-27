package sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import sp.beans.StudentCDI;
import sp.beans.AddressCDI;

@Configuration
public class SpringConfigCDI {
	@Bean("std1")
	public StudentCDI createStdObj() {
		StudentCDI std = new StudentCDI(101, "tushar", createAddObj());
		return std;
	}

	@Bean
	public AddressCDI createAddObj() {

		AddressCDI address = new AddressCDI(25, "khairi", 481337);
		return address;

	}
}
