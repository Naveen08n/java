import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

public class Arraydeque_Demo {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(40);
		al.add(50);
		al.add(60);
		//System.out.println(al);
		
		ArrayDeque ad=new ArrayDeque();
		/*
		ad.add(10);
		ad.add(20);
		ad.add(30);
		ad.addAll(al);
		//ad.add(null);//exception
		ad.addFirst(5);
		ad.addLast(100);
		*/
		//System.out.println(ad);
		//ad.remove(10);
		
		/*
		System.out.println(ad.peek());
		System.out.println(ad);
		System.out.println(ad.poll());
		System.out.println(ad);
		System.out.println(ad.pollLast());

		
		for(Object a:ad) {
			System.out.print(a+" ");
		}
		
	    Iterator il=ad.iterator();
	    while(il.hasNext()) {
	    	System.out.print(il.next()+" ");
	    }*/
		//stack
		ad.push(1);
		ad.push(2);
		ad.push(3);
		ad.push(4);
		ad.push(4);
		ad.push(5);
		System.out.println(ad);
		ad.pollLast();
		ad.pop();
		ad.addFirst(6);
		System.out.println(ad);
		
		/*
		Iterator il=ad.descendingIterator();
		while(il.hasNext()) {
			System.out.print(il.next()+" ");
		}
		*/
		
	}

}
