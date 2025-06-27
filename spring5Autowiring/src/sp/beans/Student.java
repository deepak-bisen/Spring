package sp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	private int rollno;
	private String name;
	@Autowired
	@Qualifier("creatAdd2")
	private Address address;
	@Autowired
	private Subjects sub;

	public void setSub(Subjects sub) {
		this.sub = sub;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public Subjects getSub() {
		return sub;
	}

	public void display() {
		System.out.println("name: " + name);
		System.out.println("rollno: " + rollno);
		System.out.println("address: " + address);
		System.out.println("subjects: " + sub);
	}

}
