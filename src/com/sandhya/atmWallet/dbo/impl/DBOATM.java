package com.sandhya.atmWallet.dbo.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sandhya.atmWallet.dbo.decl.IDBOATM;
import com.sandhya.atmWallet.models.decl.IATM;
import com.sandhya.atmWallet.models.impl.ATM;

public class DBOATM implements IDBOATM {
	private Connection con = null;

	public DBOATM() {
		DBConnection db = new DBConnection();
		con = db.getConnection();
	}

	@Override
	public IATM getATM(int userId, int pin) {
		PreparedStatement pStmt = null;
		ResultSet rs = null;
		IATM atm = new ATM();
		try {
			pStmt = con.prepareStatement("select * from atm where userid = ? and pinnum");
			//pStmt.setString(1,IATM.ENTITY);
			pStmt.setInt(1, userId);
			pStmt.setInt(2, pin);
			rs = pStmt.executeQuery();
			while (rs.next()) {
				atm.setUserId(rs.getInt("userid"));
				atm.setPin(rs.getInt("pinnum"));
				atm.setAtmNumber(rs.getString("atmnum"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				pStmt.close();
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return atm;
	}

	@Override
	public boolean setATM(IATM atm) {
		PreparedStatement pStmt = null;
		int rs = 0;
		try {
			pStmt = con.prepareStatement("insert into atm (atmnum,pinnum,userid) values(?,?,?)");
			//pStmt.setString(1, IATM.ENTITY);
			pStmt.setString(1, atm.getAtmNumber());
			pStmt.setInt(2, atm.getPin());
			pStmt.setInt(3, atm.getUserId());
			rs = pStmt.executeUpdate();
			if(rs>0) return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				pStmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}

	@Override
	public boolean closeConnection() {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}

}
