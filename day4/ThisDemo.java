//33.	Write a program to demonstrate functionalities of this keyword in java. 

import java.util.Scanner;

class Student{
	private int rno;
	private String sname;
	
	void setData(int rn, String name){
		this.rno = rn;
		this.sname = name;
	}
	void showData(){
		System.out.println("Student roll no : "+rno+" & name : "+sname);
	}
}

class StudThisDemo{
	public static void  main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array class : ");
		int ac = sc.nextInt();
		Student[] ar = new Student[ac];
		
		for(int i=0;i<ar.length;i++){
			System.out.println("Enter roll no : ");
			int r = sc.nextInt();
			System.out.println("Enter name : ");
			String n = sc.next();
			Student s = new Student();
			ar[i] = s;
			s.setData(r, n);
		}
		
		for(Student a : ar){
			a.showData();
		}
	}
}