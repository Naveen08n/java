import java.util.Scanner;

class InvalidInputException extends Exception{
	public String getMessages() {
		 return "Invalid Input";

	}
		
	
}
class Atm{
	int pin=1234;
	int p;
	public void acceptInput() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Pin");
		p=scan.nextInt();
	}
	public void verify()throws Exception {
		if(pin==p) {
			System.out.println("collect your cash");
		}else {
			InvalidInputException ie=new InvalidInputException(); 
			System.out.println(ie.getMessages());
			throw ie;
		}
	}
}
class Bank{
	public void init() {
	Atm a=new Atm();
	try {
	a.acceptInput();
	a.verify();
	}catch (Exception e) {
		try {
		a.acceptInput();
		a.verify();
		}catch(Exception f) {
			try {
			a.acceptInput();
			a.verify();
			}catch(Exception g) {
				System.out.println("CARD IS BLOCK....!!!! REACH YOUR BRANCH!!!!!");
			}
		}
	}
	}
}
public class Rbi_Custom_Exception {

	public static void main(String[] args) {
		Bank b=new Bank();
		b.init();
	}

}
