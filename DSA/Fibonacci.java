import java.util.Scanner;

public class Fibonacci {
	static int fibo(int n) {
		if(n==1||n==2){
			return 1;
		}
		
		return fibo(n-2)+fibo(n-1);
		
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println(fibo(n));
		
	}

}
