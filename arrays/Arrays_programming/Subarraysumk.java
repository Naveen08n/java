package Arrays_programming;

import java.util.Scanner;

public class Subarraysumk {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++) {
		a[i]=scan.nextInt();
	}
	int size=scan.nextInt();
	int k=scan.nextInt();
	int count=0,j=0;
	for(int i=0;i<=a.length-size;i++) {
		int sum=0;
		for(j=i;j<i+size;j++) {
			sum=sum+a[j]; 
		}
		if(sum==k) {
				for( j=i;j<i+size;j++) {
					System.out.print(a[j]+" ");
				}
			System.out.println();
		}
		
	}

	}

}
