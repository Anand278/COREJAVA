//Write the program to find the sum of even elements and sum of odd elements present in the array of integer type.

import java.util.Scanner;

class EvenOdd{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of Array ");
		int n = sc.nextInt();
		System.out.println("Enter "+n+" elements ");
		int ar[] = new int[n];
		for(int i=0;i<ar.length;i++){
			ar[i] = sc.nextInt();
		}
		int sumEven=0,sumOdd=0;
		for(int i=0;i<ar.length;i++){
			if(ar[i]%2==0){
				sumEven += ar[i];
			}else {
				sumOdd += ar[i];
			}
		}
		System.out.println("Sum of Even Element  = "+sumEven+" and Odd Element = "+sumOdd);
	}
}
