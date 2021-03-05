package com.orlando.vaccineregistrationcampaign.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.orlando.vaccineregistrationcampaign.model.Admin;
import com.orlando.vaccineregistrationcampaign.model.HealthWorker;
import com.orlando.vaccineregistrationcampaign.model.User;
import com.orlando.vaccineregistrationcampaign.service.UserServiceImpl;

@Controller
@RequestMapping("/user")

public class UserController {
	@Autowired
	UserServiceImpl userService;
	
	@RequestMapping(value = "/firstpage", method = RequestMethod.GET)
	public ModelAndView loginAdmin() {
		ModelAndView model = new ModelAndView();
		User user =new User();
		model.addObject("userpage", user);
        model.setViewName("user_page");
		return model;
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveUser(@Valid @ModelAttribute("userpage") User user,
			BindingResult result) {
		ModelAndView model = new ModelAndView();
		userService.saveUser(user);
		 model.setViewName("usersuccess");
		
				return model;
	
	}
	@ModelAttribute("vaccines")
	public List<String> initializeVaccines() {
		List<String> vaccines = new ArrayList<String>();
		vaccines.add("Covaxin");
		vaccines.add("Covishield");
		return vaccines;

	}
	
	@ModelAttribute("cities")
	public List<String> initializeCities() {
		List<String> cities = new ArrayList<String>();
		cities.add("Indore");
		cities.add("Bhopal");
		return cities;

	}
}
