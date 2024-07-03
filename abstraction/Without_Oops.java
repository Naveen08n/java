import java.util.Scanner;

class Square{
	static int side;
	static int area;
	
	void acceptableInput() {
		Scanner scan=new Scanner(System.in);
		side=scan.nextInt();
	}
	void calculate() {
		area=side*side;
	}
	void display() {
		System.out.println("Square "+area);
	}
}
class Rectangle{
	static float length;
	static float breadth;
	static float area;
	
	void acceptableInput() {
		Scanner scan=new Scanner(System.in);
		length=scan.nextFloat();
		breadth=scan.nextFloat();
	}
	void calculate() {
		area=length*breadth;
	}
	void display() {
		System.out.println("Recatangle "+area);
	}	
}
class Circle{
	static float radius;
	static double area;
	
	void acceptableInput() {
		Scanner scan=new Scanner(System.in);
		radius=scan.nextFloat();
	}
	void calculate() {
		area=3.14*radius*radius;
	}
	void display() {
		System.out.println("circle "+area);
	}	
}
public class Without_Oops {

	public static void main(String[] args) {
		Square s=new Square();
		Rectangle r=new Rectangle();
		Circle c=new Circle();
		
		s.acceptableInput();
		s.calculate();
		s.display();
		System.out.println("------------------------------");
		
		r.acceptableInput();
		r.calculate();
		r.display();
		System.out.println("-----------------------------");
		
		c.acceptableInput();
		c.calculate();
		c.display();
		
	}

}
