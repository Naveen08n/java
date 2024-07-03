interface Demo{
	int a=10;
	void disp();
}
class Demo1 implements Demo{
	@Override
	public void disp() {
		System.out.println("hello");
	}
}
public class Interface_variable {

	public static void main(String[] args) {
		Demo1 d=new Demo1();
		d.disp();
		System.out.println(d.a);
	}

}
