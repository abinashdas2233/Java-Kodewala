package com.kodewish.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {
	
	@RequestMapping("/amazondemo")
	public ModelAndView openLogin() {
		ModelAndView modelview=new ModelAndView();
		modelview.setViewName("login");
		return modelview;
	}
	

}
