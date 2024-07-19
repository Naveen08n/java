package Arrays_programming;

import java.util.Scanner;
class Sort{
	int[] sorted(int[] a,int[] b, int[] c) {
		int[] d=new int[a.length+b.length+c.length];
		int i=0,j=0,k=0,p=0;
		/*
		 * while(i<a.length&&j<b.length&&k<c.length) { d[p++]=a[i++]; d[p++]=b[j++];
		 * d[p++]=c[k++]; } while(j<b.length && k<c.length) { d[p++]=b[j++];
		 * d[p++]=c[k++]; } while(k<c.length) { d[p++]=c[k++]; } return d;
		 */	
		while(k<d.length) {
			if(i<a.length) {
			d[k++]=a[i];
			}
			if(i<b.length) {
			d[k++]=b[i];
			}
			if(i<c.length) {
			d[k++]=c[i];
			}
			i++;
		}
		
		return d;

	
	
	
	
	}
}
public class ThreeArrays {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Sort s=new Sort();
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
		int p=scan.nextInt();
		int[] c=new int[p];
		for(int i=0;i<p;i++) {
			c[i]=scan.nextInt();
		}
		int[] d=s.sorted(a, b, c);
		for( p=0;p<d.length;p++) {
			System.out.print(d[p]+" ");
		}

	}

}
