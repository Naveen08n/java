class Charger{
	private String brand;
	float voltage;
	
	Charger(String brand, float voltage){
		super();
		this.brand=brand;
		this.voltage=voltage;
	}

	public String getBrand() {
		return brand;
	}

	public float getVoltage() {
		return voltage;
	}
	
}
class Os{
	private String name;
	private int size;
	public Os(String name, int size) {
		super();
		this.name = name;
		this.size = size;
	}
	public String getName() {
		return name;
	}
	public int getSize() {
		return size;
	}
}

class Mobile{
	Os o=new Os("Android",1);
	void hasA(Charger c) {
		System.out.println(c.getBrand());
		System.out.println(c.getVoltage());
	}
}

public class Aggregation_Composition {

	public static void main(String[] args) {
		
		Charger c=new Charger("SAMSUNG",2.5f);
		Mobile m=new Mobile();
		System.out.println(m.o.getName());
		System.out.println(m.o.getSize());
		m.hasA(c);
	
		//remove reference
		//m=null;
		System.out.println(m.o.getName());
		System.out.println(m.o.getSize());
		
		
	}

}
