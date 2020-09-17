//Write a program that takes radius of a circle as input. 
//Read the entered radius using Scanner class. 
//Then calculate and print the area and circumference of the circle.

import java.util.Scanner;

class Circle{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius ");
		double r = sc.nextDouble();
		float area = (float)(3.14*r*r);
		float circum = (float)(2*3.14*r);
		System.out.println("Area is "+area);
		System.out.println("Circumference is "+circum);
		
		//System.out.format("%.3f",area);
		//System.out.format("%.3f",circum);
	}
}
 