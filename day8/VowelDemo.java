// 52.	Input name of a person and count how many vowels it contains.  Use String class functions. 

import java.util.Scanner;

public class VowelDemo{
	public static int countVowel(String s){
		int count=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||
			s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
				count++;
			}
		}
		return count;
	}


	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		
		int str = countVowel(s);
		
		System.out.println("Count of Vowel in String is : "+str);
	}
}