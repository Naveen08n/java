package com.tap.daoiml;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.tap.dao.EmployeeDao;
import com.tap.database.Myconnection;
import com.tap.model.Employee;

public class EmployeeDAOImp implements EmployeeDao {
	private Myconnection mycon;
	private Connection connection;
	private Statement stmt;
	private ResultSet res;
	private PreparedStatement pstmt;
	public EmployeeDAOImp() {
		mycon=Myconnection.getConnection();
		connection=mycon.connect();
	}
	@Override
	public int insertEmp(Employee e) {
		Scanner scan=new Scanner(System.in);
		try {
			pstmt=connection.prepareStatement("Insert into transfor(id, name, balance,dept) values(?,?,?,?)");
		
			pstmt.setInt(1, e.getId());
			pstmt.setString(2, e.getName());
			pstmt.setInt(3, e.getBalance());
			pstmt.setString(4,e.getDept());
			
			return pstmt.executeUpdate();
			
		} catch (SQLException e1) {
			e1.printStackTrace();
			return 0;

		}
	}
	@Override
	public int deleteEmp(int id) {
		Scanner scan=new Scanner(System.in);
		try {
			pstmt=connection.prepareStatement("delete from transfor where id=? ");
			pstmt.setInt(1, id);
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
		
	}
	@Override
	public List<Employee> fetchAllEmp() {
		Scanner scan=new Scanner(System.in);
		List list=new ArrayList();
		try {
			stmt=connection.createStatement();
			res=stmt.executeQuery("select * from transfor");
	
			while(res.next()) {
				/*
				 * int id=res.getInt(1); String name=res.getString(2); int
				 * balance=res.getInt(3); String dept=res.getString(4);
				 */
				  
				//  Employee emp=new Employee(id,name,balance,dept);
				  list.add(res.getInt(1)+" "+res.getString(2)+" "+res.getInt(3)+" "+res.getString(4));
				  
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	@Override
	public Employee fecthEmp(int id) {
		Scanner scan=new Scanner(System.in);
		Employee emp=null;
		try {
			pstmt=connection.prepareStatement("select * from transfor where id = ?");
			pstmt.setInt(1, id);
		    res=pstmt.executeQuery();
		    while(res.next()) {
		    	int id1=res.getInt(1); 
		    	String name=res.getString(2); 
		    	int balance=res.getInt(3); 
		    	String dept=res.getString(4);
		    	emp=new Employee(id1,name,balance,dept);
		    }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return emp;
	}
	@Override
	public int updateSalOnId(int id, int balance) {
		try {
			pstmt=connection.prepareStatement("update transfor set balance=? where id =?");
			pstmt.setInt(1, balance);
			pstmt.setInt(2, id);
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return 0;
	}
	
}
