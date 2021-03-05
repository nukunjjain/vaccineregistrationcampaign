package com.orlando.vaccineregistrationcampaign.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.orlando.vaccineregistrationcampaign.model.HealthWorker;
import com.orlando.vaccineregistrationcampaign.model.HealthWorkerRowMapper;
import com.orlando.vaccineregistrationcampaign.model.Vaccine;



@Repository
public class HealthWorkerDaoImpl implements HealthWorkerDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Vaccine searchVaccineByName(String name) {
		
		String query = "SELECT * FROM vaccine WHERE vaccinename = ?";
		RowMapper<Vaccine> rowMapper = new BeanPropertyRowMapper<Vaccine>(Vaccine.class);
		Vaccine vaccine=jdbcTemplate.queryForObject(query, rowMapper, name);
		return vaccine;
	}

	@Override
	public void updateVaccineDoses(int remainingDoses,String vaccinename) {
		// TODO Auto-generated method stub
		String query = "UPDATE vaccine SET vaccinedoses=? WHERE vaccinename =?";
		jdbcTemplate.update(query, remainingDoses, vaccinename);
		
	}

	@Override
	public void addHealthWorker(HealthWorker healthWorker) {
		// TODO Auto-generated method stub
		String query = "INSERT INTO healthworker(workername,workercity,age,sex,doses,vaccine) VALUES(?, ?, ?, ?, ?, ?)";
		jdbcTemplate.update(query,healthWorker.getWorkername(),healthWorker.getWorkercity(),healthWorker.getAge()
				,healthWorker.getSex(),healthWorker.getDoses(),healthWorker.getVaccine());
		
	}

	@Override
	public List<HealthWorker> getAllHealthWorkers() {
		// TODO Auto-generated method stub
		String query = "SELECT * from healthworker";
		RowMapper<HealthWorker> rowMapper = new HealthWorkerRowMapper();
		List<HealthWorker> list = jdbcTemplate.query(query, rowMapper);

		return list;
	}

	@Override
	public HealthWorker findHealthWorkerById(int id) {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM healthworker WHERE hid = ?";
		RowMapper<HealthWorker> rowMapper = new BeanPropertyRowMapper<HealthWorker>(HealthWorker.class);
		HealthWorker healthworker = jdbcTemplate.queryForObject(query, rowMapper, id);

		return healthworker;
		
	}

	@Override
	public void updateHealthWorker(HealthWorker healthWorker) {
		// TODO Auto-generated method stub
		String query = "UPDATE healthworker SET workername=?, workercity=?, age=?, sex=?, doses=?, vaccine=? WHERE hid=?";
		jdbcTemplate.update(query,healthWorker.getWorkername(),healthWorker.getWorkercity(),healthWorker.getAge(),
				healthWorker.getSex(),healthWorker.getDoses(),healthWorker.getVaccine(),healthWorker.getHid());
	}

	@Override
	public void deleteHealthWorker(int id) {
		// TODO Auto-generated method stub
		String query = "DELETE FROM healthworker WHERE hid=?";
		jdbcTemplate.update(query, id);
		
	}

}
