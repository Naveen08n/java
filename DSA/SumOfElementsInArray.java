import java.util.Scanner;

public class SumOfElementsInArray {
	static int SEA(int[] arr,int i) {
		if(i==arr.length) {
			return 0;
		}
		
		return SEA(arr,i+1)+arr[i];
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		
		System.out.println(SEA(arr,0));


	}

}
