//Program to show sum and average of 10 element array. Accept array elements from user.

import java.util.Scanner;

class Average{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int range = sc.nextInt();
		int sum = 0;
		int avg = 0;
		System.out.println("Enter " +range+ " Element ");
		for(int i=0;i<range;i++){
			int num = sc.nextInt();
			sum = sum + num;
		}
		System.out.println("sum = "+sum);
		System.out.println("Average = "+(sum/range));
		
	}
}