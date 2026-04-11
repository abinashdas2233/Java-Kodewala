package com.kodewala.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kodewala.DTO.AmazonData;

@Controller
public class OrderController {
	
	@RequestMapping("/reg")
	public String redirectRegistrationPage() {
		
		return "registrationpage";
		
	}
	
	@PostMapping("/datapass")
	public String formValidation(@ModelAttribute AmazonData data) {
		System.out.println(data.toString());
		return "successpage";
		
	}

}
