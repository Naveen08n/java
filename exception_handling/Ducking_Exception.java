import java.util.Scanner;

class Ducking{
	void alpha()throws Exception {
		System.out.println("Connection2 established");
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=a/b;
		System.out.println(c);
		System.out.println("connection terminated");
	}
}
public class Ducking_Exception {

	public static void main(String[] args) {
		System.out.println("connection1 established");
		try {
			Ducking d=new Ducking();
			d.alpha();
		}catch(Exception e) {
			System.out.println("main handled");
		}
		System.out.println("connection1 terminated");
	}

}
