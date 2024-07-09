import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

class Dem11 implements Comparator<Details>{
	@Override
	public int compare(Details d1, Details d2) {
		Integer id1=d1.getId();
		Integer id2=d2.getId();
		
		return id1.compareTo(id2);
	}
}
class Demo112 implements Comparator<Details>{

	@Override
	public int compare(Details d1, Details d2) {
		Integer id1=d1.getId();
		Integer id2=d2.getId();
		
		if(id1 > id2) {
			return -1 * 1;
		}else if(id2 > id1) { //swap
			return -1 * -1;
		}else {
			return -1 * 0;
		}
	}
	
}
class DemO2 implements Comparator<Details>{
	@Override
	public int compare(Details d1, Details d2) {
		
		return d1.getName().compareTo(d2.getName());
	}
}
class DemO3 implements Comparator<Details>{
	@Override
	public int compare(Details d1, Details d2) {
		
		return d1.getDept().compareTo(d2.getDept());
	}
}
class DemO4 implements Comparator<Details>{
	@Override
	public int compare(Details d1, Details d2) {
		Integer sal1=d1.getSal();
		Integer sal2=d2.getSal();
		
		return sal1.compareTo(sal2);
	}
}
class Details{
	private int id;
	private String name;
	private String dept;
	private int sal;
	
	public Details() {
		
	}
	public Details(int id, String name, String dept, int sal) {
		super();
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.sal=sal;
		
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setDept(String dept) {
		this.dept=dept;
	}
	public String getDept() {
		return dept;
	}
	public void setSal(int sal) {
		this.sal=sal;
	}
	public int getSal() {
		return sal;
	}

	@Override
	public String toString() {
		return id+" "+name+" "+dept+" "+sal;
	}
	/*
	 * @Override public int compareTo(Details d2) { Details d1=this; Integer
	 * id1=d1.id; Integer id2=d2.id; return id1.compareTo(id2); }
	 */
}
public class Low_high_Comparator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Dem11 de1=new Dem11();
		Demo112 de12=new Demo112();
		DemO2 de2=new DemO2();
		DemO3 de3=new DemO3();
		DemO4 de4=new DemO4();
		
		TreeSet<Details> ts=null;
		System.out.println("Enter Sorted On\n 1.ID(LOw TO HIGH)\n 2.ID(HIGH TO LOW)\n 3.NAME\n 4.DEPARTMENT\n 5.SALARY\n");
		int Option=scan.nextInt();
		
		switch(Option) {
		case 1: ts=new TreeSet(de1);
			break;
		case 2: ts=new TreeSet(de12);
			break;
		case 3:ts=new TreeSet(de2);
			break;
		case 4: ts=new TreeSet(de3);
			break;
		case 5: ts=new TreeSet(de4);
			break;
			default:
				System.out.println("Invalid Option");
				break;
		}
		System.out.println("Enter number of Details");
		int n=scan.nextInt();
	
		for(int i=1;i<=n;i++) {
			Details d=new Details();
			String str=scan.next();
			String[] arr=str.split(",");
			d.setId(Integer.parseInt(arr[0]));
			d.setName(arr[1]);
			d.setDept(arr[2]);
			d.setSal(Integer.parseInt(arr[3]));
			ts.add(d);
			
		}
		System.out.println(ts);
	}

}
