import java.util.Scanner;

public class Palindrome {
	static boolean Pal(String str, int i, int j) {
		if(str.charAt(i) != str.charAt(j)) {
			return  false;
		}
		if(j<=i) {
			return true;
		}
		return Pal(str,i+1, j-1);
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		System.out.println(Pal(str,0,str.length()-1));
		


	}

}
