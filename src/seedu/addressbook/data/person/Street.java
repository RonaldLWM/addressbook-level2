package seedu.addressbook.data.person;

public class Street {
	private String street;

	public Street(String streetName) {
		this.street = streetName;
	}

	public String getStreetName() {
		return this.street;
	}

	public void setStreet(String streetName) {
		this.street = streetName;
	}

}
