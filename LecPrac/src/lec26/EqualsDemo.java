package lec26;

class Employee{
	private int empId;
	private String empName;
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	@Override
	public String toString() {
		return empId + " " + empName;
	}
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		if(obj instanceof Employee) {
		Employee emp = (Employee)obj;
		return empId == emp.empId;
		}
		return false;
	} 
	
}

public class EqualsDemo {

	public static void main(String[] args) {
		Employee e = new Employee(101, "Ram");
		Employee e1 = e;
		Employee e2 = new Employee(101, "Ram");
		Employee e3 = new Employee(102, "Shiv");
		
		System.out.println("e.equals(e1) "+e.equals(e1));
		System.out.println("e.equals(e2) "+e.equals(e2));
		System.out.println("e.equals(e3) "+e.equals(e3));

	}

}
