package com.orlando.vaccineregistrationcampaign.model;

public class VaccineVendor {
	int vendorid;
	String vendorusername;
	String vendorpassword;
	public String getVendorusername() {
		return vendorusername;
	}
	public void setVendorusername(String vendorusername) {
		this.vendorusername = vendorusername;
	}
	public String getVendorpassword() {
		return vendorpassword;
	}
	public void setVendorpassword(String vendorpassword) {
		this.vendorpassword = vendorpassword;
	}
	public int getVendorid() {
		return vendorid;
	}
	public void setVendorid(int vendorid) {
		this.vendorid = vendorid;
	}
	@Override
	public String toString() {
		return "VaccineVendor [vendorid=" + vendorid + ", vendorusername=" + vendorusername + ", vendorpassword="
				+ vendorpassword + "]";
	}
	
}
