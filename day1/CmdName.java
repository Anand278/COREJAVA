//Write a program that takes user’s name as command line argument and prints Welcome <entered user name>.

class CmdName{
	public static void main(String args[]){
		String name = args[0];
		System.out.println("Welcome "+name);
	}
}
