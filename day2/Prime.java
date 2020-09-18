//Program to check whether number is prime or not.

import java.util.Scanner;

class Prime{
	public static void main(String args[]){
		int temp;
		boolean isprime = true;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		
		for(int i=2; i< (num/2); i++){
								//System.out.println(i+" "+(num/2));
			temp = num%i;
								//System.out.println(temp);
			if(temp == 0){
				isprime = false;
				break;
			}
								System.out.println(i+" "+num);
		}
								System.out.println(" "+num);
		/*if(isprime){
			System.out.println(num+" number is prime number");
		}else {
			System.out.println(num+" number is not a prime number");
		}*/
	}
}