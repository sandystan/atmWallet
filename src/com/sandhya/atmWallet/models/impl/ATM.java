package com.sandhya.atmWallet.models.impl;

import java.io.Serializable;

public class ATM implements Serializable, com.sandhya.atmWallet.models.decl.ATM {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5176132363384211539L;
	/**
	 * Primary Key
	 */
	private long atmNumber;
	private int pin;
	/**
	 * Reference key to User
	 */
	private int userId;

	public long getAtmNumber() {
		return atmNumber;
	}

	public void setAtmNumber(long atmNumber) {
		this.atmNumber = atmNumber;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
