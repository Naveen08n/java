import java.util.Scanner;

public class Min_Max_Sum {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] arr= new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		int sum=sum(arr);
		int max=lar(arr);
		int min=smal(arr);
		System.out.println("Minimum Value "+ (sum-max));
		System.out.println("Maxmum Value "+ (sum-min));

	}
	
	static int sum(int[] arr) {
		int sum=0;
		//int max=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			sum +=arr[i];
		}
		return sum;
	}

	
	static int lar(int[] arr) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	static int smal(int[] arr) {
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
	}


}
