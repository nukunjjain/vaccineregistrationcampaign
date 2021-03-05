package com.orlando.vaccineregistrationcampaign.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


public class HealthWorkerRowMapper implements RowMapper<HealthWorker> {

	@Override
	public HealthWorker mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		HealthWorker healthworker=new HealthWorker();
		healthworker.setHid(rs.getInt("hid"));
		healthworker.setWorkername(rs.getString("workername"));
		healthworker.setWorkercity(rs.getString("workercity"));
		healthworker.setAge(rs.getString("age"));
		healthworker.setSex(rs.getString("sex"));
		healthworker.setDoses(rs.getString("doses"));
		healthworker.setVaccine(rs.getString("vaccine"));
		return healthworker;
	}

}
