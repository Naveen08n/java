import java.util.Scanner;

public class Factorial {
	static int fact(int n) {
		if(n==1||n==0) {
			return 1;
		}
		
		
		return n*fact(n-1);
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println(fact(n));
	}

}
