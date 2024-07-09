import java.util.Arrays;

class Student{
	private int id;
	private String name;
	private String email;
//	private int[] naveen;
	private long phone;
	
	public Student() {
		
		
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/*public int[] getNaveen() {
		return naveen;
	}

	public void setNaveen(int[] naveen) {
		this.naveen = naveen;
	}*/

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public Student(int id, String name, String email, long phone) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	//	this.naveen = naveen;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", naveen=" 
				+ ", phone=" + phone + "]";
	}
	
//	public Student(int id, String name, String email, long phone) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.email = email;
//		this.phone = phone;
//	}
//
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getEmail() {
//		return email;
//	}
//	public void setEmail(String email) {
//		this.email = email;
//	}
//	public long getPhone() {
//		return phone;
//	}
//	public void setPhone(long phone) {
//		this.phone = phone;
//	}
//	@Override //toString method was inherit in this class not Override, manually we can do it.
//	public String toString() {
//		return "["+" "+id+" "+name+" "+email+" "+phone+" "+"]";
//	}
	
}
public class ToString_Method {

	public static void main(String[] args) {
		Student s=new Student(1,"naveen","navi@gmail.com",9876544);
		//String s1="java";//toString method was Override in String class
		System.out.println(s);
	}

}
