package com.ani.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PetController {
	
	@RequestMapping("/pet")
	public ModelAndView Pet() {
		return  new ModelAndView("pet");
	}

	@RequestMapping("/rabbit")
	public ModelAndView Rabbit() {
		return  new ModelAndView("rabbit");
	}
	
	@RequestMapping("/dog")
	public ModelAndView Dog() {
		return  new ModelAndView("dog");
	}
	@RequestMapping("/cat")
	public ModelAndView Cat() {
		return  new ModelAndView("cat");
	}
	@RequestMapping("/buffalo")
	public ModelAndView Buffalo() {
		return  new ModelAndView("buffalo");
	}
	
}
