package com.orlando.vaccineregistrationcampaign.model;

public class Vaccine {
	private int vaccineId;
	private String vaccinename;
	private int vaccinedoses;
	private String status;
	
	public int getVaccineId() {
		return vaccineId;
	}
	public void setVaccineId(int vaccineId) {
		this.vaccineId = vaccineId;
	}
	public String getVaccinename() {
		return vaccinename;
	}
	public void setVaccinename(String vaccinename) {
		this.vaccinename = vaccinename;
	}
	public int getVaccinedoses() {
		return vaccinedoses;
	}
	public void setVaccinedoses(int vaccinedoses) {
		this.vaccinedoses = vaccinedoses;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Vaccine [vaccineId=" + vaccineId + ", vaccinename=" + vaccinename + ", vaccinedoses=" + vaccinedoses
				+ ", status=" + status + "]";
	}
	
	

}
