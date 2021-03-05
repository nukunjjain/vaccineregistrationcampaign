package com.orlando.vaccineregistrationcampaign.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.orlando.vaccineregistrationcampaign.model.User;

@Repository
public class UserDaoImpl {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	

	public void saveUser(User user) {
		// TODO Auto-generated method stub
		String query = "INSERT INTO customer(cname,age,city,mobileno,vaccine) VALUES(?, ?, ?, ?, ?)";
		jdbcTemplate.update(query,user.getCname(),user.getAge(),user.getCity(),user.getMobileno(),user.getVaccine());
	}
	
	

}
