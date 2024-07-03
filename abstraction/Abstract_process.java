abstract class Birds{
	abstract void eat();
	abstract void fly();
	
}
abstract class Eagle extends Birds{
	@Override
	void fly() {
		System.out.println("eagle was fly");
	}
}
class SignenEagle extends Eagle{
	@Override
	void eat() {
		System.out.println("SignenEagles are eat snacks");
	}
}
class HavenEagle extends Eagle{
	@Override
	void eat() {
		System.out.println("havenEagles are eat rices");
	}
}
class BirdsFamily{
	void live(Birds ref) {
		ref.eat();
		ref.fly();
	}
}
public class Abstract_process {

	public static void main(String[] args) {
		HavenEagle h=new HavenEagle();
		SignenEagle s=new SignenEagle();
	/*	h.eat();
		h.fly();
		s.eat();
		s.fly();
	*/
		Birds ref;
		ref=h;
		ref.eat();
		ref.fly();
		
		ref=s;
		ref.eat();
		ref.fly();
		/*
		BirdsFamily b=new BirdsFamily();
		b.live(h);
		b.live(s);
		*/
	}

}
