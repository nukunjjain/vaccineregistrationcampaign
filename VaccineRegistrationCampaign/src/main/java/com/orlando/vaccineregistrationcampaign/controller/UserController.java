package com.orlando.vaccineregistrationcampaign.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.orlando.vaccineregistrationcampaign.model.Admin;

@Controller
@RequestMapping("/user")

public class UserController {
	
	@RequestMapping(value = "/firstpage", method = RequestMethod.GET)
	public ModelAndView loginAdmin() {
		ModelAndView model = new ModelAndView();
		
		
        model.setViewName("user_page");
		return model;
	}

}
