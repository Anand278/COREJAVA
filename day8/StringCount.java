/*	55.	Write a program to count no of words in the String.*/

import java.util.Scanner;

public class StringCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		
		String str[] = s.split(" ");
		int count = 0;
		
		for(String a:str) {
			System.out.print(" "+a);
			count++;
		}
		System.out.println();
		System.out.println("Total no. of words is "+count);
	}
}
