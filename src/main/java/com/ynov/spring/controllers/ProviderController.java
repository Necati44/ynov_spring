package com.ynov.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProviderController {

	@GetMapping("/providers")
	public String listProviders()
	{
		return "provider/providers";
	}
	
}
