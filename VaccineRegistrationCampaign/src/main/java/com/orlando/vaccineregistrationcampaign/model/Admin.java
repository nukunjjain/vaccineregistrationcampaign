package com.orlando.vaccineregistrationcampaign.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class Admin {
	@NotBlank(message="UserName can not be empty!")
	private String adminname;
	 @NotBlank(message="Password can not be empty!")
	private String adminpassword;
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getAdminname() {
		return adminname;
	}
	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}
	public String getAdminpassword() {
		return adminpassword;
	}
	public void setAdminpassword(String adminpassword) {
		this.adminpassword = adminpassword;
	}
	@Override
	public String toString() {
		return "Admin [adminname=" + adminname + ", adminpassword=" + adminpassword + "]";
	}

}
