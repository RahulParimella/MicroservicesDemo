package com.microservice.rating.dto;

public class UserDto {
	

	private int userId;
	private String name;
	private String email;
	private String about;
	public UserDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserDto(int id, String name, String email, String about) {
		super();
		this.userId = id;
		this.name = name;
		this.email = email;
		this.about = about;
	}
	public int getId() {
		return userId;
	}
	public void setId(int id) {
		this.userId = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	@Override
	public String toString() {
		return "User [id=" + userId + ", name=" + name + ", email=" + email + ", about=" + about + "]";
	}
	
	
}
