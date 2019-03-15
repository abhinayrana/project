package com.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.Dao.ValidateDao;

@Controller
public class LoginController {

	@Autowired
	ValidateDao  v;
	
	@RequestMapping(value = "validate", method = RequestMethod.POST)
	public ModelAndView getLogin(HttpServletRequest request, HttpServletResponse response, @RequestParam("username") String name,@RequestParam("password") String pswd) throws SQLException 
	{
		HttpSession session=request.getSession();
		int res=0;
		ModelAndView m=null;
		
		try {
			
			res=v.validate(name, pswd);
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		if(res==1)
		{
			 session.setAttribute("username", name);
			 m=new ModelAndView("home");
		}
	
		else
		{
			session.setAttribute("emessage", "Invalid username or password");
			 m=new ModelAndView("login");
		}

		
	return m;
  }
}
