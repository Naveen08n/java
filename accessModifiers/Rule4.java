class Father2{
	public void fun() {
		System.out.println("hi");
	}
}
//In Overridden method no of parameters must be matched, could not match get errors.
class Son2 extends Father2{
	//@Override
	public void fun(int a, int b) {
		System.out.println("Bye");
		
	}
}
public class Rule4 {

	public static void main(String[] args) {
		Son2 s=new Son2();
		s.fun();

	}

}
