class Animals{
	
}
class FactoryAnimals{
	static Animals createInstance(String name) {
		if(name.equalsIgnoreCase("cat")) {
			return new Cat();
		}else if(name.equalsIgnoreCase("rat")) {
			return new Rat();
		}else {
			return new Cow() ;
		}
	}
}
class Cat extends Animals{

}
class Rat extends Animals{
	
}
class Cow extends Animals{
	
}
public class Factory_Design {

	public static void main(String[] args) {
		Animals cat=FactoryAnimals.createInstance("cat");
		Animals rat=FactoryAnimals.createInstance("rat");
		Animals cow=FactoryAnimals.createInstance("cow");
		System.out.println(cow);
		System.out.println(rat);
		System.out.println(cat);
	}

}
