package com.sandhya.atmWallet.models.decl;

public interface IATM {
	public static final String ENTITY = "atm";
	public String getAtmNumber();

	public void setAtmNumber(String atmNumber);

	public int getPin();

	public void setPin(int pin);

	public int getUserId();

	public void setUserId(int userId);
}
