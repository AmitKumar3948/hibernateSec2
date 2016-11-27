package com.amit.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.amit.entity.district;
import com.amit.services.districtService;

@Controller
public class districtController {
	
	@Autowired
	private districtService distSer;
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String listEmployees(ModelMap map) 
	{
		map.addAttribute("district", new district());
		map.addAttribute("employeeList", distSer.getAllDistrict());
		
		return "editEmployeeList";
	}
	
	
	@RequestMapping(value = { "/", "/welcome**" }, method = RequestMethod.GET)
	public String welcomePage(ModelMap map) {


		map.addAttribute("title", "Spring Security Hello World");
		map.addAttribute("message", "This is welcome page!");
		return "hello";

	}

	@RequestMapping(value = "/admin**", method = RequestMethod.GET)
	public String adminPage(ModelMap map) {

		map.addAttribute("title", "Spring Security Hello World");
		map.addAttribute("message", "This is protected page!");
		
		return "admin";

	}
	
	
	//Spring Security see this :
		@RequestMapping(value = "/login", method = RequestMethod.GET)
		public String login(ModelMap map,
			@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout) {

			if (error != null) {
				map.addAttribute("error", "Invalid username and password!");
			}

			if (logout != null) {
				map.addAttribute("msg", "You've been logged out successfully.");
			}
			

			return "login";

		}


}
