package com.orlando.vaccineregistrationcampaign.model;

import javax.validation.constraints.NotBlank;

public class User {
	
	private int cid;
	@NotBlank(message="Please Enter Your Name")
	private String cname;
	@NotBlank(message="Please Enter Your Age")
	private String age;
	@NotBlank(message="Please Enter Your City")
	private String city;
	@NotBlank(message="Please Enter Your mobileno")
	private String mobileno;
	@NotBlank(message="Please Enter Your vaccine")
	private String vaccine;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getVaccine() {
		return vaccine;
	}
	public void setVaccine(String vaccine) {
		this.vaccine = vaccine;
	}
	@Override
	public String toString() {
		return "User [cid=" + cid + ", cname=" + cname + ", age=" + age + ", city=" + city + ", mobileno=" + mobileno
				+ ", vaccine=" + vaccine + "]";
	}
	
	

}
