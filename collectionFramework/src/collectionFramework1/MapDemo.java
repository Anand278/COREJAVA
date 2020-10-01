package collectionFramework1;

import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		HashMap<String, Object> m = new HashMap<String, Object>();
		m.put("rollno", 101);
		m.put("name","Anand");
		m.put("Fee", 12345);
		
		System.out.println(m); 

		Object obj = m.get("name");
		System.out.println(obj);
	}

}
