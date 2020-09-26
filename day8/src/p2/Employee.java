package p2;
class Emploee{
	private int empId;
	private String empName;
	public Emploee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	
	@Override
	public String toString(){
			return empId+" "+empName;
	} 
	
}
public class Employee {

	public static void main(String[] args) {
		Emploee e = new Emploee(1, "anand");
		System.out.println(e);
	}

}
