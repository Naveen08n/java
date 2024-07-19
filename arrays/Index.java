import java.util.Scanner;

public class Index {

	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] arr= new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		int k=scan.nextInt();
		int Index = -1;

		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==k) {
				Index=i;
			}
		}
		
				System.out.println(Index);


	}

}
