package com.sandhya.atmWallet.dbo.impl;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection implements com.sandhya.atmWallet.dbo.decl.DBConnection {
	private static final Properties PROPERTIES = new Properties();
	public DBConnection() {
		
		try {
			PROPERTIES.load(new FileReader(new File("config/db_config.properties")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private static String getConnectionString() {
		
		return "jdbc:mysql://" + PROPERTIES.getProperty("HOST")+ ":" + PROPERTIES.getProperty("PORTNUMBER")+ "/" + PROPERTIES.getProperty("DATABASE");
	}

	@Override
	public Connection getConnection() {
		Connection con = null;
		try {
			Class.forName(PROPERTIES.getProperty("DBDRIVER"));
			con = DriverManager.getConnection(DBConnection.getConnectionString(), PROPERTIES.getProperty("USERNAME"),
					PROPERTIES.getProperty("PASSWORD"));
			
		} catch (SQLException | ClassNotFoundException sql) {
			sql.printStackTrace();
			return con;
		}
		return con;
	}

	@Override
	public boolean closeConnection(Connection con) {
		try {
			con.close();
			return true;	
		}catch(Exception ex) {
			return false;
		}
	}

}




