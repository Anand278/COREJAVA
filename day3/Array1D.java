//Write a program to print the total number of one-D arrays in a two-D array and
// the number of elements in every one-D array present in the two-D arrays.

import java.util.Scanner;

class Array1D {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of Rows : ");
		int r = sc.nextInt();
		int arr[][] = new int[r][];
		int count= 0;
		for(int i=0;i<arr.length;i++){
			System.out.print("Enter no. of cols : ");
			int c = sc.nextInt();
			count++;
			arr[i] = new int[c]; 
			for(int j=0;j<arr[i].length;j++){
				System.out.println("Enter elements : ");
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i].length+" is total no. of 1D array in "+(i+1)+" row of 2D array ");
			for(int j=0;j<arr[i].length;j++){
				System.out.println("Elements is "+arr[i][j]);
			}
		}
	}
}
