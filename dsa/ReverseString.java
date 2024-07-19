import java.util.Scanner;

public class ReverseString {
	static String RevStr(String str,String r,int i) {
		if(i<0) {
			return r;
		}
		
		
		return RevStr(str,r+str.charAt(i),i-1);
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		System.out.println(RevStr(str,"",str.length()-1));



	}

}
