package jdbcApi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectData2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/javadb","anand","anand123");
		Statement s = con.createStatement();
		String q = "select * from student";
		System.out.println(q);
		ResultSet rs = s.executeQuery(q);
		while(rs.next()) {
//			System.out.println(rs.getInt(1)+" "
//					+rs.getString(2)+" "
//					+rs.getString(3)+" "
//					+rs.getFloat(4));
			System.out.println(rs.getInt("rno")+" "
					+rs.getString("name")+" "
					+rs.getString("course")+" "
					+rs.getFloat("fees"));
		}
		
		System.out.println("===============================");
		rs = s.executeQuery(q);
		while(rs.next()) {
//			System.out.println(rs.getInt(1)+" "
//					+rs.getString(2)+" "
//					+rs.getString(3)+" "
//					+rs.getFloat(4));
			System.out.println(rs.getInt("rno")+" "
					+rs.getString("name")+" "
					+rs.getString("course")+" "
					+rs.getFloat("fees"));
		}
		con.close();
	}
}

