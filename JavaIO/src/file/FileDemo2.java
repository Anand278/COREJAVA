package file;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {

	public static void main(String[] args) throws IOException {
		File f = new File("D:\\javacore\\dirfile\\abc.txt");
		System.out.println(f.exists());
		System.out.println(f.isDirectory());
		System.out.println(f.isFile());
		boolean b = f.createNewFile();
		System.out.println(b);
		System.out.println(f.length());

	}

}
