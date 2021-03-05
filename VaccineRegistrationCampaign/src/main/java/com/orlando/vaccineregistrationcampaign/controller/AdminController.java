package com.orlando.vaccineregistrationcampaign.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.orlando.vaccineregistrationcampaign.model.Admin;
import com.orlando.vaccineregistrationcampaign.model.HealthWorker;
import com.orlando.vaccineregistrationcampaign.model.Student;
import com.orlando.vaccineregistrationcampaign.model.Vaccine;
import com.orlando.vaccineregistrationcampaign.service.AdminServiceImpl;




@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private AdminServiceImpl adminService;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView loginAdmin() {
		ModelAndView model = new ModelAndView();
		Admin admin = new Admin();
		model.addObject("adminform",admin);
        model.setViewName("admn_form");
		return model;
	}
	
	
	@RequestMapping(value = "/homepage", method = RequestMethod.GET)
	public ModelAndView homePage() {
		ModelAndView model = new ModelAndView();
        model.setViewName("adminloginsuccess");
		return model;
	}
	
//	@RequestMapping( method = RequestMethod.GET)
//	public String newRegistration(ModelMap model) {
//		Student student = new Student();
//		model.addAttribute("student", student);
//		return "enroll";
//	}
	
	@RequestMapping(value="/sign",method = RequestMethod.POST)
	public ModelAndView signAdmin (@Valid @ModelAttribute("adminform") Admin admin, BindingResult result,HttpServletRequest request) {
		ModelAndView model = new ModelAndView();
		if (result.hasErrors()) {
			model.setViewName("admn_form");
			return model;
		}
		boolean validate=adminService.validateAdmin(admin);
		if(validate!=true) {
			model.setViewName("adminloginfailure");
		}
		else {
			model.setViewName("adminloginsuccess");
			HttpSession session=request.getSession(true);
			session.setAttribute("adminname",admin.getAdminname());
		}
		return model;	
		 
	}
	@RequestMapping(value = "/checkvaccines", method = RequestMethod.GET)
	public ModelAndView checkVaccines() {
		ModelAndView model = new ModelAndView();
		List<Vaccine> vaccines=adminService.checkVaccines();
		model.addObject("vaccine_list", vaccines);
        model.setViewName("vaccine_list");
		return model;
	}
	@RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
	public ModelAndView editEmployee(@PathVariable int id) {
		ModelAndView model = new ModelAndView();

		Vaccine vaccine = adminService.findVaccineById(id);
		model.addObject("vaccineform", vaccine);
		model.setViewName("vaccine_form");
		return model;
	}
	
	@RequestMapping(value = "/vaccine/save", method = RequestMethod.POST)
	public ModelAndView saveUpdatedVaccine(@Valid @ModelAttribute("vaccineform") Vaccine vaccine,
			BindingResult result) {
		adminService.saveUpdatedVaccine(vaccine);
		ModelAndView model = new ModelAndView();

		model.setViewName("success");
				return model;
			
	}
	
}
