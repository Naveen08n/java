class ATM{
	 void atm_machine() {
	String name=Thread.currentThread().getName();	
	try {
		System.out.println(name+" enter into the Atm room");
		Thread.sleep(2000);
		System.out.println(name +"  select the langauge");
		Thread.sleep(2000);
		System.out.println(name+" Enter the atm pin");
		Thread.sleep(2000);
		synchronized(this) {
			System.out.println(name+" Enter the cash amount");
			Thread.sleep(2000);
			System.out.println(name+" collect the cash");
			Thread.sleep(2000);
			System.out.println(name +" exited the atm room");
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	}
}
class Boys extends Thread{
	ATM a;
	@Override
	public void run() {
		a.atm_machine();
	}
	public Boys(ATM a) {
		this.a=a;
	}
}
class Girls extends Thread{
	ATM a;
	@Override
	public void run() {
		a.atm_machine();
	}
	public Girls(ATM a) {
		this.a=a;
	}
}
class Otherss extends Thread{
	ATM a;
	@Override
	public void run() {
		a.atm_machine();
	}
	public Otherss(ATM a) {
		this.a=a;
	}
	
}
public class Synchronized_blocked {

	public static void main(String[] args) {
		ATM a=new ATM();
		
		Boys b=new Boys(a);
		Girls g=new Girls(a);
		Otherss o=new Otherss(a);
		
		b.setName("Boy");
		g.setName("Girls");
		o.setName("Others");
		
		b.start();
		g.start();
		o.start();
		
	}

}
