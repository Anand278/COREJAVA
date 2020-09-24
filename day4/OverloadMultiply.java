/*
36.	Create a class MathOperation containing overloaded methods ‘multiply’ to 
	calculate multiplication of following arguments. 
a.	 two integers 
b.	 three floats 
c.	 all elements of array 
d.	one double and one integer 
*/

import java.util.Scanner;

class MathOperation{
		void multiply(int a, int b){
		int mul1 = a * b;
		System.out.println("int param multiply = "+mul1);
	}
	
	void multiply(float a, float b, float c){
		float mul2 = a * b * c;
		System.out.println("float param multiply = "+mul2);
	}
	
	void multiply(double a, int b){
		double mul3 = a * b;
		System.out.println("double and int multiply = "+mul3);
	}
	
	
	void multiply(int[] n){
		int mult =1;
		for(int a: n){
			mult = mult * a;
		}
		System.out.println("Array multiply = "+mult);
	}
}

class OverloadMultiply{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		MathOperation m = new MathOperation();
		m.multiply(2, 2);
		m.multiply(3.3F, 3.3F, 3.3F);
		m.multiply(5.5, 3);
		int ar[] = new int[3];
		System.out.println("Enter array no.");
		for(int i=0;i<ar.length;i++){
			ar[i] = sc.nextInt();
		}
		m.multiply(ar);
	}
}