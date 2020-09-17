//Write a program to find the simple interest. 
//Take the principle amount, rate of interest and time from user using Scanner class.
//(p*n*r)/100

import java.util.Scanner;

class Interest{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principle amount ");
		int pa = sc.nextInt();
		System.out.println("Enter rate of interest ");
		float roi = sc.nextFloat();
		System.out.println("Enter Time");
		int time = sc.nextInt();
		double si = (pa*roi*time)/100;
		System.out.println("Simple Interest = "+si);
	}
}