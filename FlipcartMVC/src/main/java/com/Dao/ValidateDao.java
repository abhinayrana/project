package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.connection.ConnectionFactory;
import com.pojo.User;


public class ValidateDao {

	public int insert(String name, String username,  String password) throws SQLException {
		String query = "insert into VALIDATION values(?,?,?)";
	    Connection conn = ConnectionFactory.getConnection();
		PreparedStatement pStatement = conn.prepareStatement(query);
		pStatement.setString(1, name);
		pStatement.setString(2, username);
		pStatement.setString(3, password);
		int output = pStatement.executeUpdate();
		return output;
		}
	
	public   int validate(String username, String password) throws SQLException {
		int i=0;
		String query="select count(*) from VALIDATION where username= ? and password= ?";
		Connection conn = ConnectionFactory.getConnection();
		PreparedStatement pStatement= conn.prepareStatement(query);
		pStatement.setString(1, username);
		pStatement.setString(2, password);
		ResultSet count=pStatement.executeQuery();
		
		while(count.next()) {
			i=count.getInt(1);
		}
		return i;
		
		
		
	}
}
