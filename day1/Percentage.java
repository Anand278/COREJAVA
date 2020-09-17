//Write a program to calculate sum of 5 subject’s marks & find percentage. 
//Take the obtained marks from user using Scanner class. 
//Output should be in this format [ percentage marks = 99 % ]. Use concatenation operator here.

import java.util.Scanner;

class Percentage{
	public static void main(String args[]){
		int total = 500;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Subject 1 marks");
		double sub1 = sc.nextDouble();
		System.out.println("Enter Subject 2 marks");
		double sub2 = sc.nextDouble();
		System.out.println("Enter Subject 3 marks");
		double sub3 = sc.nextDouble();
		System.out.println("Enter Subject4 marks");
		double sub4 = sc.nextDouble();
		System.out.println("Enter Subject 5 marks");
		double sub5 = sc.nextDouble();
		double sum = sub1+sub2+sub3+sub4+sub5;
		double per = (sum*100)/total;
		System.out.println("Percentage marks = " +per+ " %");
	}
}