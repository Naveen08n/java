import java.util.Scanner;
class A{
	public void alpha() {
	System.out.println("conncetion established");
	//try {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter numerator");
	int a=scan.nextInt();
	System.out.println("enter denamirator");
	int b=scan.nextInt();
	int c=a/b; 
	System.out.println(c);
	/*}catch(Exception e) {
		System.out.println("non-zero denamirator");
	}*/
	System.out.println("connection terminated");
	}
}
class B{
	void beta() {
		System.out.println("conncetion established");
	//	try {
		A a=new A();
		a.alpha();
		/*}catch(Exception e) {
			System.out.println("non-zero denamirator");
		}*/ 
		System.out.println("connection terminated");
	}
}
class C {
	void gamma() {
		System.out.println("conncetion established");
		//try {
		B b=new B();
		b.beta();
		/*}catch(Exception e) {
			System.out.println("non-zero denamirator");
		}*/
		System.out.println("connection terminated");
	}
}

public class Exception_Object_propagation {

	public static void main(String[] args) {
		System.out.println("conncetion established");
		try {
		C c=new C();
		c.gamma();
		}catch(Exception e) {
			System.out.println("non-zero denamirator");
		}
		System.out.println("connection terminated");
		

	}

}
