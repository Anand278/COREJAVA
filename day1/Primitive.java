//Find the result of following expressions. 
//You need to determine the primitive data type of the variable by looking 
//carefully the given expression and initialize variables by any random value.
//A. y = x2 + 3x - 7 (print value of y) 
//B. y = x++ + ++x (print value of x and y) 
//C. z = x++ - --y - --x  +  x++ (print value of x ,y and z)
//D. z = x && y || !(x || y)  (print value of z) [ x, y, z are boolean variables ]

import java.util.Scanner;

class Primitive{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of x ");
		int x = sc.nextInt();
		// condition A------>
		int y = x*x + 3*x - 7;
		System.out.println("y = "+y);
		
		// condition B ----->
		//int y = x++ + ++x;
		//System.out.println("x = "+x);
		//System.out.println("y = "+y);
		
		// condition C ----->
		//System.out.println("Enter value of y ");
		//int y = sc.nextInt();
		//int z = x++ - --y - --x + x++;
		//System.out.println("x = "+x);
		//System.out.println("y = "+y);
		//System.out.println("z = "+z);
		
		//conditon D ----->
		//boolean x = false;
		//boolean y = true;
		//boolean z = x && y || !(x || y);
		//System.out.println("z = "+z);
		
	}
}
