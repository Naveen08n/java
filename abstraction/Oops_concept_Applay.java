import java.util.Scanner;
abstract class Dimensions{
	private float area;
	
	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}
	abstract void acceptableInput();
	abstract void calculate();
	void display() {
		System.out.println("Dimensions ");
	}
}
class Squares extends Dimensions{
	 int side;
	@Override
	void acceptableInput() {
		Scanner scan=new Scanner(System.in);
		side=scan.nextInt();
	}
	@Override
	void calculate() {
		setArea(side*side);
	}
	@Override
	void display() {
		System.out.println("Square "+getArea());
	}
	void dis() {
		System.out.println("Square");
	}
}
class Rectangles extends Dimensions{
	static float length;
	static float breadth;

	@Override
	void acceptableInput() {
		Scanner scan=new Scanner(System.in);
		length=scan.nextFloat();
		breadth=scan.nextFloat();
	}
	@Override
	
	void calculate() {
		setArea(length*breadth);
	}
	@Override
	void display() {
		System.out.println("Recatangle "+getArea());
	}	
	void dis() {
		System.out.println("Rectangle");
	}
}
class Circles extends Dimensions{
	float radius;
	@Override
	void acceptableInput() {
		Scanner scan=new Scanner(System.in);
		radius=scan.nextFloat();
	}
	@Override
	void calculate() {
		setArea((float) (3.14*radius*radius));
	}
	@Override
	void display() {
		System.out.println("circle "+getArea());
	}
	void dis() {
		System.out.println("Circles");
	}
}
class Dimen{
	void result(Dimensions ref) {
		ref.acceptableInput();
		ref.calculate();
		ref.display();
	}
}
public class Oops_concept_Applay {

	public static void main(String[] args) {
		Squares s=new Squares();
		Rectangles r=new Rectangles();
		Circles c=new Circles();
		/*
		s.acceptableInput();
		s.calculate();
		s.display();
		
		r.acceptableInput();
		r.calculate();
		r.display();
		
		c.acceptableInput();
		c.calculate();
		c.display();
	*/
		
	/*	Dimensions ref;
		ref=s;
		ref.acceptableInput();
		ref.calculate();
		ref.display();
		((Squares)(ref)).dis(); //specificial method
		
		ref=r;
		ref.acceptableInput();
		ref.calculate();
		((Rectangles)(ref)).dis();
		
		ref=c;
		ref.acceptableInput();
		ref.calculate();
		ref.display();
		((Circles)(ref)).dis();
		
		*/
		Dimen d=new Dimen();
		d.result(s);
		d.result(r);
		d.result(c);
	}

}
