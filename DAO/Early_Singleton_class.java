class Dog{
	static Dog d=new Dog();
	private Dog() {
		
	}
	static Dog getInstance() {
		
		return d;
	}
}
public class Early_Singleton_class {

	public static void main(String[] args) {
		Dog d1=Dog.getInstance();
		System.out.println(d1);
		Dog d2=Dog.getInstance();
		System.out.println(d2);
		Dog d3=Dog.getInstance();
		System.out.println(d3);
	}

}
