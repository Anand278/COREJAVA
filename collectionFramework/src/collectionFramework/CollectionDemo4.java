package collectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo4 {

	public static void main(String[] args) {
		Collection a = new ArrayList();
		a.add(12);
		a.add("Ram");
		a.add(123.45);
		System.out.println(a);

		for(Object b : a) {
			System.out.println(b);
		}
	}

}
