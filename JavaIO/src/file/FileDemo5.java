package file;

import java.io.FileInputStream;
import java.io.IOException;

public class FileDemo5 {

	public static void main(String[] args) throws IOException {
		FileInputStream f = new FileInputStream("d:\\javacore\\dirfile\\my.txt");
		int ch = -1;
		while((ch = f.read()) != -1) {
			System.out.print((char)ch);
		}
		f.close();
		System.out.println(" Success");
	}

}
