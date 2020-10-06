package CollectionPrac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CollectionDemo {

	public static void main(String[] args) {
		try {
			// Loading jdbc Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Creating jdbc Connection
				Connection con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/javadb","anand","anand123");
				//  creating statement 
				Statement s = con.createStatement();
				// executing query
				s.execute("create table student(rno int primary key, name varchar(35), course varchar(35),fees float)");
				//close connection
				con.close();
				System.out.println("Table created...");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
		e.printStackTrace();
		}
	}

}
