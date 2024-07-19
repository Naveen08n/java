package Arrays_programming;

import java.util.Scanner;

public class Banana_String {
	static String bananA(String s) {
		String t="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!='a') {
				t=t+s.charAt(i);
				//System.out.print(s.charAt(i));
			}else {
				t=t+"*"+s.charAt(i);
				//System.out.print("*"+s.charAt(i));
			}
		}
		return t;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		String res=bananA(s);
		System.out.println(res);
	}

}
