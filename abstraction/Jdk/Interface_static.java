package Jdk;
//we can call using interface name but not create object creation
//not inherited static methods in interface
interface SetAnimals2{
	default void eat() {
		System.out.println("eat food");
	}
	static void communicate() {
		 System.out.println("communicate");
	 }
	//non static methods can access static, but static methods cannot access non-static
	private static void jump() {
		System.out.println("jump low");
	}
}
class Dem implements SetAnimals2{
	@Override
	public void eat() {
		System.out.println("eat food");
	}
}
public class Interface_static {

	public static void main(String[] args) {
		Dem d=new Dem();
		d.eat();
		//SetAnimals2.communicate();
		//SetAnimals2.jump();
	}

}
