package Arrays_programming;

import java.util.Scanner;
class Repeated{
	void repeated(int[] arr,int[] arr1) {
		int i=0,j=0;
		while(i<arr.length && j<arr1.length) {
			if(arr[i]==arr1[j]) {
				System.out.println(arr[i]); 
				i++;
				j++;
			}else if(arr[i]>arr[j]) {
				j++;
			}else {
				i++;
			}
		}
	}
}

public class Repeated_both_arrays {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Repeated r=new Repeated();
		int n=scan.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		int m=scan.nextInt();
		int[] arr1=new int[m];
		for(int i=0;i<m;i++) {
			arr1[i]=scan.nextInt();
		}
		r.repeated(arr, arr1);
		

	}

}
