class Demos extends Thread{
	public void run() {
		System.out.println("Thread-0 is execution is Started");
		try {
			//Thread.sleep(1000);
			System.out.println("Thread-0 is executing");
			//Thread.sleep(1000);
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("Thread-0 is execution  completed");
	}
}
public class Joins {

	public static void main(String[] args) {
		System.out.println("Main thread execution is started");
		System.out.println("main thread is executing");
		Demos s=new Demos();
		s.start();
		try {
			s.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main thread completed");
		
	}

}
