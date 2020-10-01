package file;

import java.io.*;

public class FileDemo9 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream f = new FileInputStream("d:\\javacore\\dirfile\\my.txt");
		
		ObjectInputStream o = new ObjectInputStream(f);
		
		Employee emp = (Employee) o.readObject();
		System.out.println(emp);
		f.close();
		System.out.println(" Success");
	}

}
