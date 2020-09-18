//Calculate  series : 12+22+32+42+.........+n2

import java.util.Scanner;
import java.lang.Math;

class Series{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int num = sc.nextInt();
		int result=0;
		for(int i=1;i<=num;i++){
			result = (int)(result + (Math.pow(i, 2)));
			if(i==1){
				System.out.print(i+"2");
			}else {
				System.out.print("+"+i+"2");
			}
		}
		System.out.print("= "+result);
	}
}