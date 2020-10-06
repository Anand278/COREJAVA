package lec26;

import java.util.*;

interface StudentFee
{
	int getFee() throws Exception;
}
class StudentChild implements StudentFee{
	private int fee;
	public int getFee() throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter fee : ");
		fee=sc.nextInt();
		if(fee<=0 || fee >100000)
		{
			throw new Exception("Invalid fee");
		}
		return fee;
		}
}
class Voterage extends Exception{
	private int voterId;
	private String name;
	private int age;
	Voterage(){
		super("Invalid age for voter..");
	}
	Voterage(int voterId, String name, int age){
		this.voterId=voterId;
		this.name=name;
		this.age=age;
	}
}
public class StudentDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
			StudentChild c=new StudentChild();
			System.out.println(c.getFee());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
sc.close();			
	}

}

