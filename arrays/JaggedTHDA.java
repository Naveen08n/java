import java.util.Scanner;

public class JaggedTHDA {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int i,j,k;
		
		int[][][] a=new int[3][][];
		a[0]=new int[2][];
		a[1]=new int[3][];
		a[2]=new int[2][];
		
		a[0][0]=new int[3];
		a[0][1]=new int[2];
		
		a[1][0]=new int[2];
		a[1][1]=new int[1];
		a[1][2]=new int[2];
		
		a[2][0]=new int[4];
		a[2][1]=new int[2];
		
		for(i=0;i<a.length;i++) {
			for(j=0;j<a[i].length;j++) {
				for(k=0;k<a[i][j].length;k++) {
					System.out.println("school "+i +" class "+j+" student "+k);
					a[i][j][k]=scan.nextInt();
				}
			}
		}
		
		System.out.println("Ages Are ");
		
		for(i=0;i<a.length;i++) {
			for(j=0;j<a[i].length;j++) {
				for(k=0;k<a[i][j].length;k++) {
					System.out.print(a[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		

	}

}
