//Write a program that initializes 2 byte type of variables. 
//Add the values of these variables and store in a byte type of variable. 
//[Note: primitive down casting is required in this program ] .

import java.util.Scanner;

class Byte{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a ");
		byte a = sc.nextByte();
		System.out.println("Enter value of b ");
		byte b = sc.nextByte();
		byte c = (byte)(a + b) ;
		System.out.println("c = "+c);
		
	}
}