class Parent1{
	 void fun() {
		System.out.println("Hi");
	}
	
}
//cannot reduce the visibility of the  inherited method from base
class Child1 extends Parent1{
	//@Override
	 protected void fun() {    
		System.out.println("Hello");
	}
	
}
/* public
 * protected   
 * default
 * private
 */

public class Rule1 {

	public static void main(String[] args) {
		Child1  c=new Child1();
		c.fun();

	}

}
