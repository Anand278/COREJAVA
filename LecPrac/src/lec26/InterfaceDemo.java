package lec26;
@FunctionalInterface
interface Sum{
	int Ope(int i, int j);
}
public class InterfaceDemo {

	public static void main(String[] args) {
		Sum s = (i, j) -> i+j ;
		System.out.println("Sum is "+(s.Ope(10, 20)));
		
		s = (i, j) -> i*j ;
		System.out.println("Multiply is "+(s.Ope(2, 3)));

	}

}
