package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.jdbc.result.ResultSetInternalMethods;

public class CreateTableQuery {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String url="jdbc:mysql://localhost:3306/collegeCodes";
		String username="root";
		String pass="root";
		String sql="create table phone(no int,name varchar(40),location varchar(90))";
		String sql1="insert into phone values(125647,'asdrsd','ngp'),(2342,'ghfyd','mum'),(5674,'jkjk','pune')";
		String sql2="insert into phone(no,name,location) values(?,?,?)";
		String sql3="insert into phone values(2345,'sdfas','MP')";
		String sql4="insert into phone values(789202,'khiun','UP')";
		String sql5="insert into phone values(753627,'juahun','Himachal')";
	
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection(url, username, pass);
		
		Statement st = con.createStatement();
		
		st.addBatch(sql3);
		st.addBatch(sql4);
		st.addBatch(sql5);
		
		st.executeBatch();
		
		System.out.println("Used batch successfully");
		//PreparedStatement st = con.prepareStatement(sql2);
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter number");
//		
//		
//		int no=sc.nextInt();
//		st=setInt(1,no);
//		
//		System.out.println("enter name");
//		
//		String name=sc.next();
//		
//		st=setString(2,name);
//		
//		System.out.println("enter your location");
//		
//		String location=sc.next();
//		
//		st.setString(3, location);
//		
//		int executeUpdate = st.executeUpdate();
//		
//		System.out.println(executeUpdate);
//		
		
		
//	Statement st=con.createStatement();
//
//	int i=st.executeUpdate(sql1);
//	System.out.println(i +"row affected");
	}

}
