/*	54.	Write a program to reverse the given String.	*/

import java.util.*;

class StringReverse{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.nextLine();
		int l = str.length();
		
		for(int i=l-1;i>=0;i--){
			System.out.print(" "+str.charAt(i));
		}
	}
}