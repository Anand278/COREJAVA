//Write a program to reverse a given number.

import java.util.Scanner;

class Reverse{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int num = sc.nextInt(); //1234
		int temp = num;
		int rem=0,rev=0;
		while(num > 0){
			rem = num % 10;  // 4,3,2,1
			rev = rev * 10 + rem; // 4321
			num = num / 10; // 123,12,1,0
		}
	System.out.println("Reverse number of "+temp+ " is "+rev);
	}
}