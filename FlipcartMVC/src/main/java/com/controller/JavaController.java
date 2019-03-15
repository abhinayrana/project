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

import com.Dao.ValidateDao;

@Controller
public class JavaController{
	
	
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public ModelAndView homepage()
	{
		ModelAndView mv=new ModelAndView("home");
		return mv;
	}
	
	@RequestMapping(value="login", method = RequestMethod.GET)
	public ModelAndView loginpage()
	{
		ModelAndView mv=new ModelAndView("login");
		return mv;
	}
	
	@RequestMapping(value="register", method = RequestMethod.GET)
	public ModelAndView registerpage()
	{
		ModelAndView mv=new ModelAndView("registration");
		return mv;
	}
	
	@RequestMapping(value="about", method = RequestMethod.GET)
	public ModelAndView aboutpage()
	{
		ModelAndView mv=new ModelAndView("about");
		return mv;
	}
	
	@RequestMapping(value="cart", method = RequestMethod.GET)
	public ModelAndView cartpage()
	{
		ModelAndView mv=new ModelAndView("cart");
		return mv;
	}
	
	@RequestMapping(value="watch", method = RequestMethod.GET)
	public ModelAndView watchpage()
	{
		ModelAndView mv=new ModelAndView("watchdescription");
		return mv;
	}
	
	@RequestMapping(value="headphone", method = RequestMethod.GET)
	public ModelAndView headphonepage()
	{
		ModelAndView mv=new ModelAndView("headphonedescription");
		return mv;
	}
	
	@RequestMapping(value="phone", method = RequestMethod.GET)
	public ModelAndView phonepage()
	{
		ModelAndView mv=new ModelAndView("phonedescription");
		return mv;
	}
	
	@RequestMapping(value="laptop", method = RequestMethod.GET)
	public ModelAndView laptoppage()
	{
		ModelAndView mv=new ModelAndView("laptopdescription");
		return mv;
	}
	
	@RequestMapping(value="trimmer", method = RequestMethod.GET)
	public ModelAndView trimmerpage()
	{
		ModelAndView mv=new ModelAndView("trimmerdescription");
		return mv;
	}
	
	@RequestMapping(value="speaker", method = RequestMethod.GET)
	public ModelAndView speakerpage()
	{
		ModelAndView mv=new ModelAndView("speakerdescription");
		return mv;
	}
	
	
	
}
