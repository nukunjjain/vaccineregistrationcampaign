package com.orlando.vaccineregistrationcampaign.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orlando.vaccineregistrationcampaign.dao.VendorDaoImpl;
import com.orlando.vaccineregistrationcampaign.model.Admin;
import com.orlando.vaccineregistrationcampaign.model.Vaccine;
import com.orlando.vaccineregistrationcampaign.model.VaccineVendor;


@Service
public class VendorService {
	@Autowired
	VendorDaoImpl dao;
	
	public boolean validateVendor(VaccineVendor vendor) {
		VaccineVendor vendor1=dao.validateVendor(vendor);
		if((vendor.getVendorpassword()).equalsIgnoreCase(vendor1.getVendorpassword())){
			
			return true;
		}
		else {
			return false;
		}
	
		// TODO Auto-generated method stub
		
		
	}

	public boolean checkStatus() {
		Vaccine vaccine=dao.checkStatus();
		if((vaccine.getStatus()).equalsIgnoreCase("true")) {
			return true;
		}
		else {
		return false;
		}
		// TODO Auto-generated method stub
		
	}

}
