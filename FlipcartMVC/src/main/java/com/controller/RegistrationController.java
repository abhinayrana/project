package com.controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.Dao.ValidateDao;



@Controller
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

@Autowired
ValidateDao v;

@RequestMapping(value = "reg", method = RequestMethod.POST)
public ModelAndView getRegister(HttpServletRequest request, HttpServletResponse response) {
		
	ModelAndView m =new ModelAndView();
		HttpSession s=request.getSession();
		String name=request.getParameter("name");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
	    
		int i=0;
				
		
		try {
			
			i=v.insert(name,username,password);
			if(i==1)
			{
				s.setAttribute("message","Registration Successful, Login again");
				m=new ModelAndView("login");
				
			}
			
		}
		catch (SQLException e)
		{
			if(i!=1)
			{
				
				s.setAttribute("emessage","Username already exists");
				m=new ModelAndView("registration");
			}
	
		}
		return m;
		
	}
}