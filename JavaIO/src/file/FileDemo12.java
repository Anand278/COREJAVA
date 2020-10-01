package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileDemo12 {

	public static void main(String[] args) throws IOException {
		FileReader f = new FileReader("d:\\javacore\\dirfile\\my.txt");
		BufferedReader b = new BufferedReader(f);
		String s=null;
		while((s=b.readLine()) !=null) {
			System.out.println(s);
		}
		b.close();
		f.close();
		System.out.println(" Success");
	}

}
