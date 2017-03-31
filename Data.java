package com.library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Data {

	private Connection conn;
	
	public Data(){
		try{
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library?useSSL=false","root","password");
		}catch(SQLException ex){ex.printStackTrace();}
	}
	
	public Librarian login(String username, char[] password){
		String pass = new String(password);
		Librarian lib = null;
	
		try{
			PreparedStatement preparedStmt = conn.prepareStatement("Select * FROM librarian WHERE name = ? AND password = ?;");
			preparedStmt.setString(1,username);
			preparedStmt.setString(2,pass);
			ResultSet rs = preparedStmt.executeQuery();
			while(rs.next()){
				int id 			= rs.getInt("id");
				String name 	= rs.getString("name");
				String email 	= rs.getString("email");
				String address 	= rs.getString("address");
				String city 	= rs.getString("city");
				
				lib = new Librarian(id, name, email, address, city);
			}
			preparedStmt.close();
			return lib;
		}catch(SQLException ex){ex.printStackTrace();}
		return lib;
		
	}
	
}
