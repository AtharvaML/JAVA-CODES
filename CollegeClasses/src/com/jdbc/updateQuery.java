package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class updateQuery {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://localhost:3306/pce";
		String username="root";
		String pass="root";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
	   Connection con=DriverManager.getConnection(url,username,pass);
	   
	    
	    con.setAutoCommit(false);
	    
	    String q="select qunatity from products where productid=?";
	    
	    PreparedStatement p= con.prepareStatement(q);
	    
	    p.setInt(1,1);
	    
	    ResultSet rs = p.executeQuery();
	    
	    if(rs.next()) {
	    	int availability=rs.getInt("qunatity");
	    	
	    	if(availability>=20) {
	    		
	    		String insertquery="insert into orderDetails(orderid,productid,qunatity) values(?,?,?)";
	    		PreparedStatement ps = con.prepareStatement(insertquery);
	    		ps.setInt(1,101);
	    		ps.setInt(2,1);
	    		ps.setInt(3,20);
	    		
	    		ps.executeUpdate();
	    		
	    		String updatequery="update products set qunatity=qunatity-? where productid=?";
	    		PreparedStatement ps1 = con.prepareStatement(updatequery);
	    		
	    		ps1.setInt(1,1);
	    		ps1.setInt(2,20);
	    		
	    		ps1.executeUpdate();
	    		
	    		con.commit();
	    		
	    		System.out.println("✅ Order placed successfully!");
	    		
	    	}
	    	else {
	    		System.out.println("not enough stock");
	    		con.rollback();
	    	}
	    }
	    else {
	    	System.out.println("product not found");
	    	con.rollback();
	    }
	    
	   
	   System.out.println("hii");

	}

}
