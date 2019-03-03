package com.sandhya.atmWallet.models.decl;

public interface IATM {
	public static final String ENTITY = "atm";
	public long getAtmNumber();

	public void setAtmNumber(long atmNumber);

	public int getPin();

	public void setPin(int pin);

	public int getUserId();

	public void setUserId(int userId);
}
