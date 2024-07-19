import java.util.Scanner;

public class SmaSec {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] arr= new int[n];

		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}

		int smal=Integer.MAX_VALUE,Sec_Saml=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<smal) {
				Sec_Saml=smal;
				smal=arr[i];
			}else if(arr[i]< Sec_Saml && arr[i]!=smal) {
				Sec_Saml=arr[i];
			}
		}
				System.out.println(Sec_Saml+smal);
		
		}

}
