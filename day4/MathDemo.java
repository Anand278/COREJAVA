/*		01.	Create a class MathOperation that has four static methods. 
		add() method that takes two integer numbers as parameter and returns the sum of the numbers.
		 subtract() method that takes two integer numbers as parameter and returns the difference of the numbers.
		 multiply() method that takes two integer numbers as parameter and returns the product.
		 power() method that takes two integer numbers as parameter and returns the power of first number to second number. 
		 
		 Create another class Demo (main class) that takes the two numbers from the user
		 and calls all four methods of MathOperation class by providing entered numbers and 
		 prints the return values of every method.		*/

		 
import java.util.Scanner;
import java.lang.Math;

class MathOperation{
	static void add(int a, int b){
		int sadd = a + b;
		System.out.println("Addition = "+sadd);
	}
	static void subtract(int a, int b){
		int sub = a - b;
		System.out.println("Subtraction = "+sub);
	}
	static void multiply(int a, int b){
		int mul = a * b;
		System.out.println("Multiplication = "+mul);
	}
	static void power(int a, int b){
		int powr = (int)(Math.pow(a, b));
		System.out.println("Power = "+powr);
	}
}

class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a : ");
		int a = sc.nextInt();
		System.out.println("Enter b : ");
		int b = sc.nextInt();
		MathOperation m = new MathOperation();
		m.add(a, b);
		m.subtract(a, b);
		m.multiply(a, b);
		m.power(a, b);
	}
}