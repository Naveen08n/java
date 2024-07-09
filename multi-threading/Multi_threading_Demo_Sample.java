import java.util.Scanner;

public class Multi_threading_Demo_Sample {

	public static void main(String[] args)  {
		System.out.println("Adding started");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number1");
		int a=scan.nextInt();
		System.out.println("Enter the Number2");
		int b=scan.nextInt();
		int res=a+b;
		System.out.println(res);
		System.out.println("Adding completed");
		
		System.out.println("Print Characters Started");
		for(int i=65;i<75;i++) {
			System.out.println((char)i);
			try {
			Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Characters completed");
		
		System.out.println("print numbers");
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			try {
			Thread.sleep(1000);
			}catch(Exception f) {
				f.printStackTrace();
			}
		}
		System.out.println("numbers print completed");
		
		
	}

}
