package Arrays_programming;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Day3 {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/jdbcjuly";
		String username="root";
		String password="root";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is loaded");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			DriverManager.getConnection(url,username,password);
			System.out.println("Established the connection ");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}
