import java.util.Scanner;

class SingleRun1 extends Thread {
	@Override
	public void run() { 
		int t=getPriority();
		if(t==3) {
			add();
		}else if(t==2) {
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
public class Single_Run_2 {
	public static void main(String[] args) {
		
		SingleRun1 s1=new SingleRun1();
		SingleRun1 s2=new SingleRun1();
		SingleRun1 s3=new SingleRun1();
		
		s1.setPriority(3);
		//System.out.println(s1.getPriority());
		s2.setPriority(2);
		s3.setPriority(1);
		
		s1.start();
		s2.start();
		s3.start();
		
	}

}
