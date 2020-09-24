/*
	38.	Create a class Employee with three data members (empNo, salary and totalSalary) and following features.
	a.	Only parameterized constructor. [Do not overload the constructor]
	b.	totalSalary always represents salary total of all the employees created.
	c.	empNo should be auto incremented.
	d.	display total employees and totalSalary using a method.
	Create another class EmployeeDemo (main class) that creates some Employee objects and 
	calls Employee method to display no. of employees and total of their salaries.
*/

import java.util.Scanner;

class Employee{
	private static int empNo;
	private int salary;
	private static int totalSalary;
	
	Employee(int salary){
		this.empNo = ++empNo;
		this.salary = salary;
		this.totalSalary = totalSalary + salary;
	}
	
	void display(){
		//System.out.println();
		System.out.println("Total Employee : "+empNo);
		//System.out.println();
		System.out.println("Total Salary : "+totalSalary);
		//return totalSalary;
	}
}

class EmployeeDemo{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		/*
		System.out.println("Enter Salary : ");
		int sal = sc.nextInt();
		Employee e = new Employee(sal);
		
		System.out.println("Enter Salary : ");
		sal = sc.nextInt();
		Employee e1 = new Employee(sal);
		
		e1.display();
		*/
		//int t=0;
		System.out.println("Enter no of emp");
		int en =sc.nextInt();
		Employee[] ar = new Employee[en];
		for(int i=0;i<ar.length;i++){
			System.out.println("Enter Salary : ");
			int sal = sc.nextInt();
			Employee e = new Employee(sal);
			ar[i] = e;
			//t = e.display();
		}
		//System.out.println("Total Salary : "+t);
		ar[en-1].display();
	}
}