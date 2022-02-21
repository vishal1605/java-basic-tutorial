package com.java.collection;

public class UserDetails {
	
	private long uId;
	private String name;
	private String email;
	private String city;
	private String degree;
	public long getuId() {
		return uId;
	}
	public void setuId(long uId) {
		this.uId = uId;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public UserDetails(long uId, String name, String email, String city, String degree) {
		super();
		this.uId = uId;
		this.name = name;
		this.email = email;
		this.city = city;
		this.degree = degree;
	}
	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "UserDetails [uId=" + uId + ", name=" + name + ", email=" + email + ", city=" + city + ", degree="
				+ degree + "]";
	}
	
	

}
