import java.io.Serializable;

interface Calculate11{
	//void add();
	int COUNT=3;
}
interface Calculate22{
	//void add();
	int COUNT=2;
}
class Mycalculate implements Calculate11,Calculate22{
	//@Override
	public void add() {
		//COUNT=6; 
		System.out.println(Calculate11.COUNT);
	}
	
}
public class Interface_Rule {

	public static void main(String[] args) {
		Mycalculate mc=new Mycalculate();
		//Serializable
		mc.add();

	}

}
