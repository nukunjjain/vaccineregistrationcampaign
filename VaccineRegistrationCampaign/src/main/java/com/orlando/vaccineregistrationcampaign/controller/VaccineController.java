package com.orlando.vaccineregistrationcampaign.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.orlando.vaccineregistrationcampaign.model.Admin;
import com.orlando.vaccineregistrationcampaign.model.VaccineVendor;
import com.orlando.vaccineregistrationcampaign.service.VendorService;

@Controller
@RequestMapping("/vaccine")
public class VaccineController {
	
	@Autowired
	VendorService vendorService;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView loginAdmin() {
		ModelAndView model = new ModelAndView();
		VaccineVendor vendor = new VaccineVendor();
		model.addObject("vendorform",vendor);
        model.setViewName("vendor_form");
		return model;
	}

	@RequestMapping(value = "/status", method = RequestMethod.GET)
	public ModelAndView checkStatus() {
		ModelAndView model = new ModelAndView();
		boolean status=vendorService.checkStatus();
		if(status!=false) {
			 model.setViewName("noUpdate");
			return model;
		}
		else {
			 model.setViewName("vaccineStatusupdate");
		return model;
		}
	}
	
	@RequestMapping(value="/sign",method = RequestMethod.POST)
	public ModelAndView signAdmin (@Valid @ModelAttribute("vendorform") VaccineVendor vendor, BindingResult result,HttpServletRequest request) {
		ModelAndView model = new ModelAndView();
		if (result.hasErrors()) {
			model.setViewName("vendor_form");
			return model;
		}
		boolean validate=vendorService.validateVendor(vendor);
		if(validate!=true) {
			model.setViewName("vendorloginfailure");
		}
		else {
			model.setViewName("vendorloginsuccess");
			HttpSession session=request.getSession(true);
			session.setAttribute("vendorname",vendor.getVendorusername());
		}
		return model;	
	}
}
