package lec26;

public class ExcDemo {

	public static void main(String[] args) {
		System.out.println("Started...");
		String ar[] = {"16","0"};
		try {
		String s1 = ar[0];
		String s2 = ar[1];
		int i = Integer.parseInt(s1);
		int j = Integer.parseInt(s2);
		int k = i/j;
		System.out.println("k = "+k);
		}catch(ArithmeticException |
				NumberFormatException |
				ArrayIndexOutOfBoundsException e ) {
			System.out.println(e);
		}finally {
			System.out.println("Execute any how...");
		}
		
		System.out.println("Finished...");
		
	}
}

