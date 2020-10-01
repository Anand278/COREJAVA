package collectionFramework1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionDemo3 {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();	
		a.add(22);
		a.add(67);
		a.add(14);
		a.add(15);
		a.add(42);
		a.add(22);
		
		Stream<Integer> stm = a.stream();
		stm = stm.distinct();
		a.add(12);	//stm.forEach(ele -> System.out.println(ele));
		System.out.println(a);
		
		List<Integer> a1 = stm.collect(Collectors.toList());
		System.out.println(a1);
	}

}
