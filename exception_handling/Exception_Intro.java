import java.util.Scanner;

public class Exception_Intro {

	public static void main(String[] args) {
		System.out.println("conncetion established");
		Scanner scan=new Scanner(System.in);
		try {
			System.out.println("Enter the numerator");
			int n=scan.nextInt();
			System.out.println("Enter the denomirator");
			int m=scan.nextInt();
			int k=n/m;
			System.out.println(k);
		}catch(Exception e) {
			System.out.println("Exception occured I will handle");
		}

		
		/*
		try {
			 k=n/m;
		}catch(Exception e) {
			System.out.println("Exception occured I will handle");
		}
		*/
		//System.out.println(k);
		System.out.println("connection terminated");
	}

}
