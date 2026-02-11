package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class DemoJdbc{
public static void main(String[] args) throws Exception{	
	
		String url="jdbc:mysql://localhost:3306/collegeCodes";
		String user="root";
		String pass="root";
		String sql="Select * from student";
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded successfully");
			
		Connection con=DriverManager.getConnection(url, user, pass);
			System.out.println("connection established successfully");
			
		Statement st=con.createStatement();
		

		ResultSet res=st.executeQuery(sql);
		
		while(res.next()) {
			System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getString(3)+" "+res.getString(4));
		}
			
	

}
 }
