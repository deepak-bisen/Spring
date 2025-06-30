package dbcon;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	public static Connection getConection() {

		Connection conn = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mvc_db", "root", "root");
		} catch (Exception ex) {
			ex.getMessage();
			ex.printStackTrace();
		}

		return conn;
	}
}
