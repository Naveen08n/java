package Arrays_programming;

import java.util.Scanner;
class Prbm{
	private int id;
	private String name;
	private String email;
	private long phone;
	public int getId() {
		return id;
	}
	public int setId(int id) {
		return this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
}


public class Test_Prbm1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		String s=scan.nextLine();
		String s1=scan.nextLine();
		Prbm[]arr=new Prbm[n];
		for(int i=0;i<n;i++) {
			Prbm p=new Prbm();
			//int id=p.setId(id);
			int id=Integer.parseInt(p.setId(id));
			p.setName(s);
			p.setEmail(s);
			long phone=Long.parseLong(setPhone(phone));
		}
		
		Prbm p=new Prbm();
		
		
		
	}

	

}
