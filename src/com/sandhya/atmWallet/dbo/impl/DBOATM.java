package com.sandhya.atmWallet.dbo.impl;

import java.sql.Connection;

import com.sandhya.atmWallet.dbo.decl.IDBOATM;

public class DBOATM implements IDBOATM {
	private Connection con = null;

	public DBOATM() {
		DBConnection db = new DBConnection();
		con = db.getConnection();
	}

	@Override
	public IDBOATM getATM(int user_id, int pin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean setATM(IDBOATM atm) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean closeConnection() {
		// TODO Auto-generated method stub
		return false;
	}

}
