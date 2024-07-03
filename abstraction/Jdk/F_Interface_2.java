package Jdk;
//functional interface only have one abstract method
//implements in inner class
@FunctionalInterface
interface Demo11{
	void disp1();
	//void disp2();
}

public class F_Interface_2 {

	public static void main(String[] args) {
		class Demo1 implements Demo11{
			@Override
			public void disp1() {
				System.out.println("hello");
			}
		}
		Demo1 d=new	Demo1();
		d.disp1();
	}

}
