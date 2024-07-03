class Animal11{
	void cry() {
		System.out.println("Animals are crying at sometime");
	}
	void sodd() {
		
	}
}
class Cat11 extends Animal11{
	@Override
	void cry() {
		System.out.println("Cats are crying with low sound");
	}
	void behave() {
		System.out.println("Good behave at home");
	}
}
class Rat11 extends Animal11{
	@Override
	void cry() {
		System.out.println("rat are crying with medium sound");
	}
	void run() {
		System.out.println("rats are good at running");
	}
}
class Dog11 extends Animal11{
	@Override
	void cry() {
		System.out.println("Dogs are crying with high sound");
	}
	void live() {
		System.out.println("Dogs are live long time");
	}
}

class Pets{
	void house(Animal11 ref) {
		ref.cry();
	}
}
public class Animals_Code_flexible {

	public static void main(String[] args) {
		Animal11 a=new Animal11();
		Cat11 c=new Cat11();
		Rat11 r=new Rat11();
		Dog11 d=new Dog11();
	/*	Animal11 ref;
		
		ref=c;
		ref.cry();
		((Cat11)(ref)).behave();

		
		ref=r;
		ref.cry();
		((Rat11)(ref)).run();
		
		ref=d;
		ref.cry();
		((Dog11)(ref)).live();
	*/
		Pets p=new Pets();
		p.house(a);
		
		p.house(c);
		p.house(r);
		p.house(d);
		
	}

}
