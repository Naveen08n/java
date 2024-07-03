//One interface is does not implements other interfaces
//One interface is extends others interfaces
interface Step1{
	public void add();
}
interface Step2 extends Step1{
	public void sub();
}

class Calcul implements Step2{
	@Override
	public void add() {
		
	}
	@Override
	public void sub() {
		
	}
}
public class Interface_Imple_extends {

	public static void main(String[] args) {
		Calcul c=new Calcul();
		c.add();
		c.sub();
	}

}
