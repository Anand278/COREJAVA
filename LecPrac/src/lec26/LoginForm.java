package lec26;

import java.util.Scanner;

public class LoginForm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username ");
		String uname = sc.next();
		System.out.println("Enter Password ");
		String upass = sc.next();
		if(uname.equalsIgnoreCase("anand") && upass.equals("abcd")) {
			System.out.println("WELCOME "+uname.toUpperCase());
		}else {
			System.out.println("better luck next time.");
		}
	}

}
