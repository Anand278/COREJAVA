package collectionFramework1;

import java.util.Comparator;
import java.util.TreeSet;

class Employee2{
	int empId;
	String empName;
	public Employee2(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	@Override
	public String toString() {
		return  empId +" " + empName;
	}

}

class EmployeeComparator implements Comparator<Employee2>{

	@Override
	public int compare(Employee2 o1, Employee2 o2) {
		return o1.empId - o2.empId;
	}
	
}

class EmployeeComparator1 implements Comparator<Employee2>{

	@Override
	public int compare(Employee2 o1, Employee2 o2) {
		return o1.empName.compareTo(o2.empName);
	}
	
}

public class CollectionDemo2 {

	public static void main(String[] args) {
		TreeSet<Employee2> a = new TreeSet<Employee2>(new EmployeeComparator());
		a.add(new Employee2(31, "Ram"));
		a.add(new Employee2(13, "Rama"));
		a.add(new Employee2(41, "Shiv"));
		a.add(new Employee2(14, "Shiva"));
		a.add(new Employee2(23, "Jay"));
		a.add(new Employee2(31, "Jaya"));
		for(Employee2 e : a) {
			System.out.println(e);
		}
		System.out.println("===============================================");
		 a = new TreeSet<Employee2>(new EmployeeComparator1());
			a.add(new Employee2(31, "Ram"));
			a.add(new Employee2(13, "Rama"));
			a.add(new Employee2(41, "Shiv"));
			a.add(new Employee2(14, "Shiva"));
			a.add(new Employee2(23, "Jay"));
			a.add(new Employee2(31, "Jaya"));
			for(Employee2 e : a) {
				System.out.println(e);
			}
	}

}
