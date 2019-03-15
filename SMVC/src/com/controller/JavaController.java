package com.controller;

import java.sql.SQLException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

@Controller
public class JavaController{
	
	@RequestMapping("home")
	public ModelAndView hellWorld()
	{
	    ModelAndView mv=new ModelAndView("Hello");
		mv.addObject("msg", "Hello World");
		return mv;
	}
	
}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//	@Autowired
//	ValidateDao  validate;
//	
//	@RequestMapping(value="h", method = RequestMethod.GET)
//	public ModelAndView homepage()
//	{
//		ModelAndView mv=new ModelAndView("home");
//		return mv;
//	}
//	
//	@RequestMapping(value="login", method = RequestMethod.GET)
//	public ModelAndView loginpage()
//	{
//		ModelAndView mv=new ModelAndView("login");
//		return mv;
//	}
//	
//	@RequestMapping(value="register", method = RequestMethod.GET)
//	public ModelAndView registerpage()
//	{
//		ModelAndView mv=new ModelAndView("registration");
//		return mv;
//	}
//	
//	@RequestMapping(value="about", method = RequestMethod.GET)
//	public ModelAndView aboutpage()
//	{
//		ModelAndView mv=new ModelAndView("about");
//		return mv;
//	}
//	
//	@RequestMapping(value="cart", method = RequestMethod.GET)
//	public ModelAndView cartpage()
//	{
//		ModelAndView mv=new ModelAndView("cart");
//		return mv;
//	}
//	
//	@RequestMapping(value="watch", method = RequestMethod.GET)
//	public ModelAndView watchpage()
//	{
//		ModelAndView mv=new ModelAndView("watchdescription");
//		return mv;
//	}
//	
//	@RequestMapping(value="headphone", method = RequestMethod.GET)
//	public ModelAndView headphonepage()
//	{
//		ModelAndView mv=new ModelAndView("headphonedescription");
//		return mv;
//	}
//	
//	@RequestMapping(value="phone", method = RequestMethod.GET)
//	public ModelAndView phonepage()
//	{
//		ModelAndView mv=new ModelAndView("phonedescription");
//		return mv;
//	}
//	
//	@RequestMapping(value="laptop", method = RequestMethod.GET)
//	public ModelAndView laptoppage()
//	{
//		ModelAndView mv=new ModelAndView("laptopdescription");
//		return mv;
//	}
//	
//	@RequestMapping(value="trimmer", method = RequestMethod.GET)
//	public ModelAndView trimmerpage()
//	{
//		ModelAndView mv=new ModelAndView("trimmerdescription");
//		return mv;
//	}
//	
//	@RequestMapping(value="speaker", method = RequestMethod.GET)
//	public ModelAndView speakerpage()
//	{
//		ModelAndView mv=new ModelAndView("speakerdescription");
//		return mv;
//	}
//	
//	
//	@RequestMapping(value = "validate", method = RequestMethod.POST)
//	public ModelAndView getLogin1(@RequestParam("username") String name,@RequestParam("password") String pswd) throws SQLException {

//		ModelAndView m=new ModelAndView("hello2");
//		m.addObject("msg", name+pwd);
		
//	boolean status = validate.validate(name, pswd);
//	if(status)
//	{
//		ModelAndView model = new ModelAndView("home");
//		return model;
//	}
//	else {
//		ModelAndView model2 = new ModelAndView("login");
//		return model2;
//	}
//	
//		
//	}
	
		
	
//	@RequestMapping(value="cart.jsp", method = RequestMethod.GET)
//	public ModelAndView cartpage()
//	{
//		ModelAndView mv=new ModelAndView("cart");
//		return mv;
//	}

//	@ModelAttribute
//	public void display(Model mv)
//	{
//		mv.addAttribute("d", "Oxford College");
//		
//	}
	
	
	//public ModelAndView submitAdmissionForm(@RequestParam("name") String name, @RequestParam("hobby") String hobby)
	//public ModelAndView submitAdmissionForm(@RequestParam Map<String,String> rp)
//	@RequestMapping(value="f2", method = RequestMethod.POST)
//	public ModelAndView submitAdmissionForm(@ModelAttribute("s1") Student s1)
//	 {
//		String name=rp.get("name");
//		String hobby=rp.get("hobby");
//		
//		
//		Student s1=new Student();
//		s1.setName(name);
//		s1.setHobby(hobby);
		
		
	//	ModelAndView mv=new ModelAndView("AdmissionSuccess");
		//mv.addObject("s1", s1);
		
//		mv.addObject("msg","Name: "+name+", Hobby= "+hobby);
//		return mv;
//	}
	
//	@RequestMapping("/welcome/{name}/{country}")
//	public ModelAndView helloWorld(@PathVariable Map<String,String> p)
//	{
//	    String name=p.get("name");
//	    String country=p.get("country");
//		
//		ModelAndView mv=new ModelAndView("HelloPage");
//		mv.addObject("msg", "Hello "+name+", u r frm "+country);
//		return mv;
//	}
//
	
