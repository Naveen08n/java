import java.util.Scanner;

class SingleRun extends Thread {
	@Override
	public void run() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		
		if(name.equals("Thread-0")) {
			add();
		}else if(name.equals("Thread-1")) {
			printChars();
		}else {
			printNumbers();
		}
		
	}
	public void add() {
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
	public void printChars() {
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
	public void printNumbers() {
		System.out.println("started print numbers");
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
public class Single_Run {
	public static void main(String[] args) {
		
		SingleRun s1=new SingleRun();
		SingleRun s2=new SingleRun();
		SingleRun s3=new SingleRun();
		
		s1.start();
		s2.start();
		s3.start();
		
	}

}
