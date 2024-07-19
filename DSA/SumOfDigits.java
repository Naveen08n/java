import java.util.Scanner;

public class SumOfDigits {
	static int SOD(int n) {
		if(n==0) {
		return 0;
		}
		return SOD(n/10) + (n%10);
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println(SOD(n));
		
	}

}
