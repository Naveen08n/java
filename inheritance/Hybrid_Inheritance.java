class Grand{
	String color="Brown";
	void method() {
		System.out.println("Good Person");
	}
}
class Par extends Grand{
	
}
class chi1 extends Par{
	
}
class chi2 extends Par{
	
}

class chi3 extends Par{
	
}

public class Hybrid_Inheritance {

	public static void main(String[] args) {
		chi1 c1=new chi1();
		chi2 c2=new chi2();

		chi3 c3=new chi3();
		
		System.out.println(c1.color);
		c1.method();
		System.out.println(c2.color);
		c2.method();
		System.out.println(c3.color);
		c3.method();

		
	}

}
