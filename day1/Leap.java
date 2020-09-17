//Program to check that entered year is a leap year or not.

import java.util.Scanner;

class Leap{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an year ");
		int year = sc.nextInt();
		if (((year % 4 == 0) && (year % 100 != 0)) || (year%400 == 0))
         System.out.println(year+" year is a leap year");
      else
         System.out.println(year+" year is not a leap year");
	}
}

/*
if(year%4 == 0) {
			if(year%100 != 0 && year%400 == 0) {
				System.out.println(year+" year is leap year");
			}else {
				System.out.println(year+" year is not a leap year");
			}
		}else {
			System.out.println(year+" year is not a leap year");
		}
		*/