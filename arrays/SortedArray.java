import java.util.Scanner;

public class SortedArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
			}
		int count=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==arr[i+1]) {
				count++;
			}else {
				System.out.println(arr[i]+" ");
			}
		}
			System.out.println(arr[arr.length-1]+ " ");

	
	}

}
