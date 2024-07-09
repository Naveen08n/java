class A extends Thread{
	public void run() {
		Thread t1=Thread.currentThread();
		System.out.println("A "+t1);
	}
}
class B extends Thread{
	public void run() {
		Thread t1=Thread.currentThread();
		System.out.println("B "+t1);
	}
}
class C extends Thread{
	public void run() {
		Thread t1=Thread.currentThread();//PRINT THE CURRENT THREAD NAME
		System.out.println("C "+t1);
	}
}
public class Thread_current {

	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println(t);

		A a=new A();
		B b=new B();
		C c=new C();
		
		a.start();
		a.setName("BABA");// CHANGE THE THREAD NAME
		b.start();
		b.setName("shiva");
		System.out.println(b.getName());
		c.start();
	}

}
