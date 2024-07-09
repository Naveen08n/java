
class BathRoom{
	synchronized void bathroom() {
		String name=Thread.currentThread().getName();
		try {
			System.out.println(name+" is enter into the Bathroom");
			Thread.sleep(3000);
			System.out.println(name+" is using the bathroom");
			Thread.sleep(3000);
			System.out.println(name+" is exited into the bathroom");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
class Boy extends Thread{
	BathRoom ba;
	@Override
	public void run() {
		ba.bathroom();
	}
	public Boy(BathRoom ba) {
		this.ba=ba;
	}
}
class Girl extends Thread{
	BathRoom ba;
	@Override
	public void run() {
		ba.bathroom();
	}
	public Girl(BathRoom ba) {
		this.ba=ba;
	}
}
class Others extends Thread{
	BathRoom ba;
	@Override
	public void run() {
		ba.bathroom();
	}
	public Others(BathRoom ba) {
		this.ba=ba;
	}
}
public class Synchronization {

	public static void main(String[] args) {
		BathRoom ba=new BathRoom();
		
		Boy b=new Boy(ba);
		Girl g=new Girl(ba);
		Others o=new Others(ba);
		
		b.setName("Boy");
		g.setName("Girl");
		o.setName("Others");
		
		b.start();
		/*
		try {
			b.join();
			g.start();
			g.join();
			o.start();
		}catch(Exception e) {
			e.printStackTrace();
		}
		*/
		g.start();
		o.start();
	}

}
