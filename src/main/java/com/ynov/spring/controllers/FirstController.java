package com.ynov.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {

	@GetMapping("/info")
	public String information()
	{
		return "first/info";
	}
	
	@GetMapping("/details")
	public String detailsFormation()
	{
		return "first/details";
	}
}
