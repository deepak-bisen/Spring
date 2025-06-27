package sp.beans;

public class Address {
	private int hno;
	private String city;
	private int pincode;

	public void setHno(int hno) {
		this.hno = hno;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return hno+", "+city+"- "+pincode ;
	}
}
