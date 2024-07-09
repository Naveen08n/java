import java.util.Scanner;

class Demo1 extends Thread{
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
class Demo2 extends Thread{
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
class Demo3 extends Thread{
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

public class Multi_Threading_Extends {
 
	public static void main(String[] args) {
		Demo1 d1=new Demo1();
		Demo2 d2=new Demo2();
		Demo3 d3=new Demo3();
		
		d1.start();// we can use run method we can achieved multithreading run() is inside start().
		d2.start();
		d3.start();

	}

}
