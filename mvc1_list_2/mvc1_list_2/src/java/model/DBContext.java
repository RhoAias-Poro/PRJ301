package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBContext {

	public Connection connection;

	public DBContext() {
		try {
			// Change the username, password, and url to connect to your own database
			String username = "sa";
			String password = "sa";
			String url = "jdbc:sqlserver://localhost:1433;databaseName=StudentDB2";
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connection = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException ex) {
			System.err.println("SQL Server JDBC Driver not found");
		} catch (SQLException ex) {
			System.err.println("Failed to connect to the database: " + ex.getMessage());
		}
	}

	public Connection getConnection() {
		return connection;
	}

	public static void main(String[] args) {
		DBContext db = new DBContext();
		System.out.println(db.getConnection());
	}
}
