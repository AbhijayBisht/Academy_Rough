package com.cts.Academy.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cts.Academy.bean.Batch;
import com.cts.Academy.bean.Faculty;
import com.cts.Academy.bean.Login;
import com.cts.Academy.service.FacultyService;
import com.cts.Academy.service.ModuleService;
import com.cts.Academy.bean.Module;


@Controller("Admin")
public class AdminController {
	
	@Autowired
	FacultyService facultyService;
	@Autowired
	ModuleService moduleService;
	@Autowired
	BatchService batchService;
	
	@Autowired
	SessionFactory getSessionFactory;
	
	@RequestMapping(value="Admin-AddProduct.html")
	public String getAddProduct(){
		return "Admin-AddProduct";
	}
	
	@RequestMapping(value="Admin-AddProduct.html")
	public String getAddModulePage(){
		return "Admin-AddModule";
	}
	
	@RequestMapping(value="Admin-AddProduct.html")
	public String getbatchAllocationPage(){
		return "Admin-batchAllocationPage";
	}
	@RequestMapping(value="deleteProduct.html")
	public ModelAndView getDeleteProduct(@ModelAttribute Faculty faculty , @RequestParam("id") String id){
		ModelAndView mav= new ModelAndView();
		facultyService.deleteProduct(faculty.getFaculty_Id());
		mav.setViewName("Admin-Controls");
		return mav;
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
	
	@RequestMapping(value="Add-Product.html",method=RequestMethod.POST)
	public ModelAndView addModulePage(@ModelAttribute Module module , HttpSession httpSession){
		String s= moduleService.addModulePage(module);
		ModelAndView modelAndView = new ModelAndView();
		if(s=="success")
		{
		modelAndView.setViewName("Admin-Controls");
		modelAndView.addObject("modules",moduleService.addModulePage(module));
		}
		else{
			modelAndView.setViewName("Admin-Controls");
		}
		return modelAndView;
	}
	
	@RequestMapping(value="Add-Product.html",method=RequestMethod.POST)
	public ModelAndView batchAllocationPage(@ModelAttribute Batch batch , HttpSession httpSession){
		String s= facultyService.batchAllocationPage(batch);
		ModelAndView modelAndView = new ModelAndView();
		if(s=="success")
		{
		modelAndView.setViewName("Admin-Controls");
		modelAndView.addObject("batchs",facultyService.batchAllocationPage(batch));
		}
		else{
			modelAndView.setViewName("Admin-Controls");
		}
		return modelAndView;
	}

}
