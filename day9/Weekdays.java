package lec26;

import java.util.Scanner;

public class Weekdays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str2[]= {"Sun","Tue","Wed","Thur","Fri","Sat","Mon"};
		int a=sc.nextInt();
		sc.close();
		for(int i=0;i<str2.length;i++) {
			if(i==(a-1)) {
				System.out.print(str2[i]);
				break;
			}
		}
		

	}

}