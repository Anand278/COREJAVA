/*
	53.	Input data exactly in the following format, and print sum of all integer values.
	“67, 89, 23, 67, 12, 55, 66”.   (Hint use String class split method and Integer class parseInt method) .
 */
 
 import java.util.*;
 
public class SumString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("s");
		String s = sc.nextLine();
		String str[] = s.split(",");
	
		sc.close();
		int size = str.length;
		int sum =0;
		int numArray[] =  new int[size];
		
		for(int i=0;i<str.length;i++) {
			String var = str[i];
			numArray[i] = Integer.parseInt(var);
		}
		for(int j=0;j<numArray.length;j++) {
			sum += numArray[j];
		}
		System.out.println("SumString : "+sum);
	}

}
