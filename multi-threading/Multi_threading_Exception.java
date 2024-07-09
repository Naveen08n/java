import java.util.Scanner;
//use Runnable interface to achieve concurrent programming
class Demo111 implements Runnable{
	public void run() {
		System.out.println("Divding started");
		int res=100/0;
		System.out.println(res);
		System.out.println("Divding completed");
	}
}
class Demo222 implements Runnable{
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
class Demo333 implements Runnable{
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
public class Multi_threading_Exception {

	public static void main(String[] args) {
		Demo111 d1=new Demo111();
		Demo222 d2=new Demo222();
		Demo333 d3=new Demo333();
		
		Thread t1=new Thread(d1);
		Thread t2=new Thread(d2);
		Thread t3=new Thread(d3);
		
		t1.start();
		t2.start();
		t3.start();

	}

}
