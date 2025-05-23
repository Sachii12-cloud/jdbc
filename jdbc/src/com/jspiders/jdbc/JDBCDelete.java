package com.jspiders.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDelete {
       
	private static Driver driver;
	private static Statement statement;
	private static Connection connection;
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		openConnection();
		statement = connection.createStatement();
		int rows = statement.executeUpdate("DELETE  FROM users WHERE id = 2");
		System.out.println(rows + "row(s) affected");
		closeConnection();
		
		
	}



	private static void openConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		driver = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?user=root&password=root");
		
		
		
	}
	private static void closeConnection() throws SQLException {
		if(statement != null)
			statement.close();
        if(connection != null)
        	connection.close();
        if(driver != null)
        	DriverManager.deregisterDriver(driver);
		
	}
}
