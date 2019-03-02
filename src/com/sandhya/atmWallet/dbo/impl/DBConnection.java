package com.sandhya.atmWallet.dbo.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection implements com.sandhya.atmWallet.dbo.decl.DBConnection {

	private final static String USERNAME = "root";
	private final static String PASSWORD = "sandystan";
	private final static String PORTNUMBER = "3306";
	private final static String HOST = "localhost";
	private final static String DATABASE = "atmwallet";
	private final static String DBDRIVER = "com.mysql.cj.jdbc.Driver";

	private static String getConnectionString() {
		return "jdbc:mysql://" + DBConnection.HOST + ":" + DBConnection.PORTNUMBER + "/" + DBConnection.DATABASE;
	}

	@Override
	public Connection getConnection() {
		Connection con = null;
		try {
			Class.forName(DBDRIVER);
			con = DriverManager.getConnection(DBConnection.getConnectionString(), DBConnection.USERNAME,
					DBConnection.PASSWORD);
			
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
