import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
//hashing=hashtable+hash function (load factor 0.75)
public class HashSet_LinkedHashSet_Demo {

	public static void main(String[] args) {
		//HashSet hs=new HashSet();
		LinkedHashSet hs=new LinkedHashSet();
		hs.add(10);
		hs.add(20);
		hs.add("hello");
		hs.add(30);
		hs.add(null);
		//hs.add(30);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		/*
		 * for(Object a : hs) {
		 * 
		 * System.out.print(a+" "); }
		 */
		Iterator il=hs.iterator();
		while(il.hasNext()) {
			System.out.print(il.next()+" ");
		}
	}

}
