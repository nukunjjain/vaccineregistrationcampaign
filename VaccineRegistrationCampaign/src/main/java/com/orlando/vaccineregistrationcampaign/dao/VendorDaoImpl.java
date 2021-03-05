package com.orlando.vaccineregistrationcampaign.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.orlando.vaccineregistrationcampaign.model.Admin;
import com.orlando.vaccineregistrationcampaign.model.Vaccine;
import com.orlando.vaccineregistrationcampaign.model.VaccineVendor;

@Repository
public class VendorDaoImpl {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
    
	public VaccineVendor validateVendor(VaccineVendor vendor) {
		
    	String query = "SELECT * FROM vaccinevendor WHERE vendorusername = ?";
    	RowMapper<VaccineVendor> rowMapper = new BeanPropertyRowMapper<VaccineVendor>(VaccineVendor.class);
    	VaccineVendor vendor1 = jdbcTemplate.queryForObject(query, rowMapper, vendor.getVendorusername());
		return vendor1;
		// TODO Auto-generated method stub
		
	}


	public Vaccine checkStatus() {
		String query="SELECT * from vaccine where vaccinename=?";
	 	RowMapper<Vaccine> rowMapper = new BeanPropertyRowMapper<Vaccine>(Vaccine.class);
		Vaccine vaccine = jdbcTemplate.queryForObject(query, rowMapper,"covaxin");	
		return vaccine;
		// TODO Auto-generated method stub
		
	}
	
	

}
