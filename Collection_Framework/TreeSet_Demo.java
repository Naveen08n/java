import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.TreeSet;

public class TreeSet_Demo {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(50);
		ll.add(60);
		ll.add(50);
		TreeSet ts=new TreeSet();
		ts.add(30);
		ts.add(20);
		ts.add(10);
		ts.add(40);
		ts.add(40);
		ts.addAll(ll);
		//ts.add(null);//exception
		//System.out.println(ts);
		//System.out.println(ts.ceiling(54));//not present, give higher value
		//System.out.println(ts.floor(44));
		//System.out.println(ts.higher(50));
		//System.out.println(ts.lower(20));
		//System.out.println(ts.contains(100));
	//	System.out.println(ts.containsAll(ll));
		//System.out.println(ts.first());
		//System.out.println(ts.pollFirst());//remove and print
		//System.out.println(ts.retainAll(ll));
		//System.out.println(ts.comparator());
		//System.out.println(ts.headSet(30));//excluded given element
		//System.out.println(ts.tailSet(50));//included given element
		/*for(Object a : ts) {
			System.out.print(a+" ");
		}*//*
		Iterator it=ts.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}*/
		//System.out.println(ts.subSet(10, 60));
		Iterator il=ts.descendingIterator();
		while(il.hasNext()) {
			System.out.print(il.next()+" ");
		}
		
	}

}
