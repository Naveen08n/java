import java.util.Scanner;

public class WalkingaRow {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		int[] arr=new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		
		int k=scan.nextInt();
		
		int res=WalkedRow(arr,k);
		System.out.println(res);

	}

	private static int WalkedRow(int[] arr, int k) {
		int width=0,sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<=k) {
				width++;
				//sum +=width;
			}else {
			width +=2;
						}
		}
		return width;
		
	}

}
