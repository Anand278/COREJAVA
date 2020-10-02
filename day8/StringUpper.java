/*	56.	Write a program to convert very first character of every word in uppercase in a String.	*/


import java.util.Scanner;

public class StringUpper {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		
		String str[] = s.split(" ");
		int size = str.length;
		int count = 0;
		
		for(int i=0;i<size;i++) {
			 System.out.print(str[i].substring(0,1).toUpperCase());
	         
	         System.out.print(str[i].substring(1,str[i].length()) + " ");
		}
	}
}

