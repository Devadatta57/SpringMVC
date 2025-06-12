package com.ani.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WildController {
	
	@RequestMapping("/wild")
	public ModelAndView Wild() {
		return new ModelAndView("wild");
	}
	
	@RequestMapping("/tiger")
	public ModelAndView Tiger(){
		return new ModelAndView("tiger");
	}
	
	@RequestMapping("/lion")
	public ModelAndView Lion(){
		return new ModelAndView("lion");
	}

	@RequestMapping("/jaguar")
	public ModelAndView Jaguar(){
		return new ModelAndView("jaguar");
	}

	@RequestMapping("/fox")
	public ModelAndView Fox(){
		return new ModelAndView("fox");
	}


}
