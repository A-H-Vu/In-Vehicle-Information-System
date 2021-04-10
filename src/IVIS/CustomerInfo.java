package IVIS;

public class CustomerInfo {
	private String firstName;
	private String lastName;
	private String country;

	public CustomerInfo(String f, String l, String c) {
		setFirstName(f);
		setLastName(l);
		setCountry(c);
	}

	public void setFirstName(String f) {
		this.firstName = f;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setLastName(String l) {
		this.lastName = l;
	}

	public String getLastName() {
		return lastName;
	}

	public void setCountry(String co) {
		this.country = co;
	}

	public String getCountry() {
		return country;
	}

	public String toString() {
		return "Name: " + firstName + " " + lastName + "/tCountry: " + country;
	}
}
