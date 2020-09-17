//In a company an employee is paid as under: If his basic salary is less than Rs. 10000, 
//then HRA = 10% of basic salary and DA = 90% of basic salary. 
//If his salary is either equal to or above Rs. 10000, then HRA = Rs. 2000 and DA = 98% of basic salary. 
//If the employee's salary is input by the user write a program to find his gross salary. 
//[ formula : GS= Basic + DA + HRA ]

import java.util.Scanner;

class Salary{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Basic Salary ");
		int bs = sc.nextInt();
		double hra, da;
		if (bs < 10000) {
			hra = bs*0.10;
			da = bs*0.90;
		} else {
			hra = 2000;
			da = bs*0.98;
		}
		double gs = bs + da + hra;
		System.out.println("Gross Salary is "+gs);
	}
}