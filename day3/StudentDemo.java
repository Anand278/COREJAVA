/*
Create a class Student with 2 data members rno and name. 
Create one method setData() that takes roll number and student name as parameter and 
stores them in data members rno and name. 
Create one more method showData() to print the data member values. 
Create another class ( main class) StudentDemo that creates Student class object and 
calls setData() and showData() methods.
*/

import java.util.Scanner;

class Student{
	private int rno;
	private String name;
	void setData(int rollno, String sname){
		rno = rollno;
		name = sname;
	}
	void showData(){
		System.out.println("Student Roll no : "+rno);
		System.out.println("Student Name : "+name);
	}
}

class StudentDemo{
	public static void main(String[] args){
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter Student roll no : ");
		int rn = sc.nextInt();
		System.out.print("Enter Student name : ");
		String nm = sc.nextLine();
		Student s = new Student();
		s.setData(rn, nm);
		s.showData();
	}
}