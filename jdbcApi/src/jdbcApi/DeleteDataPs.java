package jdbcApi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteDataPs {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = sc.next();
		System.out.println("Enter course: ");
		String course = sc.next();
		System.out.println("Enter fees: ");
		float fees = sc.nextFloat();
		System.out.println("Enter rno: ");
		int rno = sc.nextInt();
		sc.close();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/javadb","anand","anand123");
		PreparedStatement ps = con.prepareStatement(
				"update student set name = ?, course = ?, fees = ? where rno = ?");
		
		ps.setString(1, name);
		ps.setString(2, course);
		ps.setFloat(3, fees);
		ps.setInt(4, rno);
		
		int i = ps.executeUpdate();
		con.close();
		System.out.println(i+" record updated");
	}
}

