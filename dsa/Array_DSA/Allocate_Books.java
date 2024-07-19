package Array_DSA;

import java.util.Scanner;

public class Allocate_Books {
	static boolean isPossibleSol(int[] ar, int b, int m) {
		int student=1,spc=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>m) {
				return false;
			}
			if(spc+ar[i]<=m) {
				spc=spc+ar[i];
			}else {
				student++;
				if(student > b) {
					return false;
				}
				spc=ar[i];
			}
		}
		
		return true;
		
	}
	static int maxpage(int[] ar, int b) {
		int l=ar[0],h=0,m=0;
		if(b > ar.length) {
			return -1;
		}
		for(int i=0;i<ar.length;i++) {
			if(ar[i]<l) {
				l=ar[i];
			}
			h=h+ar[i];
		}
		int res=-1;
		while(l<=h) {
			m=(l+h)/2;
			if(isPossibleSol(ar,b,m)==true) {
				res=m;
				h=m-1;
			}else {
				l=m+1;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int b=scan.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=scan.nextInt();
		}
		System.out.println(maxpage(ar,b));
		
		
	}

}
