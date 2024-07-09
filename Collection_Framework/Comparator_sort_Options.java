import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Scanner;

class Demo11 implements Comparator<Emp>{
	@Override
	public int compare(Emp e1,Emp e2) {
			Integer id1=e1.getId();
			Integer id2=e2.getId();
			
			return id1.compareTo(id2);
	}
}

class Demo123 implements Comparator<Emp>{
	@Override
	public int compare(Emp e1,Emp e2) {
		return (e1.getName()).compareTo(e2.getName());
	}
}
class Demo13 implements Comparator<Emp>{
	@Override
	public int compare(Emp e1,Emp e2) {
		return (e1.getDepartment()).compareTo(e2.getDepartment());
	}
}
class Demo14 implements Comparator<Emp>{
	@Override
	public int compare(Emp e1,Emp e2) {
		Integer id1=e1.getSalary();
		Integer id2=e2.getSalary();
		
		return id1.compareTo(id2);
	}
}

class Emp {
	private int id;
	private String name;
	private String department;
	private int salary;
	
	public Emp() {
		
	}
	public Emp(int id, String name, String department, int salary) {
		super();
		this.id=id;
		this.name=name;
		this.department=department;
		this.salary=salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
		return id+" "+name+" "+department+" "+salary;
	}
	
	
}
public class Comparator_sort_Options {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Demo11 d1=new Demo11();
		Demo123 d2=new Demo123();
		Demo13 d3=new Demo13();
		Demo14 d4=new Demo14();
		
		TreeSet<Emp> ts=null;
		System.out.println("Enter sorted on\n 1.ID\n 2.NAME\n 3.DEPARTMENT\n 4.SALARY");
		int option=scan.nextInt();
		switch(option) {
		case 1 :ts=new TreeSet<Emp>(d1);
			break;
		case 2 :ts=new TreeSet<Emp>(d2);
			break;
		case 3 :ts=new TreeSet<Emp>(d3);
			break;
		case 4 :ts=new TreeSet<Emp>(d4);
			break;	
			default:System.out.println("Invalid input");
			break;
		}
		System.out.println("Enter the number of employees");
		int n=scan.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println("Enter the "+i+" employee details");
			String str=scan.next();
			String[] arr=str.split(",");
	
			Emp e=new Emp();
			e.setId(Integer.parseInt(arr[0]));
			e.setName(arr[1]);
			e.setDepartment(arr[2]);
			e.setSalary(Integer.parseInt(arr[3]));
			ts.add(e);
		}
		System.out.println(ts);

	}

}
