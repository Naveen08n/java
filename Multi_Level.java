class GrandParent{
	String color="Brown";
	void method() {
		System.out.println("Good Person");
	}

}
class Parent2 extends GrandParent{
	
}
class child1 extends Parent2{
	
}
public class Multi_Level {

	public static void main(String[] args) {
		child1 c=new child1();
		System.out.println(c.color);
		c.method();
		

	}

}
