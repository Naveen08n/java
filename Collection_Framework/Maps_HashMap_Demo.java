import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Maps_HashMap_Demo {

	public static void main(String[] args) {
		 HashMap hs=new HashMap();
		 hs.put(7,"dhoni");
		 hs.put(10, "virat");
		 hs.put(18, "sachin");
		 hs.put(87, "surya");
		 hs.put(360,"AB");
		 hs.put(19,"Dk");
		 
		 TreeMap m=new TreeMap();
		 m.put(1, 1);
		 m.put(2, "two");
		 m.put(3,"three");
			/*
			 * for(Object s :m) { System.out.print(s+" "); }
			 */
		 System.out.println(m);
		// System.out.println(hs);
		//System.out.println(hs.get(360));
		//System.out.println(hs.entrySet());
		//System.out.println(hs.replace(19,"Dk","DK"));
		//System.out.println(hs.keySet());
		//System.out.println(hs.values());
		
		Set< Entry<String ,Integer> > myEntry=hs.entrySet();
		for(Entry e:myEntry) {
			System.out.println(e.getKey()+" : "+e.getValue());
		}
		
		
		
		//System.out.println(hs);
		//System.out.println(hs.containsKey("Dk"));
		//System.out.println(hs.containsValue("Dk"));
		//System.out.println(hs.containsKey(18));
		 //Iterator it=hs.iterator();
	}

}
