package Array_DSA;

import java.util.Scanner;

public class Minimun_Bouquets {
	static boolean isPossbleSol(int[] ar, int boq,int m,int f) {
		int adj=0,bc=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]<=m) {
				adj++;
				if(adj==f) {
					bc++;
					if(bc==boq) {
						return true;
					}
					adj=0;
				}
			}else {
				adj=0;
			}
		}
		return false;
		
	}
	static int minimum_bouquets(int[] ar, int boq,int f) {
		int l=ar[0],h=0,m=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i] < l) {
				l=ar[i];
			}
			if(ar[i] > h) {
				h=ar[i];
			}
		}
		int res=0;
		while(l <= h) {
			m=(l+h)/2;
			if(isPossbleSol(ar,boq,m,f)==true) {
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
		int boq=scan.nextInt();
		int f=scan.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=scan.nextInt();
		}
		System.out.println(minimum_bouquets(ar,boq,f));

	}

}
