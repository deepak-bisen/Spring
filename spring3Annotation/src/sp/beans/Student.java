package sp.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("Deepak")
	private String name;
	@Value("khairi")
	private String address;
	@Value("95")
	private int mark;
/*
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}
*/
	public void display() {
		System.out.println("name: " + name);
		System.out.println("address: " + address);
		System.out.println("mark: " + mark);
	}
}
