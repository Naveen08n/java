package Jdk;

interface SetAnimals{
	void  eat();
	 void swim();
	default void communicate() {
		 System.out.println("communicate");
	 }
}
class Shark implements SetAnimals{
	@Override
	public void eat() {
		System.out.println("eat veg");
	}
	@Override
	public void swim() {
		System.out.println("fast");
	}
}
public class Interface_Default {

	public static void main(String[] args) {
		Shark s= new Shark();
		s.eat();
		s.swim();
		s.communicate();
	}

}
