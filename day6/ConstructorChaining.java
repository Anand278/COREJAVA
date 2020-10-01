/*	47.	Create a program to demonstrate constructor chaining.	*/

class Person{
	int id;
	Person(){
		System.out.println("no args constructor person");
	}
	Person(int i){
		this.id = i;
		System.out.println("parameterised constructor person");
	}
}

class Employee extends Person{
	Employee(){
		System.out.println("no args constructor Employee");
	}
	Employee(int i, int j){
	super(i);
		System.out.println("parameterised constructor Employee");
	}
}

class Manager extends Employee{
	Manager(){
		System.out.println("no args constructor Manager");
	}
	Manager(int i, int j, int k){
		System.out.println("parameterised constructor Manager");
	}
}

class ConstructorDemo{
	public static void main(String[] args){
		Manager m = new Manager(1,2,3);
	}
	
	
}