package com.orlando.vaccineregistrationcampaign.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class HealthWorker {
	private Integer hid;
	@NotBlank(message="Enter workername")
	@Size(min=3, max=30)
	private String workername;
	@NotBlank(message="Enter workercity")
	@Size(min=3, max=30)
	private String workercity;
	@NotBlank(message="Specify Age")
	private String age;
	@NotBlank(message="Specify Sex")
	private String sex;
	@NotBlank(message="Select Vaccine")
	private String vaccine;
	@NotBlank(message="Specify Doses")
	
	private String doses;
	public Integer getHid() {
		return hid;
	}
	public void setHid(Integer hid) {
		this.hid = hid;
	}
	public String getWorkername() {
		return workername;
	}
	public void setWorkername(String workername) {
		this.workername = workername;
	}
	public String getWorkercity() {
		return workercity;
	}
	public void setWorkercity(String workercity) {
		this.workercity = workercity;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getVaccine() {
		return vaccine;
	}
	public void setVaccine(String vaccine) {
		this.vaccine = vaccine;
	}
	public String getDoses() {
		return doses;
	}
	public void setDoses(String doses) {
		this.doses = doses;
	}
	@Override
	public String toString() {
		return "HealthWorker [hid=" + hid + ", workername=" + workername + ", workercity=" + workercity + ", age=" + age
				+ ", sex=" + sex + ", vaccine=" + vaccine + ", doses=" + doses + "]";
	}
	
	
	
	
	
	

}
