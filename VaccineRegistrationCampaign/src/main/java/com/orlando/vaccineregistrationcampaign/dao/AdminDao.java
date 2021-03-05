package com.orlando.vaccineregistrationcampaign.dao;

import java.util.List;

import com.orlando.vaccineregistrationcampaign.model.Admin;
import com.orlando.vaccineregistrationcampaign.model.Vaccine;

public interface AdminDao {
	public Admin validateAdmin(Admin admin);
	public List<Vaccine> checkVaccines();
	public Vaccine findVaccineById(int id);
	public void saveUpdatedVaccine(Vaccine vaccine);
	

}
