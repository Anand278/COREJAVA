package collectionFramework1;

import java.util.TreeSet;

class Employee implements Comparable<Employee>{
	private int empId;
	private String empName;
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	@Override
	public String toString() {
		return  empId +" " + empName;
	}
//	@Override
//	public int compareTo(Employee o) {
//		return empId - o.empId;
//	}

	@Override
	public int compareTo(Employee o) {
		return empName.compareTo(o.empName);
	}

}

public class CollectionDemo {

	public static void main(String[] args) {
		TreeSet<Employee> a = new TreeSet<Employee>();
		a.add(new Employee(31, "Ram"));
		a.add(new Employee(13, "Rama"));
		a.add(new Employee(41, "Shiv"));
		a.add(new Employee(14, "Shiva"));
		a.add(new Employee(23, "Jay"));
		a.add(new Employee(31, "Jaya"));
		for(Employee e : a) {
			System.out.println(e);
		}
	}

}
