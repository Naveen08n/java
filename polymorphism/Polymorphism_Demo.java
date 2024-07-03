class Plane01{
	void fly() {
		System.out.println("Plane is flying");
	}
}
class CargoP extends Plane01{
	@Override
	void fly() {
		System.out.println("CargoPlane is flying");
	}
	void speed() {
		System.out.println("CargoPlane speed is low");
	}
}
class PassengerP extends Plane01{
	@Override
	void fly() {
		System.out.println("passengerPlane is flying");
	}
	void speed() {
		System.out.println("PassengerPlane speed is medium");
	}
}
class FighterP extends Plane01{
	@Override
	void fly() {
		System.out.println("FighterPlane is flying");
	}
	void speed() {
		System.out.println("FighterPlane speed is high");
	}
}
public class Polymorphism_Demo {

	public static void main(String[] args) {
		Plane01 p;
		CargoP cp=new CargoP();
		PassengerP pp=new PassengerP();
		FighterP fp=new FighterP();
		
		p=cp;
		p.fly();
		((CargoP)(p)).speed(); //Downtypecasting
		
		p=pp;
		p.fly();
		((PassengerP)(p)).speed();
		
		p=fp;
		p.fly();
		((FighterP)(p)).speed();
	}

}
