package Arrays_programming;

import java.util.Scanner;

public class RearrangeSubarry {
	static void rearrangeZeroOne(int[] a) {
	for(int size=a.length;size>1;size--) {
		for(int i=0;i<=a.length-size;i++) {
			int sum=0,count1=0,count2=0;
			for(int j=i;j<i+size;j++) {
				if(a[j]==0) {
					count1++;
				}
				if(a[j]==1) {
					count2++;
				}
			}
			if((count1+count2)==size &&count1==count2) {
				//count++;
				for(int j=i;j<i+size;j++) {
					System.out.print(a[j]+" ");
				}
				System.out.println();

			}
		}
	}
	}
	static void negative(int[] a) {
		int i=a.length-1,j=a.length-1;
		//int[] b=new int[a.length];
		while(i>=0) {
			if(a[i]==-1) {
				i--;
			}else {
				a[j]=a[i];
				j--;
				i--;
			}
		}
		while(j>=0) {
			a[j]=-1;
			j--;
		}
	}
	static void zeroEnds(int[] a) {
		int i=0,j=0;
		//int[] b=new int[a.length];
		while(i<a.length) {
			if(a[i]==0) {
				i++;
			}else {
				a[j]=a[i];
				j++;
				i++;
			}
		}
		while(j<a.length) {
			a[j]=0;
			j++;
		}
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
		}
		//rearrangeZeroOne(a);
		//negative(a);
		zeroEnds(a);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
