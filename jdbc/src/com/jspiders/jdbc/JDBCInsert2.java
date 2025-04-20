package com.jspiders.jdbc;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Driver;



public class JDBCInsert2 {
	
	private static Driver driver;
	private static Connection connection;
	private static PreparedStatement preparedStatement;
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		try {
			openConnection();
			preparedStatement = connection.prepareStatement("INSERT INTO users VALUES(?, ?, ?, ?, ?)");
			preparedStatement.setInt(1 ,3);
			preparedStatement.setString(2, "Kumar");
			preparedStatement.setString(3, "kumar@gmail.com");
			preparedStatement.setLong(4, 4867876787l);
			preparedStatement.setString(5, "kumar@1234");
			int rows = preparedStatement.executeUpdate();
			System.out.println(rows + "row(s) affected");
		}finally {
	        closeConnection();
		}
		
		
	}

	private static void openConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		driver = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?user=root&password=root");
		
		
	
		
	}

	private static void closeConnection() throws SQLException {
		if(preparedStatement != null)
			preparedStatement.close();
		if(connection != null)
			connection.close();
		if(driver != null)
			DriverManager.deregisterDriver(driver);
			
	
		
	}
	
	

}
