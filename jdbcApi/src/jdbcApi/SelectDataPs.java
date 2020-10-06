package jdbcApi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectDataPs {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/javadb","anand","anand123");
		String q = "select * from student";
		PreparedStatement ps = con.prepareStatement(q);
		ResultSet s = ps.executeQuery();
		while(s.next()) {
			System.out.println(s.getInt("rno")+" "
					+s.getString("name")+" "
					+s.getString("course")+" "
					+s.getFloat("fees"));
		}
		con.close();
	}
}

