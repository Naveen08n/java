import java.util.Scanner;

class Rethrow{
	void alpha() throws Exception {
		System.out.println("connection2 established");
		Scanner scan=null;
		try {
		scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=a/b;
		System.out.println(c);
		}catch(Exception e) {
			System.out.println("handled");
			throw e;
		}
		
		finally {
			scan.close();
			System.out.println("connection2 terminated");
		
		}
		
	}
}
public class Rethrowing_Exception {

	public static void main(String[] args)  {
		System.out.println("connection1 established");
		try {
		Rethrow r=new Rethrow();
		r.alpha();
		}catch(Exception e1) {
			System.out.println("Main handled");
		}
		System.out.println("connection1 terminated");
	}

}
