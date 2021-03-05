package com.orlando.vaccineregistrationcampaign.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orlando.vaccineregistrationcampaign.dao.HealthWorkerDaoImpl;
import com.orlando.vaccineregistrationcampaign.model.HealthWorker;
import com.orlando.vaccineregistrationcampaign.model.Vaccine;

@Service
public class HealthWorkerServiceImpl implements HealthWorkerService {
	@Autowired
	HealthWorkerDaoImpl workerDao;

	@Override
	public boolean addHealthWorker(HealthWorker healthWorker) {
		// TODO Auto-generated method stub
		Vaccine vaccine = workerDao.searchVaccineByName(healthWorker.getVaccine());
		int d = Integer.parseInt(healthWorker.getDoses());
		if (vaccine.getVaccinedoses() > 0 && vaccine.getVaccinedoses() > d) {
			int remainingDoses = vaccine.getVaccinedoses() - d;
			workerDao.updateVaccineDoses(remainingDoses, vaccine.getVaccinename());
			workerDao.addHealthWorker(healthWorker);

			return true;

		} else {
			return false;
		}
	}

	@Override
	public List<HealthWorker> getAllHealthWorkers() {
		// TODO Auto-generated method stub
		List<HealthWorker> list = workerDao.getAllHealthWorkers();
		return list;
	}

	@Override
	public HealthWorker findHealthWorkerById(int id) {
		// TODO Auto-generated method stub
		HealthWorker healthworker = workerDao.findHealthWorkerById(id);
		return healthworker;
	}

	@Override
	public boolean updateHealthWorker(HealthWorker healthworker) {
		// TODO Auto-generated method stub
		Vaccine vaccine = workerDao.searchVaccineByName(healthworker.getVaccine());
		int d = Integer.parseInt(healthworker.getDoses());
		if (vaccine.getVaccinedoses() > 0 && vaccine.getVaccinedoses() > d) {
			int remainingDoses = vaccine.getVaccinedoses() - d;
			workerDao.updateVaccineDoses(remainingDoses, vaccine.getVaccinename());
			workerDao.updateHealthWorker(healthworker);
			return true;
		}
		return false;

	}

	@Override
	public void deleteHealthWorker(int id) {
		// TODO Auto-generated method stub
		workerDao.deleteHealthWorker(id);
		

	}

}
