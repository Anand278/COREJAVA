//Create an array of 17 elements in 5 rows.  And calculate sum of all elements.

import java.util.Scanner;
import java.lang.*;

class SumArray{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of rows : ");
		int r = sc.nextInt();
		int ar[][] = new int[r][];
		System.out.print("Enter total no. of elements : ");
		int eleLeft = sc.nextInt();
		
		for(int i=0;i<ar.length;i++){
			System.out.print("Enter no. of col : ");
			int c = sc.nextInt();
			ar[i] = new int[c];
			
				for(int j=0;j<ar[i].length;j++){
					System.out.print("Enter elements : ");
					ar[i][j] = sc.nextInt();
				}
				eleLeft -= c;
				System.out.println("-------> element left :"+eleLeft);
				if(eleLeft < 0){
					System.out.println("exceeding elements ..manage ele upto 17 only in "+r+" rows");
					System.exit(0);
				}
		}
		int sum =0;
		for(int b[] : ar){
			for(int c : b){
				sum += c;
			}
		}
		System.out.println("");
		System.out.println("Sum = "+sum);
	}
}