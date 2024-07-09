import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Stack;
import java.util.Vector;

public class Legacy_class {

	public static void main(String[] args) {
		/*
		 * Stack v=new Stack(); v.add(200); v.add(100); v.add(50); v.add(300);
		 * v.add(600);
		 * 
		 * Enumeration e=v.elements(); while(e.hasMoreElements()) {
		 * System.out.print(e.nextElement()+" "); } //System.out.println(v);
		 */
		Hashtable v=new Hashtable();
		v.put(1, "navee");
		v.put(5, "ronal");
		v.put(10, "shiva");
		v.put(9, "messi");
		System.out.println(v.keySet());
		/*
		 * Enumeration e=v.elements(); while(e.hasMoreElements()) {
		 * System.out.print(e.nextElement()+" "); }
		 */
	}
	

}
