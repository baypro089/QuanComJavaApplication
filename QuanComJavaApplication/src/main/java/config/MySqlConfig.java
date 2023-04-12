package main.java.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConfig {
	
	public static Connection getConnection()
	        throws ClassNotFoundException, SQLException {
	    String hostName = "localhost";
	    String dbName = "quancom";
	    String userName = "root";
	    String password = "gametop113";
	    return getConnection(hostName, dbName, userName, password);
	}

	public static Connection getConnection(String hostName, String dbName,
	        String userName, String password) throws SQLException,
	        ClassNotFoundException {
	    // Cấu trúc URL Connection dành cho MySQL
	    // Ví dụ: jdbc:mysql://localhost:3306/simplehr
	    String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;

	    Connection conn = DriverManager.getConnection(connectionURL, userName,
	            password);
	    return conn;
	}
    public static void main(String[] args) {
    	Connection connection;
		try {
			connection = MySqlConfig.getConnection();
			if(connection == null) {
				System.out.println("That bai");
			}
			else {
				System.out.println("Thanh cong");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
	}
}
