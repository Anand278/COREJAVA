package collectionFramework;

import java.util.HashSet;
import java.util.Set;

public class CollectionDemo7 {

	public static void main(String[] args) {
		Set a = new HashSet();
		a.add(12);
		a.add("Ram");
		a.add("Ram");
		a.add(123.45);
		System.out.println(a);
		
	}

}
