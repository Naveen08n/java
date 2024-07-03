package Jdk;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Day1 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("load the driver");
			DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcjune", "root", "root");
			System.out.println("conncetion established");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
