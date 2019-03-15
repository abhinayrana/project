package com.controller.j;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Service;

@Service
public class ValidateDao {
	
	public boolean validate(String username,String password)  throws SQLException 
	{
		
		Connection con = ConnectionFactory.getConnection();
	System.out.println(con);
		
			 Statement s=con.createStatement();
	           String sql = "SELECT username,password FROM flipcart";
	            ResultSet rs = s.executeQuery(sql);
	        
				while(rs.next()){
				String name= rs.getString("username");
				String pswd = rs.getString("password");
				
            if(username.equals(name)&& password.equals(pswd))
            {
            	
            	return true;
            }
           
				}
				return false;
				
	
}
	
}
