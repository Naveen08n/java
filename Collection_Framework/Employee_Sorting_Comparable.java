import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

class Employees implements Comparable<Employees>{
	private int id;
	private String name;
	private String department;
	private int salary;
	private float height;
	
	public Employees() {
		
	}

	public Employees(int id, String name, String department, int salary,float height) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.height=height;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return id+" "+name+" "+department+" "+salary+" "+height;
	}
	@Override
	public int compareTo(Employees e2) {
		Employees e1=this;
		
		/*
		 * Integer id1=e1.id; Integer id2=e2.id; return id1.compareTo(id2);
		 */
		String  name1=e1.name;
		String name2=e2.name;
		if(name1.equals(name2)){
			Integer id1=e1.id;
			Integer id2=e2.id;
			return id1.compareTo(id2);
		}else {
			return name1.compareTo(name2);
		}
	}
	 
}
public class Employee_Sorting_Comparable {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//ArrayList al=new ArrayList();
		TreeSet al=new TreeSet();
		int n=scan.nextInt();
		for(int i=1; i<=n; i++) {
			Employees e1=new Employees();
			String str=scan.next();
			String[] arr=str.split(",");
			e1.setId(Integer.parseInt(arr[0]));
			e1.setName(arr[1]);
			e1.setDepartment(arr[2]);
			e1.setSalary(Integer.parseInt(arr[3]));
			e1.setHeight(Float.parseFloat(arr[4]));
			
			al.add(e1);
		}
		//Collections.sort(al);
		System.out.println(al);
		
	}

}
