package com.tap.model;

public class Employee {
	private int id,balance;
	private String name,dept;
	public Employee() {
		super();
	}
	public Employee(int id, String name,int balance, String dept) {
		super();
		this.id = id;
		this.balance = balance;
		this.name = name;
		this.dept = dept;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", balance=" + balance + ", name=" + name + ", dept=" + dept + "]";
	}
	
}
