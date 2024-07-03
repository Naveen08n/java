class Parent11{
	void behave() {
		System.out.println("Parent behaviour is good");
	}
}
class Child11 extends Parent11{
	@Override
	void behave() {
		System.out.println("Child11 behaviour is avge");
	}

	void study() {
		System.out.println("3st rank in studies");
	}
}
class Child12 extends Parent11{
	@Override
	void behave() {
		System.out.println("Child12 behaviour is medium");
	}

	void study() {
		System.out.println("2st rank in studies");
	}
}
class Child13 extends Parent11{
	@Override
	void behave() {
		System.out.println("Child13 behaviour is very good");
	}
	void study() {
		System.out.println("1st rank in studies");
	}
}
class Family{
	void find(Parent11 ref) {
		ref.behave();
	}
}
public class Code_Flexible {

	public static void main(String[] args) {

		Child11 c1=new Child11();
		Child12 c2=new Child12();
		Child13 c3=new Child13();
		Family f=new Family();
		
		f.find(c1);
		f.find(c2);
		f.find(c3);
		
		
	/*	Parent11 ref;
	
		ref=c1;
		ref.behave();
		((Child11)(ref)).study();
		
		ref=c2;
		ref.behave();
		((Child12)(ref)).study();
		
		ref=c3;
		ref.behave();
		((Child13)(ref)).study();
	 */
		
	}

}
