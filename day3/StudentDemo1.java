/*
Create a class Student with 2 data members rno and name. 
Create one method setData() that takes roll number and student name as parameter and 
stores them in data members rno and name. 
Create one more method showData() to print the data member values. 
Create another class ( main class) StudentDemo that creates Student class object and 
calls setData() and showData() methods.
Modify the above program (no. 30) to count the no of Student objects created.
[ In this program static variable is required ]
*/

import java.util.Scanner;

class Student1{
	private int rno;
	private String name;
	private static int count;
	void setData(int rn, String nm){
		this.rno = rn;
		this.name = nm;
		countData();
	}
	int countData(){
		return count++;
	}
	
	void showData(){
		System.out.println("Student Roll no - "+rno+" & Student Name - "+name);
		
	}
	
	
}

class StudentDemo1{
	public static void main(String[] args){
		
		Student1 s = new Student1();
		//obj 1
		s.setData(1, "aaaa");
		s.showData();
		//obj 2
		Student1 s2 = new Student1();
		s2.setData(2, "bbbb");
		s2.showData();
		//obj 3
		Student1 s3 = new Student1();
		s3.setData(3, "cccc");
		s3.showData();
		//obj 4
		Student1 s4 = new Student1();
		s4.setData(4, "dddd");
		s4.showData();
		
		System.out.println("No. of object created = "+s4.countData());
	}
}
