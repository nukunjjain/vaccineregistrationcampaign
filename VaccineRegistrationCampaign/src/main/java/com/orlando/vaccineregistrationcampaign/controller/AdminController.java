package com.orlando.vaccineregistrationcampaign.controller;

import java.util.ArrayList;
import java.util.List;

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
import com.orlando.vaccineregistrationcampaign.model.Student;
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
	
//	@RequestMapping( method = RequestMethod.GET)
//	public String newRegistration(ModelMap model) {
//		Student student = new Student();
//		model.addAttribute("student", student);
//		return "enroll";
//	}
	
	@RequestMapping(value="/sign",method = RequestMethod.POST)
	public ModelAndView signAdmin (@Valid @ModelAttribute("adminform") Admin admin, BindingResult result) {
		ModelAndView model = new ModelAndView();
		if (result.hasErrors()) {
			model.setViewName("admn_form");
			return model;
		}
		adminService.validateAdmin(admin);

		
		return null;
	}
	
	

	@ModelAttribute("sections")
	public List<String> initializeSections() {

		List<String> sections = new ArrayList<String>();
		sections.add("Graduate");
		sections.add("Post Graduate");
		sections.add("Research");
		return sections;
	}

	@ModelAttribute("countries")
	public List<String> initializeCountries() {

		List<String> countries = new ArrayList<String>();
		countries.add("USA");
		countries.add("CANADA");
		countries.add("FRANCE");
		countries.add("GERMANY");
		countries.add("ITALY");
		countries.add("OTHER");
		return countries;
	}

	@ModelAttribute("subjects")
	public List<String> initializeSubjects() {

		List<String> subjects = new ArrayList<String>();
		subjects.add("Physics");
		subjects.add("Chemistry");
		subjects.add("Life Science");
		subjects.add("Political Science");
		subjects.add("Computer Science");
		subjects.add("Mathmatics");
		return subjects;
	}

}
