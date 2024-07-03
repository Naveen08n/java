class Outer{
	static {
		System.out.println("hello");
	}
	static class Inner1{
		static {
			System.out.println("hi ");
		}

			 void shiva() {
				System.out.println("world");
		}
	}
}
public class Inner_calss {

	public static void main(String[] args) {
		Outer.Inner1 ref = new Outer.Inner1();
		ref.shiva();
		
	}

}
