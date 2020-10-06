package jdbcApi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {

	public static void main(String[] args) throws ClassNotFoundException,
	SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/javadb","anand","anand123");
		
		Statement s = con.createStatement();
		
		int i= s.executeUpdate(
				"insert into student values(2,'rama','dac',999.98)");
		
		con.close();
		System.out.println(i+" record added");
		
	}
}