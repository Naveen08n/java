//constructor call at abstract class ? yes,using constructor chaining

abstract class Pare1{
	Pare1(){
		this(1);
		System.out.println("parent person");
	}
	Pare1(int a){
		System.out.println("paramers");
	}
}
class Chil extends Pare1{
	Chil(){
		System.out.println("Child person ");
	}
}
public class Constructor_Abstractor {

	public static void main(String[] args) {
		Chil c=new Chil();
	}

}
