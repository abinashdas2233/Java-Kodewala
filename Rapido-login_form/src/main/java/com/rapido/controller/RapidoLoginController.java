package com.rapido.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RapidoLoginController {
	
	
	@RequestMapping("/redirectlogin")
	public String redirectLogin() {
		return "logform";
	}
	@PostMapping("/logdata")
	public String loginFunctionallity(@RequestParam("email")String email,@RequestParam("password") String password) {
		
		System.out.println("email-"+email+" Password-"+password);
		return "logsuccess";
	}

}
