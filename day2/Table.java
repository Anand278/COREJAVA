//Write a program to print table of any entered number using loop.

import java.util.Scanner;

class Table{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Table No ");
		int tn = sc.nextInt();
		for (int i=1;i<=10;i++){
			int sum = tn * i;
			System.out.println(tn+" * "+i+" = "+sum);
		}
	}
}