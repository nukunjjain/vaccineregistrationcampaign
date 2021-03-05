package com.orlando.vaccineregistrationcampaign.service;

import java.util.List;

import com.orlando.vaccineregistrationcampaign.model.Admin;
import com.orlando.vaccineregistrationcampaign.model.HealthWorker;
import com.orlando.vaccineregistrationcampaign.model.Vaccine;

public interface AdminService {
	public boolean validateAdmin(Admin admin);
	public List<Vaccine> checkVaccines();
	public Vaccine findVaccineById(int id);
	public void saveUpdatedVaccine(Vaccine vaccine);

}
