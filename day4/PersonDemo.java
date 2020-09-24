/*	
	37.	Create a class Person with properties (name and age) with following features. 
	a.	Default age of person should be 18.
	b.	A person object can be initialized with name and age.
	c.	Method to display name and age of person
	Create another class PersonDemo ( main class ) that demonstrates the 
	functionalities of Person class by creating Person object and calling methods.
*/

import java.util.Scanner;

class Person{
	private int age;
	private String name;
	
	Person(String name){
		age = 18;
		this.name = name;
	}
	/*
	Person(int age, String name){
		this.age = age;
		this.name = name;
	}
	*/
	void display(){
		System.out.println("Person age :- "+age);
		System.out.println("Person name :- "+name);
	}
}

class PersonDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		/*System.out.print("Enter age : ");
		int age = sc.nextInt();*/
		System.out.print("Enter name : ");
		String name = sc.nextLine();
		
		Person p = new Person(name);
		p.display();
		
	}
}
