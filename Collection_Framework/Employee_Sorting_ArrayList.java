import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private String department;
	private int salary;
	
	public Employee() {
		
	}
	public Employee(int id, String name, String department, int salary) {
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
	@Override
	public int compareTo(Employee e2) {
		Employee e1=this;
		
		/*
		 * Integer id1=e1.id; Integer id2=e2.id;
		 */
		/*if(id1 > id2){
			return 1;
		}else if(id2>id1){
			return -1;
		}else {
			return 0;
		}*/
		//name
		//return e1.name.compareTo(e2.name);
		Integer sal1=e1.salary;
		Integer sal2=e2.salary;
		return sal1.compareTo(sal2);
		/*
		 * int n=id1.compareTo(id2); return n;
		 */
	}
	
	
}
public class Employee_Sorting_ArrayList {

	public static void main(String[] args) {
		Employee e1=new Employee(2,"tcs","it",10000);
		Employee e2=new Employee(1,"bob","it",50000);
		Employee e3=new Employee(3,"alex","it",20000);
		
		ArrayList al=new ArrayList();
		al.add(e1);
		al.add(e2);
		al.add(e3);
	
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
	}

}
