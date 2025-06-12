package com.mvc.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mvc.model.Student;

import jakarta.validation.Valid;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	
	
	@RequestMapping("/register")
	public ModelAndView Register() {
		return new ModelAndView("register");
	}
	
	@RequestMapping("/saveuser")
	public ModelAndView SaveUser(@Valid @ModelAttribute Student student,BindingResult result ) {
		if(result.hasErrors()) {	
			List<FieldError> errorList=result.getFieldErrors();
			ModelAndView mv=new ModelAndView("register");
			mv.addObject("errorList",errorList);
			return mv;
		}
		
		ModelAndView mv=new ModelAndView("viewemp");
		mv.addObject("student",student);
		return mv;
	}
}


