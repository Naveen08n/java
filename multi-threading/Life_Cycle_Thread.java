class Warrior extends Thread{
	String res1="BRAHMASTRA";
	String res2="PASHUPASTRA";
	String res3="SARPASTRA";
	
	public void run() {
		String name=Thread.currentThread().getName();
		if(name.equals("ARJUNA")){
			arjuna();
		}else {
			karna();
		}
	}
	void arjuna() {
		try {
			Thread.sleep(2000);
			synchronized(res1) {
				System.out.println("ARJUNA acquired "+res1);
				Thread.sleep(2000);
				synchronized(res2) {
					System.out.println("ARJUNA acquired "+res2);
					Thread.sleep(2000);
					synchronized(res3) {
						System.out.println("ARJUNA acquired "+res3);
						Thread.sleep(2000);
					}
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	void karna() {
		try {
			Thread.sleep(2000);
			synchronized(res1) {
				System.out.println("karna acquired "+res1);
				Thread.sleep(2000);
				synchronized(res2) {
					System.out.println("karna acquired "+res2);
					Thread.sleep(2000);
					synchronized(res3) {
						System.out.println("karna acquired "+res3);
						Thread.sleep(2000);
					}
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
public class Life_Cycle_Thread {

	public static void main(String[] args) {
		Warrior w1=new Warrior();
		Warrior w2=new Warrior();
		
		w1.setName("ARJUNA");
		w2.setName("KARNA");
		
		w1.start();
		w2.start();

	}

}
