package org.actnow.utils;

public class PetitionDto {
	private String firstName;
	private String lastName;
	private String city;
	private String country;

	public PetitionDto(String firstName, String lastName, String city,
			String country) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.country = country;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Petition was signed by this user: \n" + "[\n" + "firstName="
				+ firstName + "\n" + " lastName=" + lastName + "\n" + " city="
				+ city + "\n" + " country=" + country + "\n" + "]";
	}
}
