import java.util.Scanner;

public class Errors {

	public static void main(String[] args) {
		/*
		 * Scanner scan=new Scanner(System.in); int a=scan.nextInt(); int
		 * b=scan.nextInt(); int c=a/b; System.out.println(c);
		 */
		/*disp();

		}
		static void disp() {
			disp();  //runtime error -- StackOverFlowError
		}*/
		int n=Integer.MAX_VALUE;
		try {
		int[] arr=new int[n]; //OutOfMemoryError
		}catch(Error e) {
			System.out.println("handled");
			
		}
		
	}

}
