package com.epicode.introSpring.DependecyInjection;

public class Persona {
	
	private String fullName;
	private Address address;
	private Phone phone;
	public Persona(String fullName, Address address, Phone phone) {
		super();
		this.fullName = fullName;
		this.address = address;
		this.phone = phone;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Phone getPhone() {
		return phone;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Persona [fullName=" + fullName + ", address=" + address + ", phone=" + phone + "]";
	}
	
	

}
