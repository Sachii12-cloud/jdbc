package com.jspiders.jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateDatabase {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Load the driver class
		Class.forName("com.mysql.cj.jdbc");
		
		Driver driver = new com.mysql.cj.jdbc.Driver();
		
		//register the driver
		
        DriverManager.registerDriver(driver);
        
        //open connection 
        
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
        
        //create stament
        
        Statement statement =  connection.createStatement();
        
        //execute stmt
        
        boolean res = statement.execute("CREATE DATABASE test");
        
        //processs the result
        
        System.out.println(res);
        System.out.println("Database is Created");
        
        
        //close the conn
        
        statement.close();
        connection.close();
        
        //deregister the driver 
        
        DriverManager.deregisterDriver(driver);
        
	}
	

}

