package jdbcApi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rno: ");
		int rno = sc.nextInt();
		sc.close();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/javadb","anand","anand123");
		Statement s = con.createStatement();
		String q = "delete from student where rno = "+rno;
		System.out.println(q);
		int i = s.executeUpdate(q);
		System.out.println(i+" record deleted");
		con.close();
	}
}



