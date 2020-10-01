/*46.	Create a program to demonstrate the use of instanceof operator or secure reference down casting.*/

class Person{
	void getDetail(){
		System.out.println("Person Detail");
	}
	void getJob(){
		System.out.println("Person Job");
	}
}

class Employee extends Person{
	void getJob(){
		System.out.println("Employee Job");
	}
	void getDept(){
		System.out.println("Employee Dept");
	}
}

class InstanceOfDemo{
	public static void main(String[] args){
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Person p1 = new Person();
		Person p[] = {e1,e2,p1};
		for(Person a: p){
			if(a instanceof Employee){
				Employee e = (Employee)a;
				e.getJob();
			}
		}
	}
}