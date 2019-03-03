package com.sandhya.atmWallet.dbo.decl;

import com.sandhya.atmWallet.models.decl.IATM;

public interface IDBOATM {
	public abstract IATM getATM(int user_id,int pin);
	public abstract boolean setATM(IATM atm);
	public boolean closeConnection();
}
