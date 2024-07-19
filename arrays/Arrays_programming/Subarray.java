package Arrays_programming;

import java.util.Scanner;

public class Subarray {
	static void sumOfSubArray(int[] a) {
		for(int size=1;size<=a.length;size++) {
			for(int i=0;i<=a.length-size;i++) {
				int sum=0;
				for(int j=i;j<i+size;j++) {
					sum=sum+a[j];
							//System.out.print(a[j]+" ");
				}
				System.out.println(sum);
			}
		}
	}
	static void sumEqualtoSubArray(int[] a,int k) {
		int count=0;
		for(int size=1;size<=a.length;size++) {
			for(int i=0;i<=a.length-size;i++) {
				int sum=0;
				for(int j=i;j<i+size;j++) {
					sum=sum+a[j];
							//System.out.print(a[j]+" ");
				}
				if(sum==k) {
					count++;
					
				}
			}
		}
		System.out.println(count);
	}
	static void sumEqualtoPrinttoSubArray(int[] a,int k) {

		for(int size=a.length;size>=1;size--) {
			for(int i=0;i<=a.length-size;i++) {
				int sum=0;
				for(int j=i;j<i+size;j++) {
					sum=sum+a[j];
							//System.out.print(a[j]+" ");
				}
				if(sum==k) {
					//count++;
					for(int j=i;j<i+size;j++) {
						System.out.print(a[j]+" ");
					}
					System.out.println();
	
				}
			}
		}
		//System.out.println(count);
	}
	
	static void subarray(int[] a) {
		System.out.println("individual arrays ");
		for(int size=1;size<=a.length;size++) {
			for(int i=0;i<=a.length-size;i++) {
				for(int j=i;j<i+size;j++) {
							System.out.print(a[j]+" ");
					}
				System.out.println();
				}
			}
		}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
		}
		int size=scan.nextInt();
		int i=0,j=0;
		for(i=0;i<=a.length-size;i++) {
			for(j=i;j<i+size;j++) {
						System.out.print(a[j]+" ");
				}
			System.out.println();
		}
		//subarray(a);
		//sumOfSubArray(a);
		//sumEqualtoSubArray(a,14);
		//sumEqualtoPrinttoSubArray(a,9);

	}

}


