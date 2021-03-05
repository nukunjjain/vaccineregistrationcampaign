package com.orlando.vaccineregistrationcampaign.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orlando.vaccineregistrationcampaign.dao.AdminDaoImpl;
import com.orlando.vaccineregistrationcampaign.model.Admin;
import com.orlando.vaccineregistrationcampaign.model.Vaccine;

@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	AdminDaoImpl dao;
	@Override
	public boolean validateAdmin(Admin admin) {
		Admin admin1=dao.validateAdmin(admin);
		if((admin.getAdminpassword()).equalsIgnoreCase(admin1.getAdminpassword())){
			
			return true;
		}
		else {
			return false;
		}
	
		// TODO Auto-generated method stub
		
		
	}
	@Override
	public List<Vaccine> checkVaccines() {
		// TODO Auto-generated method stub
		List<Vaccine> vaccines=dao.checkVaccines();
		return vaccines;
	}
	@Override
	public Vaccine findVaccineById(int id) {
		// TODO Auto-generated method stub
		Vaccine vaccine=dao.findVaccineById(id);
		return vaccine;
	}
	@Override
	public void saveUpdatedVaccine(Vaccine vaccine) {
		// TODO Auto-generated method stub
		dao.saveUpdatedVaccine(vaccine);
	}

}
