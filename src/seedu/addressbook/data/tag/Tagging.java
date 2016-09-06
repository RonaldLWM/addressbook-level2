package seedu.addressbook.data.tag;

public class Tagging {
	private char sign;
	private String personName;
	private String tag;
	
	public Tagging() {
	}
	
	public Tagging(char sign, String personName, String tag) {
		this.sign = sign;
		this.personName = personName;
		this.tag = tag;
	}
	
	public char getSign() {
		return sign;
	}
	
	public String getPersonName() {
		return personName;
	}
	
	public String getTag() {
		return tag;
	}
	
	public String getPrintableString() {
		return sign + " " + personName + " " + tag;
	}
}
