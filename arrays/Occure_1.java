import java.util.Scanner;

public class Occure_1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					int temp=0;
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();

		int count=1;
		for(int i=0;i<n-1;i++) {
				//int count=1;
				if(arr[i]==arr[i+1]) {
					count++;	
				}else {
					System.out.println(arr[i]+ " "+count);
					count=1;
				}
			
		}
		System.out.println(arr[arr.length-1]+ " "+count);
	}

}
