//Initialize one String type of array and print the elements using for each loop.

import java.util.Scanner;

class ArrayString{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of Array : ");
		int n = sc.nextInt();
		String[] str = new String[n];
		System.out.println("Enter String :");
		for(int i=0;i<str.length;i++){	
			
			//str[i] = sc.nextLine();
			str[i] = sc.next();
		}
		
		for(String a : str){
			System.out.println(" "+a);
		}
	}
}

