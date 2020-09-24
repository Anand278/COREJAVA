
import java.util.Scanner;
class Employee{
	private static int empNo=0;
	private double salary;
	private static  double totalSalary=0;
	Employee(double salary1)
	{
		empNo++;
		salary=salary1;
		totalSalary=totalSalary+salary;
		
	}
	void show()
	{
		System.out.println("Total emp are = " + empNo +"  " + totalSalary);
		
	}
}

class EmpDemo{
	static public void main(String abc[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of emp");
		int count=sc.nextInt();
		Employee arr[]=new Employee[count];
		for(int i=0;i<arr.length;i++)
		{
		  System.out.println("Enter sal");
		  double saln=sc.nextDouble();
		  Employee e=new Employee(saln);
		  arr[i]=e;
		  //e.show();// show everytime after creating object
		}
	
	/*for(Employee a:arr)
		a.show();
	}*/
	arr[count-1].show();
}
}