interface  Method1{
	public void add();
	public void sub();
}
interface Method2{//In interface multiple interface is working ,class does not exits extends Object class
	public void mul(); //No diamond shape.
	public void div();
}
class Method3 implements Method1 , Method2{
	@Override
	public void add() {
		
	}
	@Override
	public void sub() {
		
	}
	@Override
	public void mul() {
		
	}
	@Override
	public void div() {
		
	}
}
public class Interface_Multiple {

	public static void main(String[] args) {
		Method3 m=new Method3();
		m.add();
		m.sub();
		m.mul();
		m.div();
		
	}

}
