package Array_DSA;

import java.util.Scanner;

public class Check_sorted_array {
	/*
	static int[] check_sorted_array(int[] ar) {
		for(int i=1;i<ar.length;i++) {
			if(ar[i] < ar[i-1]) {
				break;
			}
		}
		return ar;
	}
	*/
	static boolean check_sorted_array(int[] ar) {
		for(int i=1;i<ar.length;i++) {
			if(ar[i] < ar[i-1]) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=scan.nextInt();
		}
		/*
		int[] arr=check_sorted_array(ar);
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}*/
		System.out.println(check_sorted_array(ar));
	}

}
