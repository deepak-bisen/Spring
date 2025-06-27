package sp.beans;

public class StudentCons {
	private int rollno;
	private String name;
	private String email;
	private AddressCons address;

public StudentCons(int rollno,String name,String email,AddressCons address) {
this.address = address;
this.email = email;
this.name = name;
this.rollno = rollno; 
}
	public void display() {
		System.out.println("name: " + name);
		System.out.println("rollno: " + rollno);
		System.out.println("email: " + email);
		System.out.println("address: " + address);
	}

}
