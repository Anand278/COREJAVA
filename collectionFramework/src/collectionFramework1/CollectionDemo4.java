package collectionFramework1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionDemo4 {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();	
		a.add(22);
		a.add(67);
		a.add(14);
		a.add(15);
		a.add(42);
		a.add(22);
		
//		Stream<Integer> stm = a.stream();
//		stm = stm.map(n -> n + 100);
//		stm.forEach(e -> System.out.println(e));
		
		Stream<Integer> stm = a.stream();
		stm = stm.filter(n -> n%2==0);
		stm.forEach(e -> System.out.println(e));
	}

}
