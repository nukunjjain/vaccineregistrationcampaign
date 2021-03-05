package com.orlando.vaccineregistrationcampaign.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.orlando.vaccineregistrationcampaign.model.Admin;
import com.orlando.vaccineregistrationcampaign.model.HealthWorker;
import com.orlando.vaccineregistrationcampaign.model.HealthWorkerRowMapper;
import com.orlando.vaccineregistrationcampaign.model.Vaccine;
import com.orlando.vaccineregistrationcampaign.model.VaccineRowMapper;



@Repository
public class AdminDaoImpl implements AdminDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
    @Override
	public Admin validateAdmin(Admin admin) {
		
    	String query = "SELECT * FROM admin WHERE adminname = ?";
    	RowMapper<Admin> rowMapper = new BeanPropertyRowMapper<Admin>(Admin.class);
    	Admin admin1 = jdbcTemplate.queryForObject(query, rowMapper, admin.getAdminname());
		return admin1;
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Vaccine> checkVaccines() {
		// TODO Auto-generated method stub
		String query = "SELECT * from vaccine";
		RowMapper<Vaccine> rowMapper = new VaccineRowMapper();
		List<Vaccine> list = jdbcTemplate.query(query, rowMapper);

		return list;
		
	}

	@Override
	public Vaccine findVaccineById(int id) {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM vaccine WHERE vaccineid = ?";
		RowMapper<Vaccine> rowMapper = new BeanPropertyRowMapper<Vaccine>(Vaccine.class);
		Vaccine vaccine = jdbcTemplate.queryForObject(query, rowMapper, id);

		return vaccine;
	}

	@Override
	public void saveUpdatedVaccine(Vaccine vaccine) {
		// TODO Auto-generated method stub
		String query="Update vaccine set status=? where vaccineId=?";
		jdbcTemplate.update(query,vaccine.getStatus(),vaccine.getVaccineId());
		
	}

}
