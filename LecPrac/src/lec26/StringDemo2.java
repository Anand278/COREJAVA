package lec26;

public class StringDemo2 {

	public static void main(String[] args) {
		String s = "This is some content";
		String ar[] = s.split(" ");
		for(String a : ar) {
			System.out.println(a);
		}
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=");
		String s1 = String.join("-",ar);
		System.out.println(s1); 
	}

}
