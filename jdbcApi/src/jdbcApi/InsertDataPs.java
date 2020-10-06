package jdbcApi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertDataPs {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rno: ");
		int rno = sc.nextInt();
		System.out.println("Enter name: ");
		String name = sc.next();
		System.out.println("Enter course: ");
		String course = sc.next();
		System.out.println("Enter fees: ");
		float fees = sc.nextFloat();
		sc.close();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/javadb","anand","anand123");
		PreparedStatement ps = con.prepareStatement(
				"insert into student values(?,?,?,?)");
		ps.setInt(1, rno);
		ps.setString(2, name);
		ps.setString(3, course);
		ps.setFloat(4, fees);
		
		int i = ps.executeUpdate();
		con.close();
		System.out.println(i+" record Added");
	}
}