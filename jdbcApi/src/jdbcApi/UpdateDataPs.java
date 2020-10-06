package jdbcApi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateDataPs {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rno: ");
		int rno = sc.nextInt();
		sc.close();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/javadb","anand","anand123");
		PreparedStatement ps = con.prepareStatement(
				"delete from student where rno = ?");
		ps.setInt(1, rno);
		int i = ps.executeUpdate();
		con.close();
		System.out.println(i+" record deleted.");
	}
}

