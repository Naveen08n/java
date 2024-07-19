package Array_DSA;

import java.util.Scanner;

public class Painter_Paritions {
	static boolean isPossibleSol(int[] ar, int b,int m) {
		int painter=1,pbc=0;
		for(int i=0;i<ar.length;i++){
			if(b > ar.length) {
				return false;
			}
			if(pbc+ar[i] <= m) {
				pbc=pbc+ar[i];
			}
			else {
				painter++;
				if(painter > b) {
					return false;
				}
				pbc=ar[i];
			}
		}
		return true;
		
	}
	static int maxpage(int[] ar, int b) {
		int l=ar[0],h=0,m=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i] < l) {
				l=ar[i];
			}
			h=h+ar[i];
		}
		int res=0;
		while(l <= h) {
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
