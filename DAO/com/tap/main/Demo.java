package com.tap.main;

import java.util.Scanner;

import com.tap.daoiml.EmployeeDAOImp;
import com.tap.model.Employee;

public class Demo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int id=4;
		//int id=scan.nextInt();
		int balance=3000;
		String name="whatsap",dept="it";
		Employee e=new Employee(id,name,balance,dept);
		EmployeeDAOImp edi=new EmployeeDAOImp();
		//System.out.println("updated "+edi.insertEmp(e));
		//System.out.println("updated "+edi.deleteEmp(id));
		//System.out.println(edi.fetchAllEmp());
		//System.out.println(edi.fecthEmp(id));
		System.out.println("updated"+" "+edi.updateSalOnId(2, 4000));

	}

}
