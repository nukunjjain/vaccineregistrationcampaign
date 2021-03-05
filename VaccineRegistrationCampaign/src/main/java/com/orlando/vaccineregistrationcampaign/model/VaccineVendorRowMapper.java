package com.orlando.vaccineregistrationcampaign.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class VaccineVendorRowMapper implements RowMapper<VaccineVendor> {

	@Override
	public VaccineVendor mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		VaccineVendor vendor=new VaccineVendor();
		vendor.setVendorusername(rs.getString("vendorusername"));
		vendor.setVendorpassword(rs.getString("vendorpassword"));
		return vendor;
	}

}
