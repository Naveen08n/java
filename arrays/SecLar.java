import java.util.Scanner;

public class SecLar {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] arr= new int[n];

		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		SecondLar(arr);

	}

	private static void SecondLar(int[] arr) {
		int lar=0,sec=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>lar) {
				sec=lar;
				lar=arr[i];
			}else if(arr[i]>sec && arr[i]!=lar) {
				sec=arr[i];
			}
		}
		System.out.println(sec);

		
	}

}
