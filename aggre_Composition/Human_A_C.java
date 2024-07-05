class Bike{
	private String brand;
	private float voltage;
	public Bike(String brand, float voltage) {
		super();
		this.brand = brand;
		this.voltage = voltage;
	}
	public String getBrand() {
		return brand;
	}
	public float getVoltage() {
		return voltage;
	}
}

class Book{
	private String name;
	private String author;
	public Book(String name, String author) {
		super();
		this.name = name;
		this.author = author;
	}
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}
}

class Heart{
	private int bs;
	private int weight;
	public Heart(int bs, int weight) {
		super();
		this.bs = bs;
		this.weight = weight;
	}
	public int getBs() {
		return bs;
	}
	public int getWeight() {
		return weight;
	}
}

class Mind{
	private String color;
	private int weight;
	public Mind(String color, int weight) {
		super();
		this.color = color;
		this.weight = weight;
	}
	public String getColor() {
		return color;
	}
	public int getWeight() {
		return weight;
	}	
}
class Human{
	Heart h=new Heart(72, 250);
	Mind m=new Mind("grey",1400);
	void hasA(Bike b) {
		System.out.println(b.getBrand());
		System.out.println(b.getVoltage());
	}
	void hasB(Book b1) {
		System.out.println(b1.getName());
		System.out.println(b1.getAuthor());
	}
	
}


public class Human_A_C {

	public static void main(String[] args) {
		Bike b=new Bike("ktm",44.5f);
		Book b1=new Book("Jivitham","Pradeep");
		
		Human H=new Human();
		System.out.println(H.h.getBs());
		System.out.println(H.h.getWeight());
		System.out.println(H.m.getColor());
		System.out.println(H.m.getWeight());
		
		H.hasA(b);
		H.hasB(b1);
		
		
		
		
	}

}
