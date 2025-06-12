package com.di.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FactotialController {
	
	@RequestMapping("/getfact")
	public ModelAndView factorial(@RequestParam int number) {
		
	int fact=1;
	for(int i=1;i<=number;i++) {
		fact=fact*i;
	}
	ModelAndView mv=new ModelAndView("result");
	mv.addObject("fact",fact);
		return mv;
		
	}

}
