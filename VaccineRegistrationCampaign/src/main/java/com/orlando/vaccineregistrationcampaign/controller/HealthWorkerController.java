package com.orlando.vaccineregistrationcampaign.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.orlando.vaccineregistrationcampaign.model.Admin;
import com.orlando.vaccineregistrationcampaign.model.HealthWorker;
import com.orlando.vaccineregistrationcampaign.service.HealthWorkerServiceImpl;

@Controller
@RequestMapping(value = "/admin/healthworker")
public class HealthWorkerController {

	@Autowired
	HealthWorkerServiceImpl workerService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView getAllHealthWorkers(HttpServletRequest request) {
		HttpSession session=request.getSession(false);
		ModelAndView model = new ModelAndView();
		if(session==null) {
			model.setViewName("adminloginfailure");
			return model;
		}
		
		List<HealthWorker> list = workerService.getAllHealthWorkers();

		model.addObject("healthworker_list", list);
		model.setViewName("healthworker_list");
		return model;
	}

	@RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
	public ModelAndView editEmployee(@PathVariable int id) {
		ModelAndView model = new ModelAndView();

		HealthWorker worker = workerService.findHealthWorkerById(id);
		System.out.println(worker);
		model.addObject("workerform", worker);
		model.setViewName("worker_form");
		return model;
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView loginAdmin(HttpServletRequest request) {
		HttpSession session=request.getSession(false);
		if(session!=null) {
			ModelAndView model = new ModelAndView();
		HealthWorker worker = new HealthWorker();
		model.addObject("workerform", worker);
		model.setViewName("worker_form");
		return model;
		}
		else {
			ModelAndView model = new ModelAndView();
			model.setViewName("adminloginfailure");
			return model;
		}
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveHealthWorker(@Valid @ModelAttribute("workerform") HealthWorker worker,
			BindingResult result) {
		ModelAndView model = new ModelAndView();
		if (result.hasErrors()) {
			model.setViewName("worker_form");
			return model;
		} else {
			if (worker.getHid() != null) {

				boolean con = workerService.updateHealthWorker(worker);
				if (con != true) {
					model.setViewName("healthworkeraddfailure");
					return model;
				} else {
					return new ModelAndView("redirect:/admin/healthworker/list");
				}
			} else {
				boolean con = workerService.addHealthWorker(worker);
				if (con != true) {
					model.setViewName("healthworkeraddfailure");
					return model;
				} else {
					return new ModelAndView("redirect:/admin/healthworker/list");
				}
			}
		}

	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public ModelAndView deleteEmployee(@PathVariable("id") int id) {
		workerService.deleteHealthWorker(id);

		return new ModelAndView("redirect:/admin/healthworker/list");
	}

	@ModelAttribute("vaccines")
	public List<String> initializeVaccines() {
		List<String> vaccines = new ArrayList<String>();
		vaccines.add("Covaxin");
		vaccines.add("Covishield");
		return vaccines;

	}

}
