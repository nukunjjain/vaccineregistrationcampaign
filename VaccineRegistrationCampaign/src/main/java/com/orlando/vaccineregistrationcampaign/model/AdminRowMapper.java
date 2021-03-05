package com.orlando.vaccineregistrationcampaign.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class AdminRowMapper implements RowMapper<Admin>{

	@Override
	public Admin mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Admin admin1=new Admin();
		admin1.setAdminname(rs.getString("adminname"));
		admin1.setAdminpassword(rs.getString("adminpassword"));
		return admin1;
	}

}
