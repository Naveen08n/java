class Parent{
	String color="Brown";
	void method() {
		System.out.println("Good Person");
	}
}
class Child extends Parent{
	
}
public class Singleinheritance {

	public static void main(String[] args) {
		Child c=new Child();
		System.out.println(c.color);
		c.method();
	}

}
