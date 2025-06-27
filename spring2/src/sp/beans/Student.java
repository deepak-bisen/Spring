package sp.beans;

public class Student {
	private int rollno;
	private String name;
	private String email;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int string) {
		this.rollno = string;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void display() {
		System.out.println("name: "+name);
		System.out.println("email: "+email);
		System.out.println("rollno: "+rollno);
	}

}
