package sp.beans;

public class AddressCDI {

	private int hno;
	private String city;
	private int pincode;

	public AddressCDI(int hno, String city,int pincode) {
	this.city = city;
	this.hno = hno;
	this.pincode = pincode;
	
	}

	@Override
	public String toString() {
		return hno + ", " + city + "- " + pincode;
	}
}
