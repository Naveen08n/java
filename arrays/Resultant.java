import java.util.Scanner;

public class Resultant {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] arr= new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		product(arr,n);
		
		/*
		 * int p=1; for(int i=0;i<arr.length;i++) { p *= arr[i]; }
		 * System.out.println(p);
		 * 
		 * int res[]=new int[arr.length];
		 * 
		 * for(int i=0;i<res.length;i++) { res[i]=p/arr[i]; } for(int
		 * i=0;i<res.length;i++) { System.out.print(res[i]+ " ");;
		 * 
		 * }
		 */
		
	}

	private static void product(int[] arr, int n) {
		int p=1;
		for(int i=0;i<arr.length;i++) {
			p *= arr[i];	
		}
		System.out.println(p);
	
		int res[]=new int[arr.length];
		
		for(int i=0;i<res.length;i++) {
			res[i]=p/arr[i];
		}
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+ " ");;
		
		}
		
		
	}
}
