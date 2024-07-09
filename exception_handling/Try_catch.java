import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_catch {

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
			
			System.out.println("size of array");
			int a=scan.nextInt();
			int[] ar=new int[a];
			System.out.println("enter the data");
			int data=scan.nextInt();
			int index=scan.nextInt();
			ar[index]=data;
			
			ar=null;
			System.out.println(ar[index]);
			
		}catch(ArithmeticException a) {
			System.out.println(a);
			//System.out.println(a.getMessage());
			System.out.println("Input value is non-zeros");
		}catch(InputMismatchException b) {
			//System.out.println(b.getMessage());
			System.out.println("InputMismatchExceptions data mistake");
		}catch(NegativeArraySizeException c) {
			System.out.println("size in negative value");
		}catch(ArrayIndexOutOfBoundsException d) {
			System.out.println("size if overflow");
		}catch(Exception e) {
			System.out.println("problem");
		}
		System.out.println("connection terminated");
	}
		

}
