package com.sandhya.atmWallet.dbo.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sandhya.atmWallet.dbo.decl.IDBOUser;
import com.sandhya.atmWallet.models.decl.IUser;
import com.sandhya.atmWallet.models.impl.User;

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
		IUser user = new User();
		try {
			pStmt = con.prepareStatement("select * from user where user_id = ?");
			//pStmt.setString(1,IUser.ENTITY);
			pStmt.setInt(1, userId);
			rs = pStmt.executeQuery();
			while (rs.next()) {
				user.setUserId(rs.getInt("userid"));
				user.setCity(rs.getString("city"));
				user.setUsername(rs.getString("username"));
				user.setEmail(rs.getString("email"));
				user.setFirstName(rs.getString("firstname"));
				user.setLastName(rs.getString("lastname"));
				user.setMobileNumber(rs.getString("mobilenumber"));
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
			pStmt = con.prepareStatement("insert into user (username,firstname,lastname,email,mobilenumber,city) values(?,?,?,?,?,?);");
			//pStmt.setString(1, IUser.ENTITY);
			pStmt.setString(1, user.getUsername());
			pStmt.setString(2, user.getFirstName());
			pStmt.setString(3, user.getLastName());
			pStmt.setString(4, user.getEmail());
			pStmt.setString(5, user.getMobileNumber());
			pStmt.setString(6, user.getCity());
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
		IUser user = new User();
		try {
			pStmt = con.prepareStatement("select userid from user where username = ?");
			//pStmt.setString(1, IUser.ENTITY);
			pStmt.setString(1, userName);
			rs = pStmt.executeQuery();
			while (rs.next()) {
				user.setUserId(rs.getInt("userid"));
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
