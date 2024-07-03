interface Cal{
	public void add();
	public void sub();
}
class Mycal1 implements Cal{
	@Override
	public void add() {
		System.out.println("add of Mycal1");
	}
	public void sub(){
		System.out.println("sub of mycal1");
	}
}
class Mycal2 implements Cal{
	@Override
	public void add() {
		System.out.println("add of Mycal2");
	}
	public void sub(){
		System.out.println("sub of mycal2");
	}
	public void mul() {
		System.out.println("mul of mycal2");
	}
}

class Casio{
	void calculate(Cal ref) {
		ref.add();
		ref.sub();
	}
}

public class Interface_Polymorphism  {

	public static void main(String[] args) {
		Mycal1 c1=new Mycal1();
		Mycal2 c2=new Mycal2();
		Cal ref;
		
		ref=c1;
		ref.add();
		ref.sub();
		
		ref=c2;
		ref.add();
		ref.sub();
		((Mycal2)(ref)).mul();
		
		/*
		Casio c=new Casio();
		c.calculate(c1);
		c.calculate(c2);
		*/

	}

}



