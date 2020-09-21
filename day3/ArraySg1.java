//Write a program to find the smallest and greatest number present in the array of integer type.


import java.util.Scanner;

class ArraySg1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of Array :");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter "+n+" Elments ");
		for(int i=0;i<a.length;i++){
			a[i] = sc.nextInt();
		}
		int large = a[0];
		int small = a[0];
		for(int j=0;j<a.length;j++){
			if(large < a[j]){
				large = a[j];
			}
			
			if(small > a[j]){
				small = a[j];
			}
		}
		System.out.println("Smallest Element = "+small+" largest Element = "+large);
	}
}