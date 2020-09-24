/*
	39.	Create class Product with three data members (pid, price, quantity) and 
	parameterized constructor that takes values for all three data members.  
	Create a main method in different class (say ProductDemo) and perform following task:
	a. Accept information for five Product objects from user and store objects in an array
	b. Find pid of product with highest price. 
	c. Create a static method (with array of product’s object as argument) in Product class to calculate and
	return total amount spent on all products. 
	( amount spent on single product = price of product * quantity of product )
*/

import java.util.*;

class Product{
	private int pid;
	private int price;
	private int quantity;
	static int amt;
	
	Product(int pid, int price, int qty){
		this.pid = pid;
		this.price = price;
		this.quantity = qty;
	}
	
	static void display(){
		this.amt = price * quantity;
		System.out.println("Total Amount spent on all product : "+amt);
		//return amt;
	}
}
	
class ProductDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Person[] ar = new Person[5];
		//int tamt;
		for(int i=0;i<ar.length;i++){
			System.out.println("Enter pid, price, quantity");
			int id = sc.nextInt();
			int p = sc.nextInt();
			int qty = sc.nextInt();
			Person p = new Person(id, p, qty);
			ar[i] = p;
			
		}
		ar[4].display();
		//not completed yet...
	}
}