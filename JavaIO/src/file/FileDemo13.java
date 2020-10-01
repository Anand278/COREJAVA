package file;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo13 {

	public static void main(String[] args) throws IOException {
		FileWriter f = new FileWriter("d:\\javacore\\dirfile\\my.txt");
		BufferedWriter b = new BufferedWriter(f);
		String s = "This is my first file";
		b.write(s);
		b.flush();
		b.close();
		f.close();
		System.out.println("Success");
	}

}
