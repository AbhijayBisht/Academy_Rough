package com.cts.Academy.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cts.Academy.bean.Faculty;
import com.cts.Academy.service.FacultyService;

@Controller("Faculty")
public class FacultyController {
	
	@Autowired
	FacultyService facultyService;
	
	@RequestMapping(value="faculty.html")
	public String getLogin(){
		return "faculty";
	}
	
	@RequestMapping(value="Add-Product.html",method=RequestMethod.POST)
	public ModelAndView addProduct(@ModelAttribute Faculty faculty , HttpSession httpSession){
		String s= facultyService.addProduct(faculty);
		ModelAndView modelAndView = new ModelAndView();
		if(s=="success")
		{
		modelAndView.setViewName("Admin-Controls");
		modelAndView.addObject("facultys",facultyService.addProduct(faculty));
		}
		else{
			modelAndView.setViewName("Admin-Controls");
		}
		return modelAndView;
	}
	
}
