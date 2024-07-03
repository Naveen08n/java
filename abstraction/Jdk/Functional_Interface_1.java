package Jdk;
//functional interface only have one abstract method
//implements in inner class - secure
@FunctionalInterface
interface Demo{
	void disp1();
	//void disp2();
}
class Demo1 implements Demo{
	@Override
	public void disp1() {
		System.out.println("hello");
	}
}
public class Functional_Interface_1 {

	public static void main(String[] args) {
		Demo1 d=new	Demo1();
		d.disp1();
	}

}
