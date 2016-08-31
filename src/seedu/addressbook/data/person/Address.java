package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book. Guarantees: immutable; is
 * valid as declared in {@link #isValidAddress(String)}
 */
public class Address {

	public static final String EXAMPLE = "123, some street";
	public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Person addresses must be in the format "
															+ "block , street, unit, postalcode.";
	public static final String ADDRESS_VALIDATION_REGEX = ".+,.+,.+,.+";

	public final String value;
	private boolean isPrivate;

	private Block block;
	private Street street;
	private Unit unit;
	private Postal postal;

	/**
	 * Validates given address.
	 *
	 * @throws IllegalValueException
	 *         if given address string is invalid.
	 */
	public Address(String address, boolean isPrivate) throws IllegalValueException {
		this.isPrivate = isPrivate;
		if (!isValidAddress(address)) {
			throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
		}
		this.value = address;
		initialiseAddress(address);
	}

	private void initialiseAddress(String address) {
		String[] splitAddress = address.split(",");
		this.block = new Block(splitAddress[0]);
		this.street = new Street(splitAddress[1]);
		this.unit = new Unit(splitAddress[2]);
		this.postal = new Postal(splitAddress[3]);
	}

	/**
	 * Returns true if a given string is a valid address
	 */
	public static boolean isValidAddress(String test) {
		return test.matches(ADDRESS_VALIDATION_REGEX);
	}

	/////////////////////////////////////////////////////////////////////
	/**
	 * 
	 * Returns private object attributes
	 */
	public Block getBlock() {
		return this.block;
	}

	public Street getStreet() {
		return this.street;
	}

	public Unit getUnit() {
		return this.unit;
	}

	public Postal getPostal() {
		return this.postal;
	}

	/////////////////////////////////////////////////////////////////////////////

	@Override
	public String toString() {
		return value;
	}

	@Override
	public boolean equals(Object other) {
		return other == this // short circuit if same object
				|| (other instanceof Address // instanceof handles nulls
				&& this.value.equals(((Address) other).value)); // state check
	}

	@Override
	public int hashCode() {
		return value.hashCode();
	}

	public boolean isPrivate() {
		return isPrivate;
	}
}