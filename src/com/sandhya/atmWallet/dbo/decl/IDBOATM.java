package com.sandhya.atmWallet.dbo.decl;

public interface IDBOATM {
	public abstract IDBOATM getATM(int user_id,int pin);
	public abstract boolean setATM(IDBOATM atm);
	public boolean closeConnection();
}
