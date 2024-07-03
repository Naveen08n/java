
interface Calculate111{
	void add();
	void sub();
}
class  Calculate33{
	public  void div() {
		System.out.println();
	}
	public void mul() {
		System.out.println();
	}
}
 class MyCal extends Calculate33 implements Calculate111{
	@Override
	public void add() {
		
	}
	@Override
	public void sub() {
		
	}
	}
public class Interface_Multiple_2 {

	public static void main(String[] args) {
		MyCal m=new MyCal();
		m.add();
		m.sub();
		m.mul();
		m.div();

	}

}
