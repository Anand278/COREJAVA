/*
44.	Create three classes
-	Faculty with two data members facultyId and salary and two methods, 
	one intput() method for accepting facultyId as input and another printSalary() to print salary.
-	FullTimeFaculty that inherits class Faculty with two data members’ basicSalary and allowance. 
	Override input() method in this class that calls super class inut() method 
	and accepts basicSalary and allowance as input. 
	Salary should not be accepted as input but should be calculated using formula (basicSalary + allowance)
-	PartTimeFaculty that inherits class Faculty with two data members’ workingHours, ratePerHour. 
	Override input() method in this class that calls super class inut() method
	 and accepts workingHours and ratePerHour as input. Salary should not be accepted as input 
	 but should be calculated using formula ( workingHour * ratePerHour )
*/

class Faculty {
	int facultyId;
	int salary;
	void input(int facultyId){
		this.facultyId = facultyId;
	}
	void printSalary(){
		System.out.println("salary = "+salary);
	}
}

class FullTimeFaculty extends Faculty{
	int basicSalary;
	int allowance;
	
	void input(int facultyId, int basicSalary, int allowance){
		super.input(facultyId);
		this.basicSalary = basicSalary;
		this.allowance = allowance;
		this.salary = basicSalary + allowance;
	}
}

class PartTimeFaculty extends Faculty{
	int workingHour;
	int ratePerHour;
	
	void input(int facultyId, int workingHour, int ratePerHour){
		super.input(facultyId);
		this.workingHour = workingHour;
		this.ratePerHour = ratePerHour;
		this.salary = workingHour*ratePerHour;
	}
}

class FacultyDemo{
	public static void main(String[] args){
		FullTimeFaculty ft = new FullTimeFaculty();
		ft.input(1,10000,2000);
		ft.printSalary();
		
		PartTimeFaculty pt = new PartTimeFaculty();
		pt.input(2,100,20);
		pt.printSalary();
	}
}