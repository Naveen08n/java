abstract class Pare{
	abstract void parent();
}
class Chil1 extends Pare{
	@Override
	void parent() {
		System.out.println("child parent");
	}
}
public class Final_Abstract {

	public static void main(String[] args) {
		Chil1 c=new Chil1();
		c.parent();
		//c.parent1();
	}

}
