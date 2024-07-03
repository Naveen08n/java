  //Abstract method, who having only  method signature don't have body called A-M
abstract class Par1{   //incomplete class
	//abstract void par1();
	abstract void par();
	 static void par1() {
		 System.out.println("good");
	 }
}
class  Child1 extends Par1{
	@Override
	void par() {
		System.out.println("very");
	}
	
}
public class Abstrction_Demo {

	public static void main(String[] args) {
		Child1 c=new Child1();
		c.par();
		c.par1();
	}

}
