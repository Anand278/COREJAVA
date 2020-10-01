package file;

import java.io.*;


public class FileDemo6 {

	public static void main(String[] args) throws IOException {
		FileOutputStream f = new FileOutputStream("d:\\javacore\\dirfile\\my.txt");
		
		DataOutputStream d = new DataOutputStream(f);
		
		d.writeInt(123);
		d.writeUTF("RAM");
		d.writeDouble(123.45);
		
		
		d.close();
		f.close();
		System.out.println(" Success");
	}

}
