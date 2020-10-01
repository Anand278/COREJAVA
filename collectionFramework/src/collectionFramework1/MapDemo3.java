package collectionFramework1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo3 {

	public static void main(String[] args) {
		HashMap<String, Object> m = new HashMap<String, Object>();
		m.put("rollno", 101);
		m.put("name","Anand");
		m.put("Fee", 12345);
		
		Collection<Object> obj = m.values();
		
		Iterator<Object> it = obj.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()); 
		}
	}

}
