//Write a program to convert temperature from Fahrenheit to Celsius. 
//Take Fahrenheit as input using Scanner class. [ formula : C= 5*(f-32)/9 ]

import java.util.Scanner;

class Temperature{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Fahrenheit");
		float fah = sc.nextFloat();
		float cel = 5*(fah-32)/9;
		System.out.println("Celsius Temperature of " +fah+ " is " +cel);
	}
}