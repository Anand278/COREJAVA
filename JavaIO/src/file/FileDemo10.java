package file;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo10 {

	public static void main(String[] args) throws IOException {
		FileWriter f = new FileWriter("d:\\javacore\\dirfile\\my.txt");
		String s = "This is my first file";
		for(int i=0;i<s.length();i++) {
			f.write(s.charAt(i));
		}
		f.close();
		System.out.println("Success");
	}

}
