package sp.beans;

public class AddressCons {
	private int hno;
	private String city;
	private int pincode;

	public AddressCons(int hno, String city, int pincode) {
		this.hno = hno;
		this.city = city;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return hno + ", " + city + "- " + pincode;
	}
}
