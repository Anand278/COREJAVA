package lec26;

public class StringBuilderDemo {

	public static void main(String[] args) {
	/*	
		StringBuilder s = new StringBuilder("abc");
		System.out.println(s);
		s.append("DEF");
		System.out.println(s);
		s.insert(2, "QWERTY");
		System.out.println(s);
		s.replace(4, 7, "ASDF");
		System.out.println(s);
		s.delete(5, 7);
		System.out.println(s);
*/
		StringBuffer s = new StringBuffer("abc");
		System.out.println(s);
		s.append("DEF");
		System.out.println(s);
		s.insert(2, "QWERTY");
		System.out.println(s);
		s.replace(4, 7, "ASDF");
		System.out.println(s);
		s.delete(5, 7);
		System.out.println(s);
	}

}
