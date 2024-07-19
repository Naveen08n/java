package Arrays_programming;

import java.util.Scanner;

public class Remove_space_to_One {

	static String trim(String s) {
		int si=0,ei=-1;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				si=i;
				break;
			}
		}
		for(int i=s.length()-1;i>=0;i--) {
			if(s.charAt(i)!=' ') {
				ei=i;
				break;
			}
		}
		String t="";
		for(int i=si;i<=ei;i++) {
			if((s.charAt(i)!=' ')||(s.charAt(i)==' '&& s.charAt(i+1)!=' ')) {
				t=t+s.charAt(i);
			}
		}
		return t;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		
		String res=trim(s);
		System.out.println(res);

	}

}
