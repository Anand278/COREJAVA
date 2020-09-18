//Sort a ten element array in descending order.

import java.util.Scanner;

class Descending{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int temp;
		System.out.println("Enter 10 Elements");
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i] < arr[j]){
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
				}
			}
		}
		System.out.println("Array sorted in Descending order :");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
