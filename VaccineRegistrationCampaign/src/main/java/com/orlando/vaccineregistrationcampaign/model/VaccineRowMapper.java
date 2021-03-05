package com.orlando.vaccineregistrationcampaign.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class VaccineRowMapper implements RowMapper<Vaccine> {

	@Override
	public Vaccine mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Vaccine vaccine=new Vaccine();
		vaccine.setVaccineId(rs.getInt("vaccineid"));
		vaccine.setVaccinename(rs.getString("vaccinename"));
		vaccine.setVaccinedoses(rs.getInt("vaccinedoses"));
		vaccine.setStatus(rs.getString("status"));
		return vaccine;
	}

}
