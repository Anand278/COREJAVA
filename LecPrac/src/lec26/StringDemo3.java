package lec26;

public class StringDemo3 {

	public static void main(String[] args) {
		String s = "ABC";
		String s1 = "DEF";
		String s2 = s.concat(s1);
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("=======================");
		String s3 = "qwerty";
		s3 = s3.concat("uip");
		System.out.println(s3);
	}

}
