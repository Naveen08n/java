interface Demo123{
	static  void ProffesionalLife() {
		redundantcode();
	}
	static void PersonalLife() {
		redundantcode();
	}
	private static void redundantcode() {// used static(8.0) anyone access out side class, used private(9.0) who cann't 
										//inherit remove duplicates code
		System.out.println("redundantcode code");
	}
}
class redundant implements Demo123{
	
}
public class RedundantCode {

	public static void main(String[] args) {
		redundant d=new redundant();
		Demo123.ProffesionalLife();
		Demo123.PersonalLife();
		//Demo.redundantcode();
		
	}

}
