package file;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;


public class FileDemo16 {

	public static void main(String[] args) throws IOException {
		Path p = Paths.get("dirfile\\dir\\p1\\my.txt");
		System.out.println(p.toString());
		System.out.println(p.isAbsolute());
		System.out.println(p.getFileName());
		System.out.println(p.getNameCount());
		System.out.println(p.getRoot());
		System.out.println(p.getParent());
		System.out.println(p.getName(1));
		
		System.out.println(p.toAbsolutePath().toString());
		
		System.out.println(p.toFile().exists());
	}

}
