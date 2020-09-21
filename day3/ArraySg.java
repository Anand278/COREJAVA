//Write a program to find the smallest and greatest number present in the array of integer type.

import java.util.Scanner;

class ArraySg{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of array : ");
		int n = sc.nextInt();
		int a[] = new int [n];
		System.out.println("Enter "+n+" Elements : ");
		for(int i=0;i<a.length;i++){
			a[i] = sc.nextInt();
		}
		int temp;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i] > a[j]){
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
			System.out.println("Smallest Element = "+a[0]+" & Largest Element = "+a[a.length-1]);	
	}
}
