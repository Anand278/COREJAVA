package lec26;

public class StringDemo1 {

	public static void main(String[] args) {
		String s  = "Immutable Sequence of Characters.";
		System.out.println(s);
		String s1 = s.toUpperCase();
		System.out.println(s1);
		String s2 = s.toLowerCase();
		System.out.println(s2);
		int l = s.length();
		System.out.println(l);
		char i = s.charAt(10);
		System.out.println(i);
		int j = s.indexOf('C');
		System.out.println(j);
		int k = s.lastIndexOf('t');
		System.out.println(k);
		String s3 = s.substring(10);
		System.out.println(s3);
		String s4 = s.substring(10, 15);
		System.out.println(s4);

	}

}
