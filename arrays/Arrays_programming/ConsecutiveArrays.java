package Arrays_programming;

import java.util.Scanner;

public class ConsecutiveArrays {
	static void consecutiveArray(int[] a) {
		int i=0,j=0;
		for(i=0;i<a.length-1;i++) {
			if(a[i]+1==a[i+1])//if(a[i+1]-a[i]==1)
			{
				System.out.print(a[i]+" ");
			}else {
				System.out.println(a[i]);
			}
		}
		System.out.println(a[a.length-1]);
	}
	static void consecutiveSorted(int[] a) {
		int i=0,j=0;
		for(i=0;i<a.length-1;i++) {
			if(a[i]<=a[i+1] ){
				System.out.print(a[i]+" ");
			}else {
				System.out.println(a[i]);
			}
		}
		System.out.println(a[a.length-1]);
	}
	static void conSumSorted(int[] a) {
		int i=0,j=0;
		int count=1;
		for(i=0;i<a.length-1;i++) {
			
			if(a[i+1]-a[i]==1 ){
				count++;
			}else {
				System.out.println(count);
				count=1;
			}
		}
		System.out.println(count);
	}
	static void conLargeSorted(int[] a) {
		int i=0,j=0,si=0,ei=0;
		int count=1,max=0;
		for(i=0;i<a.length-1;i++) {
			
			if(a[i+1]-a[i]==1 ){
				count++;
			}else {
				if(count>max) {
					max=count;
					ei=i;
				}
				count=1;
			}
		}
		if(count>max) {
			max=count;
			ei=a.length-1;
		}
		si=ei-max+1;
		for(i=si; i<=ei;i++) {
			System.out.print(a[i]+" ");
		}

	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
		}
		//consecutiveArray(a);
		//consecutiveSorted(a);
		//conSumSorted(a);
		conLargeSorted(a);
	}

}
