//Write a program to read the days (eg. 670 days) as integer value using Scanner class. 
//Now convert the entered days into complete years, months and days and print them.


import java.util.Scanner;			
			
class Days{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of days ");
		int d = sc.nextInt();
		
		int year = d/365;
		int months = (d % 365)/12;
		int days = (d % 365)%7;
		
		System.out.println("Year = "+year);
		System.out.println("Months = "+months);
		System.out.println("Days = "+days);
	}
}