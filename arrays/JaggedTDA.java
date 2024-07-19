import java.util.Scanner;

public class JaggedTDA {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//int n= scan.nextInt();
		int[][] a=new int[2][];
		
		a[0]=new int[2];
		a[1]=new int[5];
		//a[2]=new int[3];
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.println("class "+i +" school " + j);
				a[i][j]=scan.nextInt();
			}
		}
		System.out.println("Ages Are ");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
		
		
	}

}
