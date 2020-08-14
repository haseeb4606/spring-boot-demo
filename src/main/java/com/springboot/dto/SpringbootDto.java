package com.springboot.dto;

public class SpringbootDto {

	private String firstName;

	private String lastName;

	private String address;

	private long phone;

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "SpringbootDto [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", phone="
				+ phone + "]";
	}

}
