package seedu.addressbook.data.person;

public class Postal {
	private String postalCode;
	
	public Postal(String postalCode) {
		this.postalCode = postalCode;
	}
	
	public String getPostalCodeNumber() {
		return this.postalCode;
	}
	
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
}
