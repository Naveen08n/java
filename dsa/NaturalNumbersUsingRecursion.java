import java.util.Scanner;

public class NaturalNumbersUsingRecursion {
	static void PrintN(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		PrintN(n-1);
		//System.out.println(n);
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		PrintN(n);


	}

}
