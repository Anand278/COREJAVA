//Accept person’s gender (character m for male and f for female), age (integer), as input 
//and then check whether person is eligible for marriage or not.

import java.util.Scanner;

class Age{
	public static void main(String args[]){
		//char gender;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Gender (m for male and f for female)");
		String gender = sc.next();
		System.out.println("Enter Age ");
		int age = sc.nextInt();
		if(age > 21) {
			System.out.println("Person is eligible for marriage");
		}else {
			System.out.println("Person is not eligible for marriage");
		}
	}
}