package com.sandhya.atmWallet.dbo.decl;

import java.sql.Connection;

public interface DBConnection {
	public Connection getConnection();
	public boolean closeConnection(Connection con);
}
