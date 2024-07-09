import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList_Demo {

	public static void main(String[] args) {
		
		//ll.add(a);
		//ll.removeLast();
	
		
		
		ArrayList al=new ArrayList();
		//System.out.println(al.size());
		al.add(60);
		al.add(100);
		al.add(66);
		LinkedList ll=new LinkedList(al);
		//int[] a= {30,64,25,4,33,53};
		ll.add(10);
		System.out.println(ll.peek());
		Iterator i=ll.descendingIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		ll.add(20);
		ll.add(1, 45);
		ll.add(60);
		ll.add(66);
		ll.addFirst(5);
		//ll.addAll(al);
		ll.addLast(150);
		for(Object a :ll) {
			System.out.print(a+" ");
		}
		//ll.retainAll(al);
		//System.out.println(ll);
	//	ll.set(2, 01);
		//ll.retainAll(al);
		/*
		 * for(int i=0;i<ll.size();i++) { System.out.println(ll.get(i)); }
		 */
		//Forward direction
		/*
		Iterator i=ll.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		*/
		
		ListIterator li=ll.listIterator(ll.size());
		/*
		 * while(li.hasNext()) { System.out.println(li.next()); }
		 */
		/*
		 * while(li.hasPrevious()) { System.out.println(li.previous()); }
		 */
		System.out.println(ll.peek());//copy and print the element
		System.out.println(ll);
		System.out.println(ll.poll());//remove the first element
		System.out.println(ll);
	
	
	}

}
