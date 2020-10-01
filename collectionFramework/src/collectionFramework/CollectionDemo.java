package collectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {
		Collection a = new ArrayList();
		a.add(12);
		a.add("Ram");
		a.add(123.45);
		System.out.println(a);
		a.remove("Ram");
		System.out.println(a);
	}

}
