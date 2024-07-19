import java.util.Scanner;

public class TDA {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] a = new int[2][5];
		
		int i,j;
		
		for(i=0; i<2; i++) {
			for(j=0; j<5; j++) {
				System.out.println("class "+i +" student "+ j );
				a[i][j]= scan.nextInt(); 
			}
		}
		
		System.out.println("Ages Are ");
		
		for(i=0;i<2;i++) {
			for(j=0;j<5;j++) {
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
