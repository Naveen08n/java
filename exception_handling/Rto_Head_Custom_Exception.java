import java.util.Scanner;
class UnderAgeException extends Exception{
	
}
class OverAgeException extends Exception{
	
}
class Consultant{
	int age;
	void acceptInput() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the age");
		age=scan.nextInt();
	}
	void verify() throws Exception {
		if(age >= 18 && age < 60) {
			System.out.println("Take licience");
			
		}else if(age < 18) {
			UnderAgeException ue=new UnderAgeException();
			System.out.println("Under age");
			throw ue;
			
		}else if(age > 60) {
			OverAgeException oe=new OverAgeException();
			System.out.println("Over age");
			throw oe;
		}else {
			System.out.println("blocked");
		}
	}
}
class Rto{
	void init() {
		Consultant c=new Consultant();
		try {
		c.acceptInput();
		c.verify();
		}catch(Exception e) {
			try {
			c.acceptInput();
			c.verify();
			}catch(Exception f) {
				try {
				c.acceptInput();
				c.verify();
				}catch(OverAgeException g) {
					System.err.println("Your age is out of the rto terms");
				}catch(UnderAgeException h) {
					System.err.println("ReachedOut When YOu get eligiblility");
				}catch(Exception i) {
					System.out.println("Handled");
				}
			}
		}
	}
}
public class Rto_Head_Custom_Exception {

	public static void main(String[] args) {
		Rto r=new Rto();
		r.init();
	}

}
