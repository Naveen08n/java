import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArraysList_Demo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		// al.add(200);
		al.add(null);
		al.add("tap");
		// al.add('T');
		al.add(34.22);
		al.set(3, 65);
		System.out.println(al.indexOf(10));
		/*
		 * Collections.sort(al); System.out.println(al);
		 */
		// System.out.println(al.getClass());
		/*
		 * for(int i=0;i<al.size();i++) { System.out.println(al.get(i)); }
		 * 
		 * for( Object a: al) { System.out.println(a); }
		 */
		/*
		 * Iterator ali=al.iterator();// only forward directions while(ali.hasNext()) {
		 * System.out.println(ali.next()); }
		 */
		//System.out.println(al.contains(90));
	ListIterator li=al.listIterator(al.size());
	while(li.hasPrevious()) {
		System.out.print(li.previous()+" ");
	}
		
	}
	

}
