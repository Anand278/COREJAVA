//Write a program to swap two numbers without using third variable.

import java.util.Scanner;

class Swap{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number ");
		int first = sc.nextInt();
		System.out.println("Enter 2nd number");
		int second = sc.nextInt();
		System.out.println("Before Swap : First number = " +first+ " Second number = " +second);
		first = first + second;
		second = first - second;
		first = first - second;
		System.out.println("After Swap : First number = " +first+ " Second number = " +second);
	}
}