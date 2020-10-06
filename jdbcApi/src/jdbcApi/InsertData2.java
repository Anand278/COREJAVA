package jdbcApi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertData2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter roll no: ");
		int rno = sc.nextInt();
		System.out.println("Enter name: ");
		String name = sc.next();
		System.out.println("Enter Course: ");
		String course = sc.next();
		System.out.println("Enter Fees: ");
		float fees = sc.nextFloat();
		sc.close();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/javadb","anand","anand123");
		Statement s = con.createStatement();
				//"insert into student values(2,'rama','dac',999.98)");
		String q = "insert into student values("+rno+",'"+name+"','"+course+"',"+fees+")";
		System.out.println(q);
		int i = s.executeUpdate(q);
		con.close();
		System.out.println(i+" Record added");
	}
	

	
}



