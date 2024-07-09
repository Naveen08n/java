class Captain extends Thread{
	public void run() {
		System.out.println("Captain enter to the ground");
		try {
			BattingCoach bac=new BattingCoach();
			bac.setName("BattingCoach");
			
			BowlingCoach boc=new BowlingCoach();
			boc.setName("BowlingCoach");
			
			bac.setDaemon(true);
			boc.setDaemon(true);
			
			bac.start();
			boc.start();

			
			Thread.sleep(1000);
			System.out.println("Captain doing some warm-up");
			Thread.sleep(1000);
			System.out.println("Captain doing catching");
			Thread.sleep(1000);
			System.out.println("Captain doing catching");
			Thread.sleep(1000);
			System.out.println("Captain doing batting");
			Thread.sleep(1000);
			System.out.println("Captain doing sometimes bowling");
			Thread.sleep(1000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Captain go back to the hotel");
	}
}
class BattingCoach extends Thread{
	public void run() {
		for( ; ; ) {
			System.out.println("Batting coach is in the ground");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
class BowlingCoach extends Thread{
	public void run() {
		for( ; ; ) {
			System.out.println("Bowling coach is in the ground");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
public class Daemon_thread {

	public static void main(String[] args) {
		Captain c=new Captain();

		c.setName("Captain");			
		c.start();
	}
}
