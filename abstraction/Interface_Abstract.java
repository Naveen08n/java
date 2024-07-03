import java.util.Scanner;

interface Calculate{
	void add();
	void sub();
	//static methods are not inherited in interface
	static void mul() {
		System.out.println("hello");
	}
}
class Calculate1 implements Calculate{
	@Override
	public void add(){
		System.out.println("add "+(10+20));
	}
	@Override
	public void sub(){
		System.out.println("sub "+(10-20));
	}
}
class Calculate2 implements Calculate{
	int a=10,b=20;
	@Override
	public void add(){
		int c=a+b;
		System.out.println("add "+ c);
	}
	@Override
	public void sub(){
		int c=a-b;
		System.out.println("sub "+c);
	}
}
class Calculate3 implements Calculate{
	int c;
	@Override
	public void add(){
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		c=a+b;
		System.out.println("add "+c);
	}
	@Override
	public void sub(){
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		c=a-b;
		System.out.println("sub "+c);
	}
}
public class Interface_Abstract {

	public static void main(String[] args) {
		Calculate1 c1=new Calculate1();
		Calculate2 c2=new Calculate2();
		Calculate3 c3=new Calculate3();
		
		
		c1.add();
		c1.sub();
		System.out.println("------------------------");
		c2.add();
		c2.sub();
		System.out.println("-----------------------");
		c3.add();
		c3.sub();
	}

}
