//Program to find greatest in 3 numbers. [
// once using if else statement and then using ternary operator ( logical operator) ]  

import java.util.Scanner;
/*
class Greatest{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int first = sc.nextInt();
		System.out.println("Enter 2nd number");
		int second = sc.nextInt();
		System.out.println("Enter 3rd number");
		int third = sc.nextInt();
		if (first > second) {
			System.out.println(first+" Number is Greatest");
		}else if(second > third) {
			System.out.println(second+" Number is Greatest");
		}else {
			System.out.println(third+" Number is Greatest");
		}
	}
}*/

class Greatest{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int first = sc.nextInt();
		System.out.println("Enter 2nd number");
		int second = sc.nextInt();
		System.out.println("Enter 3rd number");
		int third = sc.nextInt();
		int greater;
		greater = (first > second) ? (first > third ? first : third) : (second > third ? second : third);
		System.out.println("Greatest number is "+greater);
	}
}









