package file;

import java.io.File;
import java.io.IOException;

public class FileDemo3 {

	public static void main(String[] args) throws IOException {
		File f = new File("D:\\javacore");
	//	String[] files = f.list();
	//	String[] files = f.list((ff,nn)-> nn.endsWith("txt"));
		File files[] = f.listFiles(ff -> ff.isDirectory());
		
		for(File a: files) {
			System.out.println(a);
		}
	}

}
