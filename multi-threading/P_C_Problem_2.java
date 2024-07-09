class Talking{
	char x;
	boolean is_data_Present=false;
	
	public synchronized void speaker(char i) {
		try {
			if(is_data_Present==false) {
				this.x=i;
				System.out.println("speaker speaks "+ x );
				is_data_Present=true;
				notify();
			}else {
				wait();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public synchronized void listener() {
		try {
		if(is_data_Present==true) {
			System.out.println("listener listen "+x);
			is_data_Present=false;
			notify();
		}
		else {
			wait();
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
			
	 }

}
class Speaking extends Thread{
	Talking t;
	public Speaking(Talking t) {
		this.t=t;
	}

	//Talking t=new Talking();
	@Override
	public void run() {
		for( int i=65;i<75;i++) {
			t.speaker((char)i);
		}
	}
}
class Listener extends Thread{
	Talking t;
	public Listener(Talking t) {
		this.t=t;
	}
	
	@Override
	public void run() {
		for( ; ; ) {
			t.listener();
		}
	}
}
public class P_C_Problem_2 {

	public static void main(String[] args) {
		Talking t=new Talking();
		
		Speaking s=new Speaking(t);
		Listener l=new Listener(t);
		
		s.setName("SPEAKER");
		s.setName("LISTENER");
		
		s.start();
		l.start();
	}

}
