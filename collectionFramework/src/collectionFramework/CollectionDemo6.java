package collectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CollectionDemo6 {

	public static void main(String[] args) {
		List a = new ArrayList();
		a.add(12);
		a.add("Ram");
		a.add(123.45);
		System.out.println(a);
		System.out.println();
		
		ListIterator lit = a.listIterator();
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
		System.out.println("============================");
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
		
		
		while(lit.hasNext()) {
			System.out.println(lit.next());
//			lit.remove();
//			lit.add("aaa");
//			lit.set("bbbb");
		}
		
	}
}
