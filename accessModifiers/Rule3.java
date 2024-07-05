class Animal{
	
}
class Tiger extends Animal{
	
}
class Lion extends Animal{
	 
}
class Father1{
	Animal fun() {
		System.out.println("hi");
		Animal a=new Animal();

		return a;
	}
}
//we want to change, we can change it. in overriden method return type to return type is inherited 
class Son1 extends Father1{
/*	@Override
	Tiger fun() {
		System.out.println("hello");
		Tiger t=new Tiger();
		return t;
		}
	*/
	@Override
	Lion fun() {
		System.out.println("hello");
		Lion l=new Lion();
		
		return l;

	}
}
public class Rule3 {

	public static void main(String[] args) {
	Son1 c=new Son1();
	c.fun();
	
	
	}

}
