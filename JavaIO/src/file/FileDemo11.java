package file;

import java.io.FileReader;
import java.io.IOException;

public class FileDemo11 {

	public static void main(String[] args) throws IOException {
		FileReader f = new FileReader("d:\\javacore\\dirfile\\my.txt");
		int ch = -1;
		while((ch = f.read()) != -1) {
			System.out.print((char)ch);
		}
		f.close();
		System.out.println(" Success");
	}

}
