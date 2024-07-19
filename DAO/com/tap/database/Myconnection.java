package com.tap.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class Myconnection {
	//static Connection con=null;
	private Myconnection() {
		
	}
	static private Myconnection connection =new Myconnection();
	
	public static Myconnection getConnection() {
		return connection;
	}
	public static Connection connect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcjune","root","root");
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
}
