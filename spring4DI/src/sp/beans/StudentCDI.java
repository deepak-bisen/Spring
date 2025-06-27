package sp.beans;

public class StudentCDI {

	private int rollno;
	private String name;
	private AddressCDI address;

	public StudentCDI(int rollno,String name,AddressCDI address) {
     this.address = address;
     this.name = name;
     this.rollno = rollno ;
	}

	public void display() {
		System.out.println("name: " + name);
		System.out.println("rollno: " + rollno);
		System.out.println("address: " + address);
	}

}
