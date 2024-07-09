class Bank extends Thread{
	String res1="bank";
	String res2="account form";
	String res3="account book";
	
	public void run() {
		String name=Thread.currentThread().getName();
		
		if(name.equals("CUSTOMER1")) {
			customer1();
		}else {
			customer2();
		}
	}
	synchronized public void customer1() {
		try {
			Thread.sleep(2000);
			synchronized(res1) {
				System.out.println("customer1 Enter into the "+res1);
				Thread.sleep(2000);
				synchronized(res2) {
					System.out.println("customer1 fill the "+res2);
					Thread.sleep(2000);
					synchronized(res3) {
						System.out.println("customer1 exited into bank with "+res3);
						Thread.sleep(2000);
					}
				 }
			}
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
	 void customer2(){
		try {
			Thread.sleep(2000);
			synchronized(res1) {
				System.out.println("customer2 Enter into the "+res1);
				Thread.sleep(2000);
				synchronized(res2) {
					System.out.println("customer2 fill the "+res2);
					Thread.sleep(2000);
						synchronized(res3) {
							System.out.println("customer2 exited into bank with "+res3);
							Thread.sleep(2000);
						}
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
public class Bank_Life_Thread {

	public static void main(String[] args) {
		Bank b1=new Bank();
		Bank b2=new Bank();
		
		b1.setName("CUSTOMER1");
		b2.setName("CUSTOMER2");
		
		b1.start();
		b2.start();

	}

}
