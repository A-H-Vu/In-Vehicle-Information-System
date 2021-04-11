package IVIS;

public class CustomerInfo {
	private long personalID;
	private String firstName;
	private String lastName;
	private String country;

	public CustomerInfo() {
		RandomInformation ri = new RandomInformation();
		setFirstName(ri.randomFirstName());
		setLastName(ri.randomLastName());
		setCountry(ri.randomCountryName());
		setPersonalID(ri.randomID());
	}

	public CustomerInfo(String f,String l,String c, long p) {
		setFirstName(f);
		setLastName(l);
		setCountry(c);
		setPersonalID(p);
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

	public long getPersonalID() {
		return personalID;
	}

	public void setPersonalID(long personalID) {
		this.personalID = personalID;
	}

	@Override
	public String toString() {
		return "CustomerInfo [personalID=" + personalID + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", country=" + country + "]";
	}
	
	
}
