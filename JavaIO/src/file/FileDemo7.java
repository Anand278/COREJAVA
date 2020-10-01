package file;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FileDemo7 {

	public static void main(String[] args) throws IOException {
		FileInputStream f = new FileInputStream("d:\\javacore\\dirfile\\my.txt");
		
		DataInputStream d = new DataInputStream(f);
		
		int i = d.readInt();
		String s = d.readUTF();
		double dd = d.readDouble();
		
		f.close();
		System.out.println(i+" "+s+" "+dd);
	}

}
