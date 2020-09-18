//Print all prime numbers between two given numbers. [ break continue ]

import java.util.Scanner;

class AllPrime{
	public static void main(String args[]){
		int temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range of two number ");
		int sr = sc.nextInt();
		int lr = sc.nextInt();
		while(sr < lr){
			boolean isprime = true;
			for(int i=2;i<=(sr/2);++i) {
				temp = sr%i;
				if(temp == 0){
					isprime = false;
					break;
				}
			}
			if(isprime){
					System.out.print(" "+sr);
				}
			++sr;
		}
	}
}
