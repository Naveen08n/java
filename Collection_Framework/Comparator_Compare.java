import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

class Demo1 implements Comparator<Employe>{
	@Override
	public int compare(Employe e1,Employe e2) {
		Integer id1=e1.getId();
		Integer id2=e2.getId();
		
		return id1.compareTo(id2);
	}
}
class Demo12 implements Comparator<Employe>{
	@Override
	public int compare(Employe e1,Employe e2) {
		
		return e1.getName().compareTo(e2.getName());
	}
}
class Employe {
	private int id;
	private String name;
	private String department;
	private int salary;
	
	public Employe() {
		
	}
	public Employe(int id, String name, String department, int salary) {
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
	/*
	@Override
	public int compareTo(Employe e2) {
		Employe e1=this;
		Integer id1=e1.id;
		Integer id2=e2.id;
		
		return id1.compareTo(id2);
		/*
		 * if(id1 > id2) { return 1; }else if(id2 > id1) { return -1; }else { return 0;
		 * }
		 
	
	}
*/
	
}
public class Comparator_Compare {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Demo1 d=new Demo1();
		TreeSet<Employe> al=new TreeSet<Employe>(d);
		//ArrayList<Employe> al=new ArrayList<Employe>();
		int n=scan.nextInt();
		for(int i=1;i<=n;i++) {
			String str=scan.next();
			String[] arr=str.split(",");
	
			Employe e=new Employe();
			e.setId(Integer.parseInt(arr[0]));
			e.setName(arr[1]);
			e.setDepartment(arr[2]);
			e.setSalary(Integer.parseInt(arr[3]));
			al.add(e);
		}
		//System.out.println(al);
		//Collections.sort(al);
		System.out.println(al);
	}

}
