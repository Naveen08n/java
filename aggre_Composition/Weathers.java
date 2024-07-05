//Aggregation_composition
class Clouds{
	private int speed;
	private String color;
	public Clouds(int speed, String color) {
		super();
		this.speed = speed;
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public String getColor() {
		return color;
	}
}
class Sun{
	private String colors;
	private String climate;
	public Sun(String colors, String climate) {
		super();
		this.colors = colors;
		this.climate = climate;
	}
	public String getColors() {
		return colors;
	}
	public String getClimate() {
		return climate;
	}
}
class Moon{
	private String climate;
	private String colr;
	public Moon(String climate, String colr) {
		super();
		this.climate = climate;
		this.colr = colr;
	}
	public String getClimate() {
		return climate;
	}
	public String getColr() {
		return colr;
	}
}
class Sky{
	Clouds c=new Clouds(75,"brown");
	void hasA(Sun s) {
		System.out.println("Sun details ---");
		System.out.println(s.getClimate());
		System.out.println(s.getColors());
	}
	void HasA(Moon m) {
		System.out.println("Moon details ---");
		System.out.println(m.getColr());
		System.out.println(m.getClimate());
	}
	
}
public class Weathers {

	public static void main(String[] args) {
		Sun s=new Sun("yellow","hot");
		
		Sky sk=new Sky();
		System.out.println("Cloud details ---");
		System.out.println(sk.c.getColor());
		System.out.println(sk.c.getSpeed());
		
		Moon m=new Moon("cool","white");
		sk.HasA(m);
		sk.hasA(s);
	}

}
