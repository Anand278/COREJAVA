package collectionFramework1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo4 {

	public static void main(String[] args) {
		HashMap<String, Object> m = new HashMap<String, Object>();
		m.put("rollno", 101);
		m.put("name","Anand");
		m.put("Fee", 12345);
		
		Set<Entry<String, Object>> s = m.entrySet();
		
		Iterator<Entry<String, Object>> it = s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
