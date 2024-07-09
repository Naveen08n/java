class Warriors extends Thread{
	String res1="BRAHMASTRA";
	String res2="PASHUPASTRA";
	String res3="SARPASTRA"; 
	
	public void run() {
		String name=Thread.currentThread().getName();
		if(name.equals("ARJUNA")) {
			arjuna();
		}else {
			karna();
		}
	}
	public void arjuna() {
		try {
			Thread.sleep(2000);
			synchronized(res1) {
			System.out.println("Arjuna acquired "+res1);
			Thread.sleep(2000);
			synchronized(res2) {
				System.out.println("Arjuna acquired "+res2);
				Thread.sleep(2000);
				synchronized(res3) {
					System.out.println("Arjuna acquired "+res3);
					Thread.sleep(2000);
				}
			}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
		public void karna() {
			try {
				Thread.sleep(2000);
				synchronized(res3) {
				System.out.println("karna acquired "+res3);
				Thread.sleep(2000);
				synchronized(res2) {
					System.out.println("karna acquired "+res2);
					Thread.sleep(2000);
					synchronized(res1) {
						System.out.println("karna acquired "+res1);
						Thread.sleep(2000);
					}
				}
				}
			}catch(Exception e) {
				e.printStackTrace();
			}

		}
}
public class Dead_lock {

	public static void main(String[] args) {
		Warriors w1=new Warriors();
		Warriors w2=new Warriors();
		
		w1.setName("ARJUNA");
		w2.setName("KARNA");
		
		w1.start();
		w2.start();

	}

}
