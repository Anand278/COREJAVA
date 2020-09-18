//Write a program to search an element in the array.

import java.util.Scanner;

class Search{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		int i, count = 0;
		System.out.println("Enter 5 Elements :");
		for(i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter element to search :");
		int sh = sc.nextInt();
		for(i=0;i<arr.length;i++){
			if(sh == arr[i]){
				count = 1;
				break;
			}
		}
		if(count == 1){
			System.out.println(sh+" element is at index "+(i+1));
		}else {
			System.out.println(sh+" element is not found");
		}
	}
}
