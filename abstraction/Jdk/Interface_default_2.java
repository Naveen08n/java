package Jdk;

interface SetAnimals1{
	default void  eat() {
		
	}
	 default void swim() {
		 
	 }
	default void communicate() {
		 System.out.println("communicate");
	 }
}
class Shark1 implements SetAnimals1{
	@Override
	public void eat() {
		System.out.println("eat veg");
	}
	@Override
	public void swim() {
		System.out.println("fast");
	}
}
public class Interface_default_2{

	public static void main(String[] args) {
		Shark1 s= new Shark1();
		s.eat();
		s.swim();
		s.communicate();
	}

}
