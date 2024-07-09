 class Queue{
	private int data;
	boolean dataIsPresent=false;
	
	public synchronized void setData(int data) {
		if(dataIsPresent==false) {
			this.data=data;
			System.out.println("Producer produced "+data);
			dataIsPresent=true;
			notify();
		}else { 
			try {
				wait();
			} catch (InterruptedException e) {
					e.printStackTrace();
			}
		}
	}
	public  synchronized void getData() {
		if(dataIsPresent==true) {
		System.out.println("Cosumer cosumed "+data);
		dataIsPresent=false;
		notify();
	   }else {
		   try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }
	}
}
class Producer extends Thread{
	Queue q;
	@Override
	public void run() {
		int i=1;
		for( ; ; )
		q.setData(i++);
	}
	
	public Producer(Queue q) {
		this.q=q;
	}
}
class Cosumer extends Thread{
	Queue q;
	@Override
	public void run() {
		for( ; ;) {
		 q.getData();
		}
	}
	
	public Cosumer(Queue q) {
		this.q=q;
	}
}
public class Producer_Consumer_Problem {

	public static void main(String[] args) {
		Queue q=new Queue();
		
		Producer p=new Producer(q);
		Cosumer c=new Cosumer(q);
		
		p.setName("PRODUCER");
		c.setName("COSUMER");
		
		p.start();
		c.start();

	}

}
