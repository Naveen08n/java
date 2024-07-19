import java.util.Scanner;

public class Print_Pair_Sum {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
	
		int[] arr= new int[n];

		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		int k=scan.nextInt();
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int res=arr[i]+ arr[j];
				if(res==k) {
					System.out.println(arr[i]+ " "+arr[j]);
				}
			}
		}

	}

}
