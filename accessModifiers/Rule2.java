class Father{
	public void fun() {
		System.out.println("hi");
	}
}
//we cannot change primitive return type
class Son extends Father{
	public void fun() {
		System.out.println("hello");
	}
}
public class Rule2 {

	public static void main(String[] args) {
	Son c=new Son();
	c.fun();
	
	
	}

}
