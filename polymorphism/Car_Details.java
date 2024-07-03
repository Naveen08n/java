class Car1{
	void speed() {
		System.out.println("car was going slowly");
	}
}
class Audi extends Car1{
	@Override
	void speed() {
		System.out.println("Audi was high speed");
	}
	void mileage() {
		System.out.println("Audi gave medium km for diesel ");
	}
}
class Benz extends Car1{
	@Override
	void speed() {
		System.out.println("Benz was very heavy speed");
	}
	void mileage() {
		System.out.println("Benz gave less km for diesel ");
	}
}
class Maruthi extends Car1{
	@Override
	void speed() {
		System.out.println("Maruthi was medium speed");
	}
	//Specialize
	void mileage() {
		System.out.println("Maruthi gave more km for diesel ");
	}
}
public class Car_Details {

	public static void main(String[] args) {
		Car1 c;
		Audi a=new Audi();
		Benz b=new Benz();
		Maruthi m=new Maruthi();
		
		c=a;
		c.speed();
		((Audi)(c)).mileage();
		
		c=b;
		c.speed();
		((Benz)(c)).mileage();
		
		c=m;
		c.speed();
		((Maruthi)(c)).mileage();
		

	}

}
