package com.orlando.vaccineregistrationcampaign.service;

import java.util.List;

import com.orlando.vaccineregistrationcampaign.model.HealthWorker;
import com.orlando.vaccineregistrationcampaign.model.Vaccine;

public interface HealthWorkerService {
	public boolean addHealthWorker(HealthWorker healthWorker);
	public List<HealthWorker> getAllHealthWorkers();
	public HealthWorker findHealthWorkerById(int id);
	public boolean updateHealthWorker(HealthWorker healthworker);
	public void deleteHealthWorker(int id);
	

}
