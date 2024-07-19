class Dog1{
	static Dog1 d;
	private Dog1(){
		
	}
	static Dog1 getInstance(){
		if(d==null) {
			d=new Dog1();
		}
		return d;
	}
}
public class Late_Singleton_class {

	public static void main(String[] args) {
		Dog1 d1=Dog1.getInstance();
		System.out.println(d1);
		Dog1 d2=Dog1.getInstance();
		System.out.println(d2);
		Dog1 d3=Dog1.getInstance();
		System.out.println(d3);
	}

}
