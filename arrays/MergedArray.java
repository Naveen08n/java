import java.util.Scanner;

public class MergedArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		
		int[] arr1=new int[n];
		int[] arr2= new int[m];
		
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=scan.nextInt();
		}
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=scan.nextInt();
			
		}
		int[] c=new int[arr1.length+arr2.length];
		//int len=arr1.length+arr2.length;
		
		
		
		for(int i=0;i<arr1.length;i++) {
			c[i]=arr1[i];	 
			}
		for(int i=0;i<arr2.length;i++) {
			c[arr1.length+i]=arr2[i];
		}
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+ " ");
		}
		for(int i=0;i<c.length;i++) {
			for(int j=i+1;j<c.length;j++) {
				int temp=0;
				if(c[i]>c[j]) {
					temp=c[i];
					c[i]=c[j];
					c[j]=temp;
					
				}
			}
		}
		System.out.println();
			for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+ " ");
			}
		

	}
}
