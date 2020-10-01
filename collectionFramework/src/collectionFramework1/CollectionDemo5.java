package collectionFramework1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionDemo5 {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();	
		a.add(22);
		a.add(67);
		a.add(14);
		a.add(15);
		a.add(42);
		a.add(22);

		Stream<Integer> stm = a.stream();
		Optional<Integer> opt = stm.min(Comparator.comparing(n->n));
		//int i = opt.get();
		System.out.println(opt.get());
		
		Stream<Integer> stm1 = a.stream();
		Optional<Integer> opt1 = stm1.max(Comparator.comparing(n->n));
		int i = opt1.get();
		//System.out.println(opt1.get());
		System.out.println(i);
	}

}
