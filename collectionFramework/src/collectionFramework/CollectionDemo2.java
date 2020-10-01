package collectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2 {

	public static void main(String[] args) {
		Collection a = new ArrayList();
		a.add(12);
		a.add("Ram");
		a.add(123.45);
		System.out.println(a);
		
		Collection a1 = new ArrayList();
		a1.add(12);
		a1.add("Ram");
		a1.add(123.45);
		System.out.println(a1);
		a.addAll(a1);
		System.out.println(a1);
		System.out.println(a);
	}

}
