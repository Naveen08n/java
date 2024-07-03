package Jdk;
//functional interface only have one abstract method
//no class name like anonymous- garbage class -- more secure
@FunctionalInterface
interface Demo121{
	void disp1();
	//void disp2();
}

public class F_Interface_Anonymous_3 {

	public static void main(String[] args) {
		Demo121 d=new Demo121(){
			@Override
			public void disp1() {
				System.out.println("hello");
			}
		};
		d.disp1();
	}

}
