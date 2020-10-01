package file;

import java.io.*;


public class FileDemo14 {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(isr);
		System.out.println("Enter any text : ");
		String s = b.readLine();
		
		System.out.println(s);
	}

}
