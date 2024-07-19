package com.tap.dao;

import java.util.List;

import com.tap.model.Employee;

public interface EmployeeDao {
	int insertEmp(Employee e);
	int deleteEmp(int id);
	List<Employee>fetchAllEmp();
	Employee fecthEmp(int id);
	int updateSalOnId(int id,int balance);
}
