package org.actnow.utils;

public class SignInDto {

	private String email;
	private String password;

	public SignInDto(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "************ NOTE ************\n"
				+ "This is a 'BAD' idea and temporarily storage and will be removed once backend is in place.\n"
				+ "*****************************\n" + "ActNOW user info [\n"
				+ "Email=" + email + "\n" + "Password=" + password + "\n" + "]";
	}
}
