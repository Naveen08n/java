import java.util.Scanner;

public class PrintAllPairs {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] arr= new int[n];

		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				System.out.println(arr[i]+ "  "+ arr[j]);
			}
		}

	}

}
