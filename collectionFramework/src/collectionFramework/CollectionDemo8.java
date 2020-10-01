package collectionFramework;

import java.util.LinkedHashSet;
import java.util.Set;

public class CollectionDemo8 {

	public static void main(String[] args) {
		Set a = new LinkedHashSet();
		a.add(12);
		a.add("Ram");
		a.add("Ram");
		a.add(123.45);
		System.out.println(a);
		
	}

}
