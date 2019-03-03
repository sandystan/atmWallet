package com.sandhya.atmWallet.dbo.decl;

import com.sandhya.atmWallet.models.decl.IUser;

public interface IDBOUser {
	public IUser getUser(int userId);
	public boolean addUser(IUser user);
	public int getUserId(String userName);
	public boolean closeConnection();
}
