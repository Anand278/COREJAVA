package lec26;

public class StringDemo {

	public static void main(String[] args) {
		String s = "abcd";
		System.out.println(s);
		String s1 = new String("efghi");
		System.out.println(s1);
		byte ar[] = {65,66,67,68};
		String s2 = new String(ar);
		System.out.println(s2);
		char ch[] = {'j', 'k', 'l', 'm'};
		String s3 = new String(ch);
		
		System.out.println(s3);

	}

}
