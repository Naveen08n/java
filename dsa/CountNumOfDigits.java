import java.util.Scanner;

public class CountNumOfDigits {
	static int CND(int n) {
		if(n==0) {
			return 0;
		}
		
		return CND(n/10) + 1;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println(CND(n));

		

	}

}
