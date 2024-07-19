import java.util.Scanner;

public class ThreeDA {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][][] a= new int[2][3][5];
		
		int i,j,k;
		
		for(i=0;i<2;i++) {
			for(j=0;j<3;j++) {
				for(k=0;k<5;k++) {
					System.out.println("school "+i +" class "+j +"students "+k);
					a[i][j][k] = scan.nextInt();	
				}
			}
		}
		
		System.out.println("Ages Are ");
		
		for(i=0;i<2;i++) {
			for(j=0;j<3;j++) {
				for(k=0;k<5;k++) {
					System.out.print(a[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		
	}

}
