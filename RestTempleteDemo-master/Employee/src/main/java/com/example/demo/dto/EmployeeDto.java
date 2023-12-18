package com.example.demo.dto;

public class EmployeeDto {

	private long empId;
	
	
	private String firstName;
	
	
	private String lastName;
	
	
	private String emailId;

	private AddressDto addressdto;
	
	public AddressDto getAddressdto() {
		return addressdto;
	}

	public void setAddressdto(AddressDto addressdto) {
		this.addressdto = addressdto;
	}

	public EmployeeDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeDto(
			String firstName,String lastName,String emailId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
	}
	

	

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
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

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "EmployeeDto [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId="
				+ emailId + ", addressdto=" + addressdto + "]";
	}

	
	
	
}