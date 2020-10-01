package file;

import java.io.*;

class Employee implements Serializable{
	int empiId;
	String empName;
	public Employee(int empiId, String empName) {
		super();
		this.empiId = empiId;
		this.empName = empName;
	}
	@Override
	public String toString() {
		return empiId + " " + empName;
	}
	
}

public class FileDemo8 {

	public static void main(String[] args) throws IOException {
		FileOutputStream f = new FileOutputStream("d:\\javacore\\dirfile\\my.txt");
		
		ObjectOutputStream o = new ObjectOutputStream(f);
		o.writeObject(new Employee(101,"Shiv"));
		f.close();
		System.out.println(" Success");
	}

}
