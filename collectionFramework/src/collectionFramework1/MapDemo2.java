package collectionFramework1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo2 {

	public static void main(String[] args) {
		HashMap<String, Object> m = new HashMap<String, Object>();
		m.put("rollno", 101);
		m.put("name","Anand");
		m.put("Fee", 12345);
		
		Set<String> keys = m.keySet();
		
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
