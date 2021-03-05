package com.orlando.vaccineregistrationcampaign.dao;

import java.util.List;

import com.orlando.vaccineregistrationcampaign.model.HealthWorker;
import com.orlando.vaccineregistrationcampaign.model.Vaccine;

public interface HealthWorkerDao {
	public Vaccine searchVaccineByName(String name);
	public void updateVaccineDoses(int remainingDoses,String vaccinename);
	public void addHealthWorker(HealthWorker healthWorker);
	public List<HealthWorker> getAllHealthWorkers();
	public HealthWorker findHealthWorkerById(int id);
	public void updateHealthWorker(HealthWorker healthWorker);
	public void deleteHealthWorker(int id);

}
