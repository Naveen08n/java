import java.util.Scanner;
//use Runnable interface to achieve concurrent programming
class Demo11 implements Runnable{
	public void run() {
		System.out.println("Adding started");
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scan.nextInt();
		System.out.println("enter the number2");
		int m=scan.nextInt();
		int res=n+m;
		System.out.println(res);
		System.out.println("Adding completed");
	}
}
class Demo22 implements Runnable{
	public void run() {
		System.out.println("print characters");
		for(int i=65;i<75;i++){
			System.out.println((char)i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("character completed");
	}
}
class Demo33 implements Runnable{
	public void run() {
		System.out.println("started print numbers");
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class Multi_threading_Runnable {

	public static void main(String[] args) {
		Demo11 d1=new Demo11();
		Demo22 d2=new Demo22();
		Demo33 d3=new Demo33();
		
		Thread t1=new Thread(d1);
		Thread t2=new Thread(d2);
		Thread t3=new Thread(d3);
		
		t1.start();
		t2.start();
		t3.start();

	}

}
