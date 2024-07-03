package Jdk;
//lambda-expressions
/*
type ref=(int a)->{ };
type ref=( a)->{ };       work all
type ref=a->{ };
*/
interface Demo12{
	void disp1(int a);
	//void disp2();
}


public class F_Lambda_Expression_4 {

	public static void main(String[] args) {
		Demo12 d= (int a ) ->{ System.out.println("hello "+a);
		};
		d.disp1(10);
	}

}
