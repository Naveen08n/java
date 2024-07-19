package Array_DSA;

import java.util.Scanner;

public class Median_TA_Arrays {

	static int[] median(int[]a,int[] b) {
		int[] c=new int[a.length+b.length];
		/*for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++) {
			c[a.length+i]=b[i];
		}
		for(int i=0;i<c.length;i++) {
			return c;
		}
		return c;
		*/
		int i=0,j=0,k=0;
		while(a.length>i&&b.length>j) {
			if(a[i]<b[j]) {
				c[k]=a[i];
				i++;
				k++;
			}else {
				c[k]=b[j];
				k++;
				j++;
			}
		}
		while(b.length>j) {
				c[k]=b[j];
				j++;
				k++;
			
		}
		while(a.length>i) {
			c[k]=a[i];
			i++;
			k++;
			
		}
		return c;
	}
	
	static float medianValue(int[] c) {
		int mid=c.length/2;
		if(c.length%2==0) {
			return (float)(c[mid]+c[mid-1])/2;
		}else {
			return c[mid];
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
		}
		int m=scan.nextInt();
		int[] b=new int[m];
		for(int i=0;i<m;i++) {
			b[i]=scan.nextInt();
		}
		int c[]=median(a,b);
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
		System.out.println("\nMedian Value "+medianValue(c));
	}

}
