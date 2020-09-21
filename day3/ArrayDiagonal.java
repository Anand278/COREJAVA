//Create an integer type 2-D array of size [3X3]. 
//Take the elements from the user and then calculate the sum of the elements present in the diagonal.

import java.util.Scanner;

class ArrayDiagonal{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter no. of Rows : ");
	int r = sc.nextInt();
	int arr[][] = new int[r][];
		for(int i=0;i<arr.length;i++){
			System.out.print("Enter no. of cols : ");
			int c = sc.nextInt();
			arr[i] = new int[c];
			for(int j=0;j<arr[i].length;j++){
				System.out.print("Enter Element : ");
				arr[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		int fDig=0;
		int bDig=0;
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(i==j){
					fDig += arr[i][j];
					bDig += arr[(arr.length-1)-i][j]; 
				}
			}
		}
	
		for(int ar[] : arr){
			for(int a : ar){
				System.out.print(" "+a);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println(" fDig = "+fDig);
		System.out.println(" bDig = "+bDig);
		System.out.println();
		System.out.println("Sum of diagonals = "+(fDig+bDig));
	}
}
