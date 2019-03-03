package com.sandhya.atmWallet.dbo.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sandhya.atmWallet.dbo.decl.IDBOUser;
import com.sandhya.atmWallet.models.decl.IUser;

public class DBOUser implements IDBOUser {
	private Connection con = null;

	public DBOUser() {
		DBConnection db = new DBConnection();
		con = db.getConnection();
	}

	@Override
	public IUser getUser(int userId) {
		PreparedStatement pStmt = null;
		ResultSet rs = null;
		IUser user = new com.sandhya.atmWallet.models.impl.User();
		try {
			pStmt = con.prepareStatement("select * from ? where userid = ?");
			pStmt.setString(1,IUser.ENTITY);
			pStmt.setInt(2, userId);
			rs = pStmt.executeQuery();
			while (rs.next()) {
				user.setUserId(rs.getInt("user_id"));
				user.setCity(rs.getString("city"));
				user.setUsername(rs.getString("username"));
				user.setEmail(rs.getString("email"));
				user.setFirstName(rs.getString("first_name"));
				user.setLastName(rs.getString("last_name"));
				user.setMobileNumber(rs.getString("moblile_number"));
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
		return user;
	}

	@Override
	public boolean addUser(IUser user) {
		PreparedStatement pStmt = null;
		int rs = 0;
		try {
			pStmt = con.prepareStatement("insert into ? (username,first_name,last_name,email,mobile_number,city) values(?,?,?,?,?,?)");
			pStmt.setString(1, IUser.ENTITY);
			pStmt.setString(2, user.getUsername());
			pStmt.setString(3, user.getFirstName());
			pStmt.setString(4, user.getLastName());
			pStmt.setString(5, user.getEmail());
			pStmt.setString(6, user.getMobileNumber());
			pStmt.setString(7, user.getCity());
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
	public int getUserId(String userName) {
		PreparedStatement pStmt = null;
		ResultSet rs = null;
		IUser user = new com.sandhya.atmWallet.models.impl.User();
		try {
			pStmt = con.prepareStatement("select user_id from ? where username = ?");
			pStmt.setString(1, IUser.ENTITY);
			pStmt.setString(2, userName);
			rs = pStmt.executeQuery();
			while (rs.next()) {
				user.setUserId(rs.getInt("user_id"));
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
		return user.getUserId();
	}

	@Override
	public boolean closeConnection() {
		if(con!=null) {
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
